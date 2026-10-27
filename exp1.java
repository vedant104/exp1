class Student {
    int rollNo;
    String name;
    double marks;

    void display() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class exp1 {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.rollNo = 6;
        s1.name = "Vedant";
        s1.marks = 85.5;

        s1.display();
    }
}
