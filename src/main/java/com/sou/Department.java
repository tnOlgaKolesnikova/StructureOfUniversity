package com.sou;
import java.util.ArrayList;

public class Department {

    private ArrayList<Instructor> instructorsArr;
    public String name;

    public Department(String name) {
        this.instructorsArr = new ArrayList<>();
        this.name = name;
    }

    public void addInstructor(String name) {
        this.instructorsArr.add(new Instructor(name));
    }

    public String removeInstructor(String name) {
        for (Instructor instr : this.instructorsArr) {
            if (instr.name.equals(name)) {
                this.instructorsArr.remove(instr);
                return "Преподаватель " + name + " уволен с факультета " + this.name;
            }
        }
        return "Преподаватель с таким именем не работает на факультете";
    }

    public Instructor getInstructor(String name) {
        for (Instructor instructor : this.instructorsArr) {
            if (instructor.name.equals(name)) {
                return instructor;
            }
        }

        return null;
    }

    public String getAllInstructor() {
        String result = "";

        for (Instructor instructor : this.instructorsArr) {
            if (!result.equals("")) {
                result = result + ", " + instructor.name;
            } else {
                result = result + instructor.name;
            }
        }

        return result;
    }
}