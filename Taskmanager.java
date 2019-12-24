package com.meghana;

import java.util.ArrayList;
import java.util.Scanner;

public class Taskmanager
{
    public static void append(ArrayList<Task> ar,String fn,String de,String dob,String ts) {
        ar.add(new Task(fn, de, dob, ts));
    }

    public static boolean search(ArrayList<Task> ar,String stringname)
    {
        int check = 0;
        for (Task obj : ar) {
            if (obj.name.matches(stringname)) check = 1;
        }
        if (check == 1)
            return true;
        else
            return false;
    }
    public static void delete(ArrayList<Task> ar,String removablename)
    {
        for (Task obj : ar) {
            if (obj.name.equals(removablename)) {
                ar.remove(obj);
            }}
    }


}