/**
 * This class represents the feature of viewing the whole To-Do List
 * as one.
 *
 * @author Kiara
 * @version 1.0
 *
 */
public class ViewList {
    private final List list;
    private final Hibernate hibernate;

    /**
     * Constructs a List of all the tasks.
     *
     * @param list List object that contains the task objects
     */
    public ViewList(List list, Hibernate hibernate){
        this.list = list;
        this.hibernate = hibernate;
    }

    /**
     * Displays the tasks in the list.
     * Each task is printed with its task number followed by the task subject.
     */
    public void displayToDoList() {

        System.out.println("To-Do List:");
        for(Task currentTask : list.getTasks()) {
            System.out.println(currentTask.getTaskNumber() + " " + currentTask.getTask());
        }
        hibernate.viewTaskHib();
    }
}
