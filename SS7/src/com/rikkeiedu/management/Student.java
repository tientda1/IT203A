package com.rikkeiedu.management;

public class Student {
    public static final String SCHOOL_NAME = "Rikkei Academy";
    private static int count = 0;

    private final int id;
    private String fullName;
    private double score;
    private String className;

    public Student(String fullName, double score, String className) {
        this.id = count++;
        this.fullName = fullName;
        this.score = score;
        this.className = className;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void displayInfo() {
        System.out.printf("| ID: %-3d | Tên: %-20s | Lớp: %-10s | Điểm: %-5.2f |\n",
                this.id, this.fullName, this.className, this.score);
    }
}