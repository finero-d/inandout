package inandout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Sys extends JFrame{
   Sys(){
      
      
      String datas[][]=new String[0][0];
      String title[]= {"주문번호","black","taro","oolong","berry","earlgrey","jasmin"};
      DefaultTableModel model=new DefaultTableModel(datas,title);
      JTable system=new JTable(model);
      JScrollPane scroll=new JScrollPane(system);
      add(system);
      
      
      
      
      
      setSize(1000,1200);
      setVisible(true);
   }

   

}