package com.patterns;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class_Iterator implements Iterable<Student> {
    private final List<Student> students = new ArrayList<>();

    public Class_Iterator() {
        students.add(new Student("王二狗", 28));
        students.add(new Student("牛翠花", 20));
        students.add(new Student("林蛋大", 29));
    }

    public boolean addStudent(Student student){
        return students.add(student);
    }

    public boolean removeStudent(Student student){
        return students.remove(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<Student> {

        int index = 0;

        @Override
        public boolean hasNext() {
            if (index < students.size()) {
                return true;
            }
            return false;
        }

        @Override
        public Student next() {
            Student student = students.get(index);
            index++;
            return student;
        }
    }
}

class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}



