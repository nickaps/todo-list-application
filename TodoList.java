/**
 * A class that aggregates many different Tasks into one singular task list.
 * Because of the principles of inheritance and polymorphism, we are able to
 * have several different types of classes that can all be in one list, and
 * each do different things when asked to display itself.
 *
 * @author Nick Chapman
 * @since Aug 3, 2024
 *
 */

import java.util.ArrayList;

public class TodoList {

    protected ArrayList<Task> tasks;



    /**
     * Constructor with no parameters that simply initializes a new task list.
     */
    public TodoList () {
        tasks = new ArrayList<Task>();
    }



    /**
     * A method used to get a task at a given index.
     *
     * @param index the index of the task in the task list
     * @return task found at index
     */
    public Task getTaskAtIndex(int index) {
        return tasks.get(index);
    }



    /**
     * A method used to add a task to the list.
     *
     * @param task the task to be appended
     */
    public void addTask(Task task)
    {
        tasks.add(task);
    }



    /**
     * A method used to remove a task from the task list.
     * Because the task list is aggregated, the task will remain independent,
     * but the reference will be removed from the list.
     *
     * @param index the index of the task in the task list
     */
    public void removeTask(int index)
    {
        tasks.remove(index);
        displayTasks();
    }



    /**
     * A method used to mark a task as complete.
     *
     * @param index the index of the task in the task list
     */
    public void completeTask(int index) {
        Task t = getTaskAtIndex(index);
        t.setTaskCompleted(true);
        displayTasks();
    }



    /**
     * A method used to display the entire task list.
     * It runs through each task and runs their display method,
     * and then organizes them with fancy ASCII dividers and such.
     */
    public void displayTasks() {

        System.out.println("\n\n\n\n\n\n\n\n\n\nTask List");

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ") █████████████████████████████████████████████████");
            tasks.get(i).display();
        }

        System.out.println("████████████████████████████████████████████████████");

    }
}
