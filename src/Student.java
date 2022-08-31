import java.util.ArrayList;

public class Student {

    private ArrayList<Course> coursesWhenVisits;
    public String name;
    public int studentID;

    public Student() {
        this.name = "";
        this.studentID = 0;
    }

    public Student(String name) {
        this.name = name;
        this.studentID = 0;
    }

    public Student(int id) {
        this.name = "";
        this.studentID = id;
    }

    public Student(String name, int id) {
        this.name = name;
        this.studentID = id;
    }
}
