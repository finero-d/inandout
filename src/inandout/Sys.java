package inandout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Sys extends JFrame{
   Sys(){
      
        String datas[][]=new String[0][0];
         String title[]= {"deptno","dname","loc"};
         DefaultTableModel model=new DefaultTableModel(datas,title);
         JTable system=new JTable(model);
         JScrollPane scroll=new JScrollPane(system);
         
         add(scroll); 
         
         setSize(1000,1200);
         setVisible(true);
   }
   public static void main(String[] args) {
             new Sys();
   }
}