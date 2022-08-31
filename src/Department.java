import java.util.ArrayList;

public class Department {
    private final ArrayList<Instructor> instructors = new ArrayList<>();
    public String name;

    public Department() {
        this.name = "";
    }

    public Department(String name) {
        this.name = name;
    }

    public void addInstructor(Instructor instructor) {
        this.instructors.add(instructor);
    }

    public void removeInstructor(Instructor instructor) {
        this.instructors.remove(instructor);
    }

    public Instructor getInstructor(String name) {
        return null;
    }

    public ArrayList<Instructor> getAllInstructor() {
        return this.instructors;
    }

}
