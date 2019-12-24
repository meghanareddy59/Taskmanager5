package com.meghana;
import java.util.*;
enum Taskstatus{ CREATED,INPROGRESS,DONE}


public class Task {
    public String name;
    public String description;
    public String dueDate;
    public String Taskstatus;

    Task(String addname, String adddes, String adddate,String taskst) {
        this.name = addname;
        this.description = adddes;
        this.dueDate = adddate;
        this.Taskstatus=taskst;
    }


}
