package Napredni_Algoritmi.FINKI;

import java.util.HashMap;

public class SLLKompanija {

    public static HashMap<Integer,Student> buildMap(Student[] students){
        HashMap<Integer,Student>map=new HashMap<Integer, Student>();
        for(Student s : students){
            map.put(s.getGetId(),s);
            return map;
        }
        return null;
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "John");
        Student student2 = new Student(2, "Alice");
        Student student3 = new Student(3, "Bob");

        // Ставете ги студентите во низа
        Student[] students = {student1, student2, student3};

        // Извикајте методот buildMap за креирање на мапа
        HashMap<Integer, Student> studentMap = buildMap(students);

        // Проверете дали мапата ги содржи студентите
        System.out.println(studentMap.containsKey(1)); // Треба да врати true
        System.out.println(studentMap.containsKey(2)); // Треба да врати true
        System.out.println(studentMap.containsKey(3)); // Треба да врати true

        // Проверете дали мапата ги содржи студентите со невалидни идентификации
        System.out.println(studentMap.containsKey(4)); // Треба да врати false
        System.out.println(studentMap.containsKey(5)); // Треба да врати false

        // Проверете дали мапата ги содржи соодветните студенти
        System.out.println(studentMap.get(1).getStudents()); // Треба да врати "John"
        System.out.println(studentMap.get(2).getStudents()); // Треба да врати "Alice"
        System.out.println(studentMap.get(3).getStudents()); // Треба да врати "Bob"
    }
}


