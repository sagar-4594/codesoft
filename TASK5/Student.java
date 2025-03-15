import java.util.ArrayList;
import java.util.List;

public class Student {
    String studentID;
    String name;
    List<Course> registeredCourses;

    // Constructor
    public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        this.registeredCourses = new ArrayList<>();
    }

    // Method to register for a course
    public boolean registerForCourse(Course course) {
        if (course.enrollStudent()) {
            registeredCourses.add(course);
            System.out.println(name + " has successfully registered for " + course.title);
            return true;
        } else {
            System.out.println("Course " + course.title + " is full.");
            return false;
        }
    }

    // Method to drop a course
    public boolean dropCourse(Course course) {
        if (registeredCourses.remove(course)) {
            course.removeStudent();
            System.out.println(name + " has successfully dropped " + course.title);
            return true;
        }
        System.out.println(name + " is not registered for " + course.title);
        return false;
    }

    // Method to display student's registered courses
    public void displayRegisteredCourses() {
        if (registeredCourses.isEmpty()) {
            System.out.println(name + " is not registered for any courses.");
        } else {
            System.out.println(name + "'s Registered Courses:");
            for (Course course : registeredCourses) {
                System.out.println(course.title);
            }
        }
    }
}
