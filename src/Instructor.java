import java.util.ArrayList;

public class Instructor {
    private ArrayList<Course> courses = new ArrayList<>();
    public String name;

    public Instructor() {
        this.name = "";
    }

    public Instructor(String name) {
        this.name = name;
    }
}