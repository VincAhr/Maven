package de.neuefische.tasks.week2.arraylist;

import java.util.List;

public class StudentDB {

    private List<Student> students;

    public StudentDB ( List<Student> students){
        this.students = students;
    }

    public  List<Student> list (){
    return students;
    }

    public Student randomStudent() {
        int maxIndex = students.size() - 1;
        return students.get((int) (Math.random() * maxIndex));
    }


    @Override
    public String toString() {
        String result = "[";

        for (int i = 0; i < students.size(); i++) {
            result += students.get(i);
            if (i < students.size() -1)  {
                result += ", ";
            }
        }

        result += "]";

        return result;
    }

    public void add(Student newStudent) {
        students.add(newStudent);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}


