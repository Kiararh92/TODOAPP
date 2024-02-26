import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class represents the main menu of the To-Do List.
 *
 * @author Kiara
 * @version 4.0
 */

public class Menu {

    private final Hibernate hibernate;
    private List list;
    private DeleteTask deleteTask;
    private AddTask addTask;
    private ViewList viewList;
    private ArrayList<Task> ToDoList;
    private ArrayList<Integer> idList;

    Scanner scanner = new Scanner(System.in);

    /**
     * Displays available options  and handles the user input of the To-Do List.
     *
     * @param ToDoList An ArrayList of task objects
     * @param idList An ArrayList of taskNumbers
     * @param list List object that contains the ArrayList of tasks
     * @param deleteTask DeleteTask object that handles the deletion of a task
     * @param addTask   AddTask object that handles the creation of a new task
     * @param viewList  ViewTask object that handles displaying the whole ToDoList
     */
    public Menu(ArrayList<Task> ToDoList, ArrayList<Integer> idList, List list, DeleteTask deleteTask,
                AddTask addTask, ViewList viewList,Hibernate hibernate) {
        this.idList = idList;
        this.ToDoList = ToDoList;
        this.list = list;
        this.deleteTask = deleteTask;
        this.addTask = addTask;
        this.viewList = viewList;
        this.hibernate = hibernate;
    }

    public void toDoMenu() {

        while(true) {

            System.out.println("Menu");
            System.out.println("1. Add an item");
            System.out.println("2. Delete an item");
            System.out.println("3. View List");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    //  Option 1
                    addTask.addTask();
                    break;

                case 2:
                    //  Option 2
                    deleteTask.removeViaTaskNumber();
                    break;

                case 3:
                    //  Option 3
                    viewList.displayToDoList();
                    break;

                case 4:
                    //  Option 4
                    System.out.println("Goodbye!");
                    hibernate.close();
                    System.exit(0);
                    break;

            }
        }
    }
}
