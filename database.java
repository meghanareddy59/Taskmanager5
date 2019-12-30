package com.meghana;

import java.sql.*;
import java.util.List;

public class database implements TaskRepository {

    @Override
    public void addTask(Task task) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/testdb";
        String userName = "testuser";
        String password = "password";
        Connection con = DriverManager.getConnection(url, userName, password);
        Statement stmt = con.createStatement();
        String q = "insert into task1 values(" + task.getTaskId() + ",\"" + task.getTaskName() + "\",\"" + task.getTaskDesc() + "\",\"" + task.getDueDate()
                + "\",\"" + task.getStatus() + "\")";

        System.out.println(q);
        stmt.executeUpdate(q);
        con.close();

    }

    @Override
    public List<Task> display() throws SQLException {

        String url = "jdbc:mysql://localhost:3306/testdb";
        String userName = "testuser";
        String password = "password";
        Connection con = DriverManager.getConnection(url, userName, password);
        Statement stmt = con.createStatement();
        String q = "select * from task1";

        ResultSet rs = stmt.executeQuery(q);
        if (rs.next()) {
            do {
                System.out.println(rs.getInt(1) + "," + rs.getString(2) + "," + rs.getString(3) + "," + rs.getString(4) + "," + rs.getString(5));
            } while (rs.next());
        } else {
            System.out.println("Record Not Found...");
        }

        return null;
    }

    @Override
    public Task FindById(int taskId) throws SQLException {
        String Url = "jdbc:mysql://localhost:3306/testdb";
        String username = "testuser";
        String password = "password";
        Connection con = DriverManager.getConnection(Url, username, password);
        Statement stmt = con.createStatement();
        String sql = "select * from task1 where id=" + taskId;

        ResultSet rs = stmt.executeQuery(sql);
        if (rs.next()) {
            do {
                System.out.println(rs.getInt(1) + "," + rs.getString(2) + "," + rs.getString(3) + "," + rs.getString(4) + "," + rs.getString(5));
            } while (rs.next());
        } else {
            System.out.println("Record Not Found...");
        }


        return null;
    }

    @Override
    public void delete(int taskId) throws SQLException {
        String Url = "jdbc:mysql://localhost:3306/testdb";
        String username = "testuser";
        String password = "password";
        Connection con = DriverManager.getConnection(Url, username, password);
        Statement stmt = con.createStatement();
        String sql = "delete from task1 where id=" + taskId;

        stmt.executeUpdate(sql);
       // System.out.println("Record deleted successfully");


    }

    @Override
    public Task listByStatus(String requiredStatus) throws SQLException {
        String Url = "jdbc:mysql://localhost:3306/testdb";
        String username = "testuser";
        String password = "password";
        Connection con = DriverManager.getConnection(Url, username, password);
        Statement stmt = con.createStatement();
        String sql = "select * from task1 where ts= '"+requiredStatus+"'";

        ResultSet rs = stmt.executeQuery(sql);
        if (rs.next()) {
            do {
                System.out.println(rs.getInt(1) + "," + rs.getString(2) + "," + rs.getString(3) + "," + rs.getString(4) + "," + rs.getString(5));
            }
            while (rs.next());
        }
        else
            System.out.println("Record Not Found...");
return null;
    }


}

