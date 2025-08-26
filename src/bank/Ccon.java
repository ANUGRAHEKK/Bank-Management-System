package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Ccon {
    Connection connection;
    Statement statement;
    public Ccon(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","Admin@123");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
