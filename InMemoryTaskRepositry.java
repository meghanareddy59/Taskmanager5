package com.meghana;


import java.util.ArrayList;
import java.util.List;
public  class InMemoryTaskRepositry {

    ArrayList<Task> list = new ArrayList<Task>();


    public void addTask(Task task) {
        list.add(task);
    }

    public ArrayList<Task> display() {
        return list;
    }


    public Task FindById(int taskId) {
        for (Task task : list) {
            if (task.getTaskId() == taskId)
                return task;
        }
        return null;
    }


    public void delete(int taskId) {
        for (Task task : list) {
            if (task.getTaskId() == taskId) {

                list.remove(task);
            }
        }
    }
    public List<Task>  listByStatus(String status){
        ArrayList<Task>tempTaskList = new ArrayList<>();
        for(Task task:list){
            if(task.getStatus().equals(status))
                tempTaskList.add(task);
        }
        return tempTaskList;
    }
}





