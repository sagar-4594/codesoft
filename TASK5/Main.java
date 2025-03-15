import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create the course registration system
        CourseRegistrationSystem system = new CourseRegistrationSystem();

        // Create some courses and add them to the system
        Course course1 = new Course("CS101", "Introduction to Computer Science", "Learn the basics of computer science.", 3, "Mon-Wed 9:00 AM - 10:30 AM");
        Course course2 = new Course("MATH101", "Calculus I", "Introduction to calculus and its applications.", 2, "Mon-Wed 11:00 AM - 12:30 PM");
        Course course3 = new Course("ENG101", "English Literature", "Study classic works of literature.", 2, "Tue-Thu 1:00 PM - 2:30 PM");

        system.addCourse(course1);
        system.addCourse(course2);
        system.addCourse(course3);

        // Create some students and add them to the system
        Student student1 = new Student("S001", "Alice");
        Student student2 = new Student("S002", "Bob");

        system.addStudent(student1);
        system.addStudent(student2);

        // Display available courses
        system.displayAvailableCourses();

        // Register a student for a course
        System.out.println("\nRegister Alice for CS101:");
        system.registerStudentForCourse("S001", "CS101");

        // Display all students and their courses
        system.displayAllStudentsAndCourses();

        // Drop a course
        System.out.println("\nDrop CS101 for Alice:");
        system.removeStudentFromCourse("S001", "CS101");

        // Display all students and their courses after dropping
        system.displayAllStudentsAndCourses();
    }
}
