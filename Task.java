/**
 * An abstract Task class that all other task types inherit from.
 *
 * @author Nick Chapman
 * @since Aug 3, 2024
 *
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task {

    protected String name;
    protected String description;

    protected Date dueDate;
    protected boolean isCompleted;



    /**
     * Empty constructor
     */
    public Task () {
        this.name = "New Task";
        this.description = "nA";
        this.dueDate = new Date();
        this.isCompleted = false;
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
     */
    public Task (String name, String description, int year, int month, int day) {
        this.name = name;
        this.description = description;
        this.dueDate = new Date(year-1900, month-1, day);
        this.isCompleted = false;
    }



    /**
     * A method used to get the task name
     *
     * @return task name
     */
    public String getTaskName() {
        return name;
    }



    /**
     * A method used to set the task name
     *
     * @param name task name
     */
    public void setTaskName(String name) {
        this.name = name;
    }



    /**
     * A method used to get the task description
     *
     * @return task description
     */
    public String getTaskDescription() {
        return description;
    }



    /**
     * A method used to set the task description
     *
     * @param description task description
     */
    public void setTaskDescription(String description) {
        this.description = description;
    }



    /**
     * A method used to get the task due date
     *
     * @return due date of task
     */
    public Date getTaskDueDate() {
        return dueDate;
    }



    /**
     * A method used to set the task due date
     *
     * @param dueDate date due as Date object
     */
    public void setTaskDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }



    /**
     * A method used to check if the task is completed
     *
     * @return if the task is completed or not
     */
    public boolean isTaskCompleted() {
        return isCompleted;
    }



    /**
     * A method used to set a task as completed or not
     *
     * @param isCompleted if the task is completed or not
     */
    public void setTaskCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }



    /**
     * A method used to display the task
     */
    public void display()
    {
        System.out.println("█ " + this.name);

        if (this.isCompleted)
            System.out.println(" Status: Complete");
        else
            System.out.println("█ Status: Incomplete");

        System.out.println("            " + this.description);

        DateFormat format = new SimpleDateFormat("MM-dd-yyyy");
        String dateOutput = format.format(this.dueDate);

        System.out.println("        Due on " + dateOutput);
    }

}
