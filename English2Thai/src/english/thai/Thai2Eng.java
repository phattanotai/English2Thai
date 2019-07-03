package english.thai;
import java.sql.*;
import javax.swing.JOptionPane;
class customer1{
    String tsearch ;
    String tcat ;
    String eentry ;
    String tenglish ;
    String tdef ;
    String tnum ;
    String notes ;
    String tsyn ;
    String tant ;     
}

public class Thai2Eng {
    public Thai2Eng(customer1 cust){
        
        String i =cust.tsearch;
        Connection conn = null;
        ResultSet rs;
        Statement stmt;
        String sql;
        
        try{
            DBConnection Mycon = new DBConnection();
            conn= Mycon.getConnection();         
       
            sql=" select * from Thai2Eng where tsearch = '"+i+"' ";
            stmt = conn.createStatement();
            rs= stmt.executeQuery(sql);    
            int l=1;
            while(rs.next()){
                if(l==1){
                    cust.tsearch = rs.getString("tsearch");   
                    cust.tcat = rs.getString("tcat");
                    cust.eentry = rs.getString("eentry");
                    cust.tenglish = rs.getString("tenglish");
                    cust.tdef = rs.getString("tdef");
                    cust.tnum = rs.getString("tnum");
                    cust.notes = rs.getString("notes");
                    cust.tsyn = rs.getString("tsyn");
                    cust.tant = rs.getString("tant");                    
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
