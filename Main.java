package com.meghana;

import java.util.ArrayList;
import java.util.Scanner;

 class MAIN {
    public static void main(String args[]) {
        ArrayList<Task> ar = new ArrayList<Task>();
        while (true) {
            System.out.println("1 for adding data");
            System.out.println("2 for printing entire data");
            System.out.println("3 for searching data");
            System.out.println("4 for removing data");
            System.out.println("5 for exit");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            switch (a) {
                case 1:

                    String fn = sc.next();
                    String de = sc.next();
                    String dob = sc.next();
                    String ts = sc.next();
                   Taskmanager.append( ar,fn,de,dob,ts);
                    break;
                case 2:
                    for (Task obj : ar) {
                        System.out.println(obj.name);
                        System.out.println(obj.description);
                        System.out.println(obj.dueDate);
                        System.out.println(obj.Taskstatus);
                    }

                    break;

                case 3:
                    System.out.println("Enter name to search:");
                    String string = sc.next();
                  // Taskmanager.search(ar,string);
                    if( Taskmanager.search(ar,string)) {
                        System.out.println("Data Found");
                    }
                    else{
                        System.out.println("No data found");
                    }
                    break;
                case 4:
                    System.out.println("Enter name to remove:");
                    String removablestring= sc.next();
                    Taskmanager.delete(ar,removablestring);
                    break;
                case 5:
                    System.exit(0);
            }

        }
    }
}
