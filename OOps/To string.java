class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    // Override toString
    @Override
    public String toString() {
        return "Student{name='" + name + "', grade=" + grade + "}";
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Alex", 10);
        System.out.println(s); // automatically calls s.toString()
    }
}