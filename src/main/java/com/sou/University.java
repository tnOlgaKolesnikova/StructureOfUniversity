package com.sou;

import java.util.ArrayList;

public class University {
    private ArrayList<Department> departmentsArr;
    private ArrayList<Student> studentsArr;
    public String name;
    public String address;
    public String phone;
    private int newStudentId;

    public University(String name, String address, String phone) {
        this.newStudentId = 0;
        this.departmentsArr = new ArrayList<>();
        this.studentsArr = new ArrayList<>();
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String toString() {
        return this.name + " " + this.address + " " + this.phone + "\n" + "Факультеты: \n" + this.getAllDepartment() +
                "\n Студентов: " + this.studentsArr.size();
    }

    public void addStudent(String name) {
        this.studentsArr.add(new Student(name, this.newStudentId));
        this.newStudentId++;
    }

    public String removeStudent(String name) {
        for (Student student : this.studentsArr) {
            if (student.name.equals(name)) {
                this.studentsArr.remove(student);
                return ("Студент " + name + " исключен из " + this.name);
            }
        }
        return "Студент с таким именем не найден";
    }

    public Student getStudent(String name) {
        for (Student s : this.studentsArr) {
            if (s.name.equals(name)) {
                return s;
            }
        }

        return null;
    }

    public void addDepartment(String name) {
        this.departmentsArr.add(new Department(name));
    }

    public String removeDepartment(String name) {
        for (Department d : this.departmentsArr) {
            if (d.name.equals(name)) {
                this.departmentsArr.remove(d);
                return ("Факультет " + name + "закрыт");
            }
        }
        return "Факультет с таким наименованием не найден";
    }

    public Department getDepartment(String name) {
        for (Department department : this.departmentsArr) {
            if (department.name.equals(name)) {
                return department;
            }
        }

        return null;
    }

    public String getAllDepartment() {
        String result = "";
        for (Department department : this.departmentsArr) {
            result = result + department.name + "\n Преподаватели:\n "+department.getAllInstructor()+"\n";
        }

        return result;
    }
}

