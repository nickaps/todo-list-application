/**
 * A class that inherits from the Task class.
 * An ImportantTask is just a Task that will appear with the priority "Important" and
 * if it is marked as "isUrgent" it will appear with a banner above it labeled with "URGENT"
 *
 * @author Nick Chapman
 * @since Aug 3, 2024
 *
 */

import java.util.Date;

public class ImportantTask extends Task {

    protected boolean isUrgent = false;



    /**
     * Empty constructor
     */
    public ImportantTask () {
        this.name = "New Task";
        this.description = "nA";
        this.dueDate = new Date();
        this.isCompleted = false;
        this.isUrgent = false;
    }



    /**
     * Constructor with parameters
     *
     * @param name the name of the task
     * @param description the description of the task
     *
     * @param isUrgent will the task display with an URGENT banner above it?
     *
     * @param year year due
     * @param month month due
     * @param day day due
     */
    public ImportantTask (String name, String description, int year, int month, int day, boolean isUrgent) {
        this.name = name;
        this.description = description;
        this.dueDate = new Date(year-1900, month-1, day);
        this.isCompleted = false;
        this.isUrgent = isUrgent;
    }



    /**
     * A method used to get the urgency
     *
     * @return if the task is marked as urgent or not
     */
    public boolean getUrgency () {
        return isUrgent;
    }



    /**
     * A method used to set the urgency
     *
     * @param isUrgent is the task urgent or not?
     */
    public void setUrgency(boolean isUrgent) {
        this.isUrgent = isUrgent;
    }



    /**
     * A method used to display the task on a task list.
     * This method inherits from the super classes
     * display method, and adds the "Important" and
     * "URGENT" details.
     */
    public void display()
    {
        if (isUrgent && !isCompleted)
            System.out.println("███████████████████████████████░ URGENT ░████████");
        System.out.println("█ Important");

        super.display();
    }
}
