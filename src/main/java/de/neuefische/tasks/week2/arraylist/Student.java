package de.neuefische.tasks.week2.arraylist;

public class Student {

    private String fullName;
    private int id;

    public Student(String fullName, int id) {
        this.fullName = fullName;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", id=" + id +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
