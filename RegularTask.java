/**
 * A class that inherits from the default Task class.
 * A RegularTask just has a priority level that displays with everything else
 *
 * @author Nick Chapman
 * @since Aug 3, 2024
 *
 */

import java.util.Date;

public class RegularTask extends Task {

    protected int priority;



    /**
     * Empty constructor
     */
    public RegularTask () {
        this.name = "New Task";
        this.description = "nA";
        this.dueDate = new Date();
        this.isCompleted = false;
        this.priority = 0;
    }



    /**
     * Constructor with parameters
     *
     * @param name the name of the task
     * @param description the description of the task
     *
     * @param year year due
     * @param month month due
     * @param day day due
     * @param priority priority level
     */
    public RegularTask (String name, String description, int year, int month, int day, int priority) {
        this.name = name;
        this.description = description;
        this.dueDate = new Date(year-1900, month-1, day);
        this.isCompleted = false;
        this.priority = priority;
    }



    /**
     * A method used to get the priority value
     *
     * @return priority level
     */
    public int getPriority() {
        return priority;
    }



    /**
     * A method used to set the priority value
     *
     * @param priority priority level
     */
    public void setPriority (int priority) {
        this.priority = priority;
    }



    /**
     * A method used to display the task on a task list.
     * This method inherits from the super classes
     * display method, and adds the "Priority" detail.
     */
    public void display()
    {
        System.out.println("█ Priority: " + this.priority);
        super.display();
    }
}
