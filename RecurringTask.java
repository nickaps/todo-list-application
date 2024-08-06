/**
 * A class that inherits from the Task class.
 * A RecurringTask is just a Task that either reoccurs Daily, Weekly, or Monthly.
 *
 * @author Nick Chapman
 * @since Aug 3, 2024
 *
 */

import java.util.Date;

public class RecurringTask extends Task {

    protected String recurrencePattern = "Daily";



    /**
     * Empty constructor
     */
    public RecurringTask () {
        this.name = "New Task";
        this.description = "nA";
        this.dueDate = new Date();
        this.isCompleted = false;
        this.recurrencePattern = "Daily";
    }



    /**
     * Constructor with parameters
     *
     * @param name the name of the task
     * @param description the description of the task
     * @param recurrencePattern how often will the task occur? (Daily, Weekly, Monthly)
     */
    public RecurringTask (String name, String description, String recurrencePattern) {
        this.name = name;
        this.description = description;
        this.isCompleted = false;
        this.dueDate = new Date();
        this.recurrencePattern = recurrencePattern;

        if (recurrencePattern.equals("Daily")) {
            this.dueDate.setDate(this.dueDate.getDate() + 1);
        }else if (recurrencePattern.equals("Weekly")) {
            this.dueDate.setDate(this.dueDate.getDate() + 7);
        }else if (recurrencePattern.equals("Monthly")) {
            this.dueDate.setMonth(this.dueDate.getMonth() + 1);
        }
    }



    /**
     * A method used to get the recurrence pattern
     *
     * @return how often the task occurs
     */
    public String getRecurrencePattern () {
        return recurrencePattern;
    }



    /**
     * This method sets the recurrence pattern of the task
     *
     * @param recurrencePattern how often will the task occur? (Daily, Weekly, Monthly)
     */
    public void setRecurrencePattern (String recurrencePattern) {
        this.recurrencePattern = recurrencePattern;
    }



    /**
     * A method used to display the task on a task list.
     * This method inherits from the super classes
     * display method, and adds the "Occurs" detail.
     */
    public void display()
    {
        System.out.println("█ Occurs " + this.recurrencePattern);
        super.display();
    }
}
