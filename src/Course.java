import java.util.ArrayList;

public class Course {
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Instructor> instructors = new ArrayList<>();
    private ArrayList<Department> departments = new ArrayList<>();

    public String name;
    public int courseID;

    public Course() {
        this.name = "";
        this.courseID = 0;
    }

    public Course(String name, int id) {
        this.name = name;
        this.courseID = id;
    }

}
