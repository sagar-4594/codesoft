public class Course {
    String courseCode;
    String title;
    String description;
    int capacity;
    int enrolledStudents;
    String schedule;

    // Constructor
    public Course(String courseCode, String title, String description, int capacity, String schedule) {
        this.courseCode = courseCode;
        this.title = title;
        this.description = description;
        this.capacity = capacity;
        this.schedule = schedule;
        this.enrolledStudents = 0;  // Initially no students are enrolled
    }

    // Method to check if there's space in the course
    public boolean isAvailable() {
        return enrolledStudents < capacity;
    }

    // Method to enroll a student in the course
    public boolean enrollStudent() {
        if (isAvailable()) {
            enrolledStudents++;
            return true;
        }
        return false;
    }

    // Method to remove a student from the course
    public boolean removeStudent() {
        if (enrolledStudents > 0) {
            enrolledStudents--;
            return true;
        }
        return false;
    }

    // Method to display course details
    public void displayCourse() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Schedule: " + schedule);
        System.out.println("Capacity: " + capacity);
        System.out.println("Enrolled: " + enrolledStudents);
        System.out.println("Available Slots: " + (capacity - enrolledStudents));
        System.out.println();
    }
}
