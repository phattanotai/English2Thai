package english.thai;
import java.sql.*;
import javax.swing.JOptionPane;
class customer{
    String esearch ;
    String ecat ;
    String tentry ;
    String ethai ;
    String esyn ;
    String eant ;
}

public class Eng2Thai {
    public Eng2Thai(customer cust){
        String i =cust.esearch;
        Connection conn = null;
        ResultSet rs;
        Statement stmt;
        String sql;
        
        try{
            DBConnection Mycon = new DBConnection();
            conn= Mycon.getConnection();         
       
            sql="select * from Eng2Thai where esearch = '"+i+"'";
            stmt = conn.createStatement();
            rs= stmt.executeQuery(sql);    
            int l=1;
            while(rs.next()){
             if(l==1){
                    cust.esearch =rs.getString("esearch");
                    cust.ecat =rs.getString("ecat");
                    cust.tentry =rs.getString("tentry");
                    cust.ethai =rs.getString("ethai");
                    cust.esyn =rs.getString("esyn");
                    cust.eant =rs.getString("eant");
                    l++;
                     }
               
             }

        
        }catch (Exception e){
            System.out.println(e);
        }finally{
            try{
                if(conn != null){
                    conn.close();
                }
            }catch (Exception e){
                System.out.println(e);
            }
        }
        
      
        
        
    }
    
     
}
