package english.thai;
import java.sql.*;
public class DBConnection {
    public Connection getConnection(){
        Connection c = null; 
        try{
            c = DriverManager.getConnection("jdbc:odbc:mydic","","");
        }
        catch(Exception e){
            System.out.println(e);
        }
        return c;
    }
}