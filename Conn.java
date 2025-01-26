package bank.management.system;

import java.sql.*;

public class Conn {
    Connection connection;
    Statement statement;
    public Con(){
        try {
            connection =DriverManager.getConnection("jdbs :mysql://localhost:3306/bankSystem","root","Akbar123");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}