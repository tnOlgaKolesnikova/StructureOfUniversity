public class Student {
    public String name = "";
    public int studentID = 0;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int id) {
        this.studentID = id;
    }

    public Student(String name, int id) {
        this.name = name;
        this.studentID = id;
    }
}
