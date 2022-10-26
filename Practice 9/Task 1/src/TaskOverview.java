import java.util.HashMap;

/**
 * Overview over all students and the tasks they have gotten approved.
 * 
 * @author Eric Bieszczad-Stie
 */
public class TaskOverview {
    private HashMap<String, Student> students;
    private int totalStudents = 0;

    /**
     * Creates a new TaskOverview object with its own HashMap of students. 
     */
    public TaskOverview() {
        this.students = new HashMap<String, Student>();
    }

    /**
     * Get the total amount of students in the TaskOverview object.
     * 
     * @return the total amount of students registered in this object.
     */
    public int getTotalStudents() {
        return this.totalStudents;
    }

    /**
     * Creates a new student object and adds it to the HashMap.
     * 
     * @param name  The name of the student.
     */
    public void registerStudent(String name) {
        this.totalStudents++;
        this.students.put(name, new Student(name));
    }

    /**
     * Registers a new student with a given student object.
     * 
     * @param student  Student object to register.
     */
    public void registerStudent(Student student) {
        this.totalStudents++;
        this.students.put(student.getName(), student);
    }

    /**
     * Get the total amount of approved tasks for a given student. This method
     * searches for the student in the HashMap and returns the total amount of
     * approved tasks for that student. If the student is not found, it returns -1.
     * 
     * @param navn  The name of the student.
     * @return the amount of approved tasks for the student, or -1 if the student was not found
     */
    public int getTotalApprovedTasksFromStudent(String navn) {
        Student student = this.students.get(navn);
        if (student != null) {
            return student.getTotalTasks();
        }
        return -1;
    }

    /**
     * Increases the amount of approved tasks for a given student.
     * 
     * @param navn  Name of the student.
     * @param increase  The amount to increase the total approved tasks by.
     */
    public void increaseApprovedTasksForStudent(String name, int increase) {
        this.students.get(name).increaseTotalTasks(increase);
    }

    @Override
    public String toString() {
        return "<TaskOverview totalStudents=" + this.getTotalStudents() + ">";
    }
}
