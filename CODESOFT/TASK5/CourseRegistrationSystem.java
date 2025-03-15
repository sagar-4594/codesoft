import java.util.ArrayList;
import java.util.List;

public class CourseRegistrationSystem {
    private List<Course> courseList;
    private List<Student> studentList;

    // Constructor
    public CourseRegistrationSystem() {
        courseList = new ArrayList<>();
        studentList = new ArrayList<>();
    }

    // Method to add a course to the system
    public void addCourse(Course course) {
        courseList.add(course);
    }

    // Method to add a student to the system
    public void addStudent(Student student) {
        studentList.add(student);
    }

    // Method to display available courses
    public void displayAvailableCourses() {
        System.out.println("Available Courses:");
        for (Course course : courseList) {
            if (course.isAvailable()) {
                course.displayCourse();
            }
        }
    }

    // Method to register a student for a course
    public void registerStudentForCourse(String studentID, String courseCode) {
        Student student = findStudentByID(studentID);
        Course course = findCourseByCode(courseCode);

        if (student != null && course != null) {
            student.registerForCourse(course);
        }
    }

    // Method to remove a student from a course
    public void removeStudentFromCourse(String studentID, String courseCode) {
        Student student = findStudentByID(studentID);
        Course course = findCourseByCode(courseCode);

        if (student != null && course != null) {
            student.dropCourse(course);
        }
    }

    // Helper method to find a student by ID
    private Student findStudentByID(String studentID) {
        for (Student student : studentList) {
            if (student.studentID.equals(studentID)) {
                return student;
            }
        }
        System.out.println("Student not found.");
        return null;
    }

    // Helper method to find a course by code
    private Course findCourseByCode(String courseCode) {
        for (Course course : courseList) {
            if (course.courseCode.equals(courseCode)) {
                return course;
            }
        }
        System.out.println("Course not found.");
        return null;
    }

    // Method to display all students and their registered courses
    public void displayAllStudentsAndCourses() {
        for (Student student : studentList) {
            student.displayRegisteredCourses();
        }
    }
}
