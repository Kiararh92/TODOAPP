package com.spring24.todoapp;

import java.util.ArrayList;

/**
 * This class represents assigning a unique task number to each task.
 *
 * @author Kiara
 * @version 4.0
 */
public class TaskNumber {
    int nextID = 101;
    int currentID = 0;
    public ArrayList<Integer> idList;
    boolean found;

    /**
     * Creates and assigns a task number to a specific task
     *
     * @param idList An ArrayList of taskNumbers
     */
    public TaskNumber(ArrayList<Integer> idList){
        this.idList = idList;
    }

    /**
     * Creates a unique ID number
     * Checks if that ID is available or already assigned to another task.
     */
    public void assignID(){
        nextID = 101;
        while(found) {
            found = false;
            while (idList.contains(nextID)) {
                found = true;
                nextID++;
                if (!found) {
                    break;
                }
            }
        }
        if(!found) {
            idList.add(nextID);
            currentID = nextID;
            found = true;
        }
    }

    /**
     * Retrieves the current ID number.
     *
     * @return the unique ID number to be assigned as the TaskNumber
     */
    public int getCurrentID() {
        return currentID;
    }

    /**
     * Sets the current ID number
     *
     * @param currentID current ID number.
     */
    public void setCurrentID(int currentID) {
        this.currentID = currentID;
    }
}
