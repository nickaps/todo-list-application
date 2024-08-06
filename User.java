/**
 * A user class that requires a TodoList object to exist.
 * This type of relationship where one class relies on another is called Composition.
 *
 * @author Nick Chapman
 * @since Aug 3, 2024
 *
 */

public class User {

    protected TodoList todoList = new TodoList();



    /**
     * Constructor with no parameters needed.
     * The User initializes a new TodoList and then waits for more instruction.
     */
    public User () {
        todoList = new TodoList();
    }



    /**
     * This method asks the task list object to display all tasks
     */
    public void displayTodoList() {
        todoList.displayTasks();
    }



    /**
     * This method adds a RegularTask type to the list
     *
     * @param taskName the name of the task
     * @param taskDescription the description of the task
     *
     * @param taskPriority priority level
     *
     * @param year year due
     * @param month month due
     * @param date day due
     */
    public void addRegularTask(String taskName, String taskDescription, int taskPriority, int year, int month, int date) {
        RegularTask task = new RegularTask(taskName, taskDescription, year, month, date, taskPriority);
        todoList.addTask(task);
    }



    /**
     * This method adds an ImportantTask type to the list
     *
     * @param taskName the name of the task
     * @param taskDescription the description of the task
     *
     * @param isUrgent will the task display with an URGENT banner above it?
     *
     * @param year year due
     * @param month month due
     * @param date day due
     */
    public void addImportantTask(String taskName, String taskDescription, boolean isUrgent, int year, int month, int date) {
        ImportantTask task = new ImportantTask(taskName, taskDescription, year, month, date, isUrgent);
        todoList.addTask(task);
    }



    /**
     * This method adds a RecurringTask type to the list
     *
     * @param taskName the name of the task
     * @param taskDescription the description of the task
     * @param recurrencePattern how often will the task occur? (Daily, Weekly, Monthly)
     */
    public void addRecurringTask(String taskName, String taskDescription, String recurrencePattern) {
        RecurringTask task = new RecurringTask(taskName, taskDescription, recurrencePattern);
        todoList.addTask(task);
    }



    /**
     * This method will remove a task at the index appearing on the screen
     */
    public void removeTask(int index) {
        todoList.removeTask(index - 1);
    }


    /**
     * This method allows the User to mark a task off as complete
     * by using the index that appears on screen.
     */
    public void completeTask(int index) {
        todoList.completeTask(index - 1);
    }

}
