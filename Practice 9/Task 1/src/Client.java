public class Client {
    public static void main(String[] args) {
        // Create student objects
	    Student student1 = new Student("Eric");
        Student student2 = new Student("Jacob");

        System.out.println(student1);
        System.out.println(student2);

        // Register the students in the TaskOverview object by object and by name
        TaskOverview overview = new TaskOverview();

        overview.registerStudent(student1);
        overview.registerStudent(student2.getName());

        // Increase the amount of approved tasks for the students both through the overview object and 
        // the student object directly (just to see if both work)
        overview.increaseApprovedTasksForStudent("Eric", 5);
        student2.increaseTotalTasks(3);

        // Write out information
        System.out.println(overview);
        System.out.println("------------------------------");
        System.out.printf("%s har gjort %s oppgaver\n", student1.getName(), student1.getTotalTasks());
        System.out.println("Her er samme studenten hentet fra oversikten:");
        System.out.printf("%s har gjort %s oppgaver\n", student1.getName(), overview.getTotalApprovedTasksFromStudent(student1.getName()));
        System.out.printf("%s har gjort %s oppgaver\n", student2.getName(), student2.getTotalTasks());
    }
}
