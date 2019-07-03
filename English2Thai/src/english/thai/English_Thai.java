package english.thai;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class English_Thai extends javax.swing.JFrame {
    String c =null;
    Date datetime = new Date();
    SimpleDateFormat df = new SimpleDateFormat("KK:mm");
    String esearch,ecat,tentry,ethai,esyn,eant;
    String tsearch,tcat,eentry,tenglish,tdef,tnum,notes,tsyn,tant;
    String[] strings = new String[100]; 
    Connection conn = null;
    Statement stmt;
    String sql;


        
    public English_Thai() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        try {
            jPanel1 =(javax.swing.JPanel)java.beans.Beans.instantiate(getClass().getClassLoader(), "english/thai.English_Thai_jPanel1");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        T_search = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        about = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        show = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        List = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("English-Thai");
        setBackground(new java.awt.Color(204, 204, 255));

        T_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_searchActionPerformed(evt);
            }
        });

        search.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        search.setText("ค้นหา");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        about.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        about.setText("คำนำ");
        about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMouseClicked(evt);
            }
        });

        show.setColumns(20);
        show.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        show.setForeground(new java.awt.Color(51, 51, 255));
        show.setRows(5);
        jScrollPane4.setViewportView(show);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("คำศัทพ์ใกล้เคียง");

        List.setBackground(new java.awt.Color(204, 204, 204));
        List.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        List.setName(""); // NOI18N
        List.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ListMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(List);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(T_search, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(about))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search)
                    .addComponent(about))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(639, 398));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    

    
    private void aboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseClicked
        About i =new About();
    }//GEN-LAST:event_aboutMouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String i = T_search.getText();
        show.setText("");
        char s = i.charAt(0);
        int q =0;
        if((s=='a')||(s=='b')||(s=='c')||(s=='d')||(s=='e')||(s=='f')||(s=='g')||(s=='h')||(s=='i')||(s=='j')||(s=='k')||(s=='l')||(s=='m')||(s=='n')||(s=='o')||(s=='p')||(s=='q')||(s=='r')||(s=='s')||(s=='t')||(s=='u')||(s=='v')||(s=='w')||(s=='x')||(s=='y')||(s=='z')
        ||(s=='A')||(s=='B')||(s=='C')||(s=='D')||(s=='E')||(s=='F')||(s=='G')||(s=='H')||(s=='I')||(s=='J')||(s=='K')||(s=='L')||(s=='M')||(s=='N')||(s=='O')||(s=='P')||(s=='Q')||(s=='R')||(s=='S')||(s=='T')||(s=='U')||(s=='V')||(s=='W')||(s=='X')||(s=='Y')||(s=='Z'))
        {
          q=1;                
        }else{
          q=2;         
        }       
       
        if(q==1){
             customer cust = new customer();
             cust.esearch=i;
             Eng2Thai x = new Eng2Thai(cust);            
             
             Ecat ecat =new Ecat();
             ecat.ecat=cust.ecat;
             WordType j = new WordType(ecat);
            
             
             c="\n"+cust.esearch +"\n\n\t"+ ecat.ecat +"\n\n\t"+ cust.tentry +"\n\n\t"+ cust.ethai;
             String k="";
             if(cust.esyn.equals(k)){
                c=c; 
             }else{    
                c=c + "\n\nคำเหมือน" +"\n\n\t"+cust.esyn ;
             }if(cust.eant.equals(k)){
                 c=c;
             }else{
                 c=c +"\n\nคำตรงข้าม " +"\n\n\t"+ cust.eant;
             }
          show.setText(c);
        //หาคำที่คล้ายกัน        
        try{
            DBConnection Mycon = new DBConnection();
            conn= Mycon.getConnection();         
            stmt = conn.createStatement();
            sql="select * from Eng2Thai where esearch like'"+i+"%'";
            ResultSet rs= stmt.executeQuery(sql);    
            int l=0;
            while(rs.next()){
                l++;
             }            
            ResultSet rs1=stmt.executeQuery(sql);
            l=0;
            while(rs1.next()){
                strings[l]=rs1.getString("esearch");
                l++;
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
    
    List.setListData(strings);

   
         }else if(q==2){
             customer1 cust = new customer1();
             cust.tsearch=i;
             Thai2Eng x = new Thai2Eng(cust);
             
             Ecat ecat =new Ecat();
             ecat.ecat=cust.tcat;
             WordType j = new WordType(ecat);
             
             c="\n"+cust.tsearch +"\n\n\t"+ ecat.ecat +"\n\n\t"+ cust.eentry+"\n\t"+cust.tdef ;
             String k="";
             if(cust.tsyn.equals(k)){
                c=c; 
             }else{    
                c=c + "\n\nคำเหมือน" +"\n\n\t"+cust.tsyn ;
             }
             if(cust.tant.equals(k)){
                 c=c;
             }else{
                 c=c +"\n\nคำตรงข้าม " +"\n\n\t"+ cust.tant;
             }
             show.setText(c);
            
         //หาคำที่คล้ายกัน
         try{
            DBConnection Mycon = new DBConnection();
            conn= Mycon.getConnection();         
            stmt = conn.createStatement();
            sql="select * from Thai2Eng where tsearch like '"+i+"%'";
            ResultSet rs= stmt.executeQuery(sql);    
            int l=0;
            while(rs.next()){
                l++;
             }            
            ResultSet rs1=stmt.executeQuery(sql);
            l=0;
            while(rs1.next()){
                strings[l]=rs1.getString("tsearch");
                l++;
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
    
    List.setListData(strings);

         }

    }//GEN-LAST:event_searchActionPerformed

    private void ListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListMousePressed
       String i = (String) List.getSelectedValue();
        T_search.setText(i);
        show.setText("");
        c="";
        char s = i.charAt(0);
        int q =0;
        if((s=='a')||(s=='b')||(s=='c')||(s=='d')||(s=='e')||(s=='f')||(s=='g')||(s=='h')||(s=='i')||(s=='j')||(s=='k')||(s=='l')||(s=='m')||(s=='n')||(s=='o')||(s=='p')||(s=='q')||(s=='r')||(s=='s')||(s=='t')||(s=='u')||(s=='v')||(s=='w')||(s=='x')||(s=='y')||(s=='z')
        ||(s=='A')||(s=='B')||(s=='C')||(s=='D')||(s=='E')||(s=='F')||(s=='G')||(s=='H')||(s=='I')||(s=='J')||(s=='K')||(s=='L')||(s=='M')||(s=='N')||(s=='O')||(s=='P')||(s=='Q')||(s=='R')||(s=='S')||(s=='T')||(s=='U')||(s=='V')||(s=='W')||(s=='X')||(s=='Y')||(s=='Z'))
        {
          q=1; 
        }else{
          q=2; 
        }       
       if(q==1){  
        customer cust =new customer();
        try{
            DBConnection Mycon = new DBConnection();
            conn= Mycon.getConnection();         
            stmt = conn.createStatement();
            sql="select * from Eng2Thai where esearch = '"+i+"'";         
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
                    cust.esearch =rs.getString("esearch");
                    cust.ecat =rs.getString("ecat");
                    cust.tentry =rs.getString("tentry");
                    cust.ethai =rs.getString("ethai");
                    cust.esyn =rs.getString("esyn");
                    cust.eant =rs.getString("eant");      
            
             Ecat ecat =new Ecat();
             ecat.ecat=cust.ecat;
             WordType j = new WordType(ecat);
             c=c+cust.esearch +"\n\t"+ ecat.ecat +"\n\t"+ cust.tentry +"\n\t"+ cust.ethai+"\n";
             String k="";
             if(cust.esyn.equals(k)){
                c=c; 
             }else{    
                c=c + "\n\tคำเหมือน" +"\n\t"+cust.esyn+"\n";
             }if(cust.eant.equals(k)){
                 c=c+"\n\n";
             }else{
                 c=c +"\n\tคำตรงข้าม " +"\n\t"+ cust.eant+"\n\n\n";
             }
            }
              show.setText(c); 
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

       }else if(q==2){
           customer1 cust =new customer1();
           try{
            DBConnection Mycon = new DBConnection();
            conn= Mycon.getConnection();         
            stmt = conn.createStatement();
            sql="select * from Thai2Eng where tsearch ='"+i+"'";          
            ResultSet rs=stmt.executeQuery(sql);
            int l=0;
            while(rs.next()){
              if(l==0){
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
              }}
   
             Ecat ecat =new Ecat();
             ecat.ecat=cust.tcat;
             WordType j = new WordType(ecat);
             c=c+cust.tsearch +"\n\t"+ ecat.ecat +"\n\t"+ cust.eentry+"\n" ;
             String k="";
             if(cust.tsyn.equals(k)){
                c=c; 
             }else{    
                c=c + "\n\tคำเหมือน" +"\n\t"+cust.tsyn+"\n" ;
             }
             if(cust.tant.equals(k)){
                 c=c+"\n\n";
             }else{
                 c=c +"\n\tคำตรงข้าม " +"\n\t"+ cust.tant+"\n\n\n";
             }
             show.setText(c); 
    
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
    }//GEN-LAST:event_ListMousePressed

    private void T_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_searchActionPerformed
        String i = T_search.getText();
        show.setText("");
        char s = i.charAt(0);
        int q =0;
        if((s=='a')||(s=='b')||(s=='c')||(s=='d')||(s=='e')||(s=='f')||(s=='g')||(s=='h')||(s=='i')||(s=='j')||(s=='k')||(s=='l')||(s=='m')||(s=='n')||(s=='o')||(s=='p')||(s=='q')||(s=='r')||(s=='s')||(s=='t')||(s=='u')||(s=='v')||(s=='w')||(s=='x')||(s=='y')||(s=='z')
        ||(s=='A')||(s=='B')||(s=='C')||(s=='D')||(s=='E')||(s=='F')||(s=='G')||(s=='H')||(s=='I')||(s=='J')||(s=='K')||(s=='L')||(s=='M')||(s=='N')||(s=='O')||(s=='P')||(s=='Q')||(s=='R')||(s=='S')||(s=='T')||(s=='U')||(s=='V')||(s=='W')||(s=='X')||(s=='Y')||(s=='Z'))
        {
          q=1;                
        }else{
          q=2;         
        }       
       
        if(q==1){
             customer cust = new customer();
             cust.esearch=i;
             Eng2Thai x = new Eng2Thai(cust);            
             
             Ecat ecat =new Ecat();
             ecat.ecat=cust.ecat;
             WordType j = new WordType(ecat);
            
             
             c="\n"+cust.esearch +"\n\n\t"+ ecat.ecat +"\n\n\t"+ cust.tentry +"\n\n\t"+ cust.ethai;
             String k="";
             if(cust.esyn.equals(k)){
                c=c; 
             }else{    
                c=c + "\n\nคำเหมือน" +"\n\n\t"+cust.esyn +"\n\nคำตรงข้าม " +"\n\n\t"+ cust.eant;
             }if(cust.eant.equals(k)){
                 c=c;
             }else{
                 c=c +"\n\nคำตรงข้าม " +"\n\n\t"+ cust.eant;
             }
                
        try{
            DBConnection Mycon = new DBConnection();
            conn= Mycon.getConnection();         
            stmt = conn.createStatement();
            sql="select * from Eng2Thai where esearch like'"+i+"%'";
            ResultSet rs= stmt.executeQuery(sql);    
            int l=0;
            while(rs.next()){
                l++;
             }            
            ResultSet rs1=stmt.executeQuery(sql);
            l=0;
            while(rs1.next()){
                strings[l]=rs1.getString("esearch");
                l++;
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
    
    List.setListData(strings);
             
        
     show.setText(c);
   
         }else if(q==2){
             customer1 cust = new customer1();
             cust.tsearch=i;
             Thai2Eng x = new Thai2Eng(cust);
             
             Ecat ecat =new Ecat();
             ecat.ecat=cust.tcat;
             WordType j = new WordType(ecat);
             
             c="\n"+cust.tsearch +"\n\n\t"+ ecat.ecat +"\n\n\t"+ cust.eentry ;
             String k="";
             if(cust.tsyn.equals(k)){
                c=c; 
             }else{    
                c=c + "\n\nคำเหมือน" +"\n\n\t"+cust.tsyn ;
             }
             if(cust.tant.equals(k)){
                 c=c;
             }else{
                 c=c +"\n\nคำตรงข้าม " +"\n\n\t"+ cust.tant;
             }
             show.setText(c);
             
         try{
            DBConnection Mycon = new DBConnection();
            conn= Mycon.getConnection();         
            stmt = conn.createStatement();
            sql="select * from Thai2Eng where tsearch like '"+i+"%' ";
            ResultSet rs= stmt.executeQuery(sql);    
            int l=0;
            while(rs.next()){
                l++;
             }            
            ResultSet rs1=stmt.executeQuery(sql);
            l=0;
            while(rs1.next()){
                strings[l]=rs1.getString("tsearch");
                l++;
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
    
    List.setListData(strings);

         }

    }//GEN-LAST:event_T_searchActionPerformed

    public static void main(String args[]) {  
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(English_Thai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(English_Thai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(English_Thai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(English_Thai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new English_Thai().setVisible(true);
            }
        });
       
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList List;
    private javax.swing.JTextField T_search;
    private javax.swing.JLabel about;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton search;
    private javax.swing.JTextArea show;
    // End of variables declaration//GEN-END:variables
    
       
}
