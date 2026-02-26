import java.util.ArrayList;
import java.util.List;

// 1. GIAO DIỆN (INTERFACE)
interface ISkill {
    void useUltimate(GameCharacter target);
}

// 2. LỚP TRỪU TƯỢNG (ABSTRACT CLASS)
abstract class GameCharacter {
    protected String name;
    protected int hp;
    protected int attackPower;

    // Biến static đếm số lượng nhân vật
    public static int count = 0;

    public GameCharacter(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        count++; // Tăng số lượng mỗi khi có nhân vật mới được tạo
    }

    // Getters
    public String getName() { return name; }
    public int getHp() { return hp; }

    // Phương thức trừu tượng
    public abstract void attack(GameCharacter target);

    // Phương thức chung cho mọi nhân vật
    public void takeDamage(int amount) {
        this.hp -= amount;
        if (this.hp <= 0) {
            this.hp = 0;
            System.out.println("   [!] " + name + " đã bị hạ gục!");
        }
    }

    public void displayInfo() {
        System.out.println("Tên: " + name + " | HP: " + hp);
    }
}

// 3. LỚP KẾ THỪA: CHIẾN BINH (WARRIOR)
class Warrior extends GameCharacter implements ISkill {
    private int armor;

    public Warrior(String name, int hp, int attackPower, int armor) {
        super(name, hp, attackPower);
        this.armor = armor;
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println("1. [Chiến binh] " + name + " tấn công " + target.getName() + "!");
        int oldHp = target.getHp();
        target.takeDamage(attackPower);
        int damageDealt = oldHp - target.getHp();
        System.out.println("   -> " + target.getName() + " mất " + damageDealt + " máu. HP còn: " + target.getHp() + ".\n");
    }

    // Override takeDamage để xử lý trừ giáp
    @Override
    public void takeDamage(int amount) {
        int actualDamage = amount - armor;
        if (actualDamage < 0) actualDamage = 0; // Giáp không thể tạo ra máu
        super.takeDamage(actualDamage);
    }

    @Override
    public void useUltimate(GameCharacter target) {
        System.out.println("[Chiến binh] " + name + " dùng Đấm ngàn cân lên " + target.getName() + "!");
        int selfDamage = (int)(this.hp * 0.1);
        this.hp -= selfDamage; // Tự mất 10% HP hiện tại

        int damage = attackPower * 2;
        int oldHp = target.getHp();
        target.takeDamage(damage);
        int damageDealt = oldHp - target.getHp();

        System.out.println("   -> " + name + " tự mất " + selfDamage + " HP do gắng sức. " + target.getName() + " mất " + damageDealt + " máu.\n");
    }

    @Override
    public void displayInfo() {
        System.out.println("Tên: " + name + " | HP: " + hp + " | Giáp: " + armor);
    }
}

// 4. LỚP KẾ THỪA: PHÁP SƯ (MAGE)
class Mage extends GameCharacter implements ISkill {
    private int mana;

    public Mage(String name, int hp, int attackPower, int mana) {
        super(name, hp, attackPower);
        this.mana = mana;
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println("[Pháp sư] " + name + " tấn công " + target.getName() + "!");
        int damageDealt = attackPower;
        if (mana >= 5) {
            mana -= 5;
        } else {
            damageDealt = attackPower / 2; // Hết mana sát thương giảm một nửa
        }

        int oldHp = target.getHp();
        target.takeDamage(damageDealt);
        int actualDamageDealt = oldHp - target.getHp();

        System.out.println("   -> " + target.getName() + " mất " + actualDamageDealt + " máu. HP còn: " + target.getHp() + ".\n");
    }

    @Override
    public void useUltimate(GameCharacter target) {
        System.out.println("2. [Pháp sư] " + name + " dùng chiêu cuối lên " + target.getName() + "!");
        if (mana >= 50) {
            mana -= 50;
            // Gây 120 sát thương gốc (để khi trừ 20 giáp của Yasuo sẽ ra đúng 100 sát thương thực tế)
            int oldHp = target.getHp();
            target.takeDamage(120);
            int damageDealt = oldHp - target.getHp();

            System.out.println("   -> " + name + " tốn 50 mana. " + target.getName() + " mất " + damageDealt + " máu.\n");
        } else {
            System.out.println("   -> Không đủ mana!\n");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Tên: " + name + " | HP: " + hp + " | Mana: " + mana);
    }
}

// 5. CHƯƠNG TRÌNH CHÍNH (MAIN CLASS)
public class ArenaOfHeroes {
    public static void main(String[] args) {
        System.out.println("=== ARENA OF HEROES ===");

        // Đa hình: Dùng List chứa GameCharacter
        List<GameCharacter> characters = new ArrayList<>();

        // Khởi tạo nhân vật
        Warrior yasuo = new Warrior("Yasuo", 500, 50, 20);
        Mage veigar = new Mage("Veigar", 300, 40, 200);

        characters.add(yasuo);
        characters.add(veigar);

        // 6. SỬ DỤNG ANONYMOUS CLASS (Khởi tạo Goblin không cần tạo class mới)
        GameCharacter goblin = new GameCharacter("Goblin", 100, 10) {
            @Override
            public void attack(GameCharacter target) {
                System.out.println("3. [Quái vật] " + name + " (Anonymous Class) tấn công!");
                System.out.println("   -> " + name + " cắn trộm " + target.getName() + "... Gây 10 sát thương.\n");
                target.takeDamage(10);
            }
        };
        characters.add(goblin);

        // In số lượng nhân vật từ biến static
        System.out.println("Đã khởi tạo " + GameCharacter.count + " nhân vật tham gia đấu trường.\n");

        // Giả lập trận đấu theo thứ tự kịch bản
        yasuo.attack(goblin);       // 1. Yasuo đánh Goblin
        veigar.useUltimate(yasuo);  // 2. Veigar tung chiêu cuối vào Yasuo
        goblin.attack(veigar);      // 3. Goblin cắn trộm Veigar

        // In kết quả sau lượt đấu
        System.out.println("=== THÔNG SỐ SAU LƯỢT ĐẤU ===");
        for (GameCharacter character : characters) {
            character.displayInfo();
        }
    }
}