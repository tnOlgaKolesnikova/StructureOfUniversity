import java.util.ArrayList;

public class University {

    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Department> departments = new ArrayList<>();

    public String name;
    public String address;
    public String phone;

    public University() {
        this.name = "";
        this.address = "";
        this.phone = "";
    }

    public University(String name) {
        this.name = name;
        this.address = "";
        this.phone = "";
    }

    public University(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    };

    public void removeStudent(Student student) {
        this.students.remove(student);
    };

    public Student getStudent(String name) {
        return null;
    };

    public Student getStudent(int id) {
        return null;
    };

    public void addDepartment(Department department) {
        this.departments.add(department);
    };

    public void removeDepartment(Department department) {
        this.departments.remove(department);
    };

    public Department getDepartment(String name) {
        return null;
    };

    public ArrayList<Department> getAllDepartment() {
        return this.departments;
    };


}
