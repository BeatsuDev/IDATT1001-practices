public class Student {
    private String name;
    private int totalTasks = 0;

    public Student(String name) {
        this.name = name;
    }

    /**
     * Returns the name of the student.
     * 
     * @return the name of the student.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get total amount of approved tasks.
     * 
     * @return the total amount of approved tasks for this student.
     */
    public int getTotalTasks() {
        return this.totalTasks;
    }

    /**
     * Increases the total amount of approved tasks by a given amount.
     * 
     * @param increase  The amount to increase the total approved tasks by.
     */
    public void increaseTotalTasks(int increase) {
        this.totalTasks += increase;
    }

    @Override
    public String toString() {
        return "<Student name=\"" + this.getName() + "\" totalTasks=" + this.totalTasks + ">";
    }
}
