package inandout;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Sys extends JFrame{
   Object datas[][]=new Object[0][0];
   String title[]= {"no","black","taro","oolong","berry","earlgrey","jasmin","mango","grape","greentea","cheese","yogurt","cookie","주문일자","가격"};
   DefaultTableModel model;
   JTable system;
   JScrollPane scroll;
   JPanel panel;
   JPanel panel1;
   JLabel label;
   JButton jbutton;
   Font f1; 
   Font f2;
   
   
   
   
   Connection con=null;
   PreparedStatement pstmt=null;
   ResultSet rs=null;
   
   
   
   public Sys() {
      
      model=new DefaultTableModel(datas,title);
      system=new JTable(model);
      scroll=new JScrollPane(system,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
      panel=new JPanel();
      panel1=new JPanel();
      
      
      panel.add(scroll);      
      panel.setLayout(null);
      panel1.setLayout(null);
      scroll.setBounds(40, 150 ,900, 700);
      panel1.setBounds(0, 0, 1000, 100);
      panel1.setBackground(new Color(152, 59, 67));
      
      f1=new Font("Aharoni 굵게",Font.BOLD,30);
      f2=new Font("Aharoni 굵게",Font.BOLD,15);
      label=new JLabel("판매 현황");
      label.setBounds(30, 25, 200, 50);
      label.setForeground(Color.white);
      label.setFont(f1);
      
      
      jbutton=new JButton("홈으로");
      jbutton.setBounds(790, 970, 150,30 );
      jbutton.setFont(f2);
      
      jbutton.addActionListener(new ActionListener() {   
      public void actionPerformed(ActionEvent e) {
         setVisible(false);         
      }
   });
      this.add(panel1);
      this.add(jbutton);
      panel1.add(label);
      this.add(panel);
      system.getColumnModel().getColumn(13).setPreferredWidth(180);
      
      
      setSize(1000,1200);
      setVisible(true);
      
      connect();
      select();
      
      this.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent e) {
            try {
               if(rs!=null) rs.close();
               if(pstmt!=null) pstmt.close();
               if(con!=null) con.close();
            }catch(Exception e2) {
               System.exit(0);
            }
         }
   });
   }
   
   private void connect() {
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         String url="jdbc:oracle:thin:@192.168.35.201:1521:xe";
         con=DriverManager.getConnection(url,"sys as sysdba","1626");
         System.out.println("접속 : "+con);
      }catch(Exception e) {
         System.out.println("DB 접속 오류 : "+e);
      }
   }
   
   public void select() {
      try {
         String sql="select * from orderlist";
          pstmt=con.prepareStatement(sql);
          System.out.println("pstmt : "+pstmt);
          rs=pstmt.executeQuery();
          System.out.println("rs : "+rs);
          
          while(rs.next()) {
             String no=rs.getString("no");
             String black=rs.getString("black");
             String taro=rs.getString("taro");
             String oolong=rs.getString("oolong");
             String berry=rs.getString("berry");
             String earlgrey=rs.getString("earlgrey");
             String jasmin=rs.getString("jasmin");
             String mango=rs.getString("mango");
             String grape=rs.getString("grape");
             String greentea=rs.getString("greentea");
             String cheese=rs.getString("cheese");
             String yogurt=rs.getString("yogurt");
             String cookie=rs.getString("cookie");
             java.sql.Date date=rs.getDate("날짜");           
             String price=rs.getString("가격");
             Object data[]= {no,black,taro,oolong,berry,earlgrey,jasmin,mango,grape,greentea,cheese,yogurt,cookie,date,price};
             model.addRow(data);
          }
      }catch(Exception e) {
         System.out.println("select() 실행 오류 : "+e);
      }
   }

}