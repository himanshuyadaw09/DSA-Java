import java.util.*;
import java.sql.*;

public class JDBCExam {
    private static final String url = "jdbc:mysql://localhost:3306/";
    private static final String username = "root";
    private static final String password = "123456";
    private static final String driver = "com.mysql.cj.jdbc.Driver";


    public static void main(String[] args){

        try{
            Class.forName(driver);
            Connection connect = DriverManager.getConnection(url, username, password);
            Statement state = connect.createStatement();
            String creatingDatabase = "CREATE DATABASE IF NOT EXISTS StudentManagement";
            state.executeUpdate(creatingDatabase);
            System.out.println("Database Created Successfully!");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
}