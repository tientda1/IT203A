package Ex4;

public class EmergencyPatient {
    private String id;
    private String name;
    private int priority; // 1: Cấp cứu (Ưu tiên cao), 2: Thông thường (Ưu tiên thấp)

    // Phương thức khởi tạo
    public EmergencyPatient(String id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }

    // Getters và Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getPriority() { return priority; }
    public void setPriority(int priority) { this.priority = priority; }

    // Hiển thị thông tin bệnh nhân
    @Override
    public String toString() {
        String priorityStr = (priority == 1) ? "[CẤP CỨU]" : "[THÔNG THƯỜNG]";
        return String.format("%s Bệnh nhân: %s (ID: %s)", priorityStr, name, id);
    }
}
