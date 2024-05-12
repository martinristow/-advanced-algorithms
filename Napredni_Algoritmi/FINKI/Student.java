package Napredni_Algoritmi.FINKI;

public class Student {
    private int getId;
    private String students;

    public Student(int getId, String students) {
        this.getId = getId;
        this.students = students;
    }

    @Override
    public String toString() {
        return "Student{" +
                "getId=" + getId +
                ", students='" + students + '\'' +
                '}';
    }

    public int getGetId() {
        return getId;
    }

    public void setGetId(int getId) {
        this.getId = getId;
    }

    public String getStudents() {
        return students;
    }

    public void setStudents(String students) {
        this.students = students;
    }
}
