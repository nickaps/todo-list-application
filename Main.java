/**
 * The main static class used for all the code to run on.
 *
 * @author Nick Chapman
 * @since Aug 3, 2024
 *
 */

import java.util.Date;

public class Main {

    private static User user = new User();

    public static void main(String[] args) {

        user.addImportantTask("Finish Homework", "Complete Assignment 3 by midnight tonight.", true, 2024, 8, 5);
        user.addRegularTask("Vacuum the House", "Take the vacuum out and use it from the top to the bottom of the house.", 1, 2024, 8, 6);
        user.addRecurringTask("Clean the Bathroom", "Scrub the toilet, disinfect surfaces, and wash the shower curtain.", "Weekly");

        user.displayTodoList();
        user.completeTask(1);;
        user.removeTask(1);

    }

}
