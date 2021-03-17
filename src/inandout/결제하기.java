package inandout;

import inandout.Structure;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import inandout.Option;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class 결제하기 extends JPanel {
   
   private JButton 다음,취소;
   static String or[]=MenuSelect.Orderlist_ta.getText().split("\n");
   static JLabel orderlist[]=new JLabel[or.length];
   static JTextField count[]=new JTextField[or.length];
   static JLabel money=new JLabel();
   int sum=0;
   
   결제하기() {
      setSize(1000,1200);
      setLayout(null);      
      setBackground(Color.white);
      
      JLabel lb1=new JLabel("주문하기");
      JLabel lb2=new JLabel("주문내역을 확인해주세요");
      lb1.setBounds(0, 0, 1000,50);
      lb2.setBounds(0,40,1000,50);
      lb1.setFont(new Font("Bernard MT", Font.BOLD, 50));
      lb2.setFont(new Font("Bernard MT", Font.BOLD, 30));
      this.add(lb1);
      this.add(lb2);
      
      다음=new JButton("다음");
      add(다음);
      Color color=new Color(152, 59, 67);
      다음.setBackground(color);
      다음.setFont(new Font("Bernard MT", Font.BOLD, 20));
      다음.setForeground(Color.white);
      다음.setLocation(500,700);
      다음.setSize(100,100);
      
      취소=new JButton("취소");
      add(취소);
      취소.setBackground(color);
      취소.setFont(new Font("Bernard MT", Font.BOLD, 20));
      취소.setForeground(Color.white);
      취소.setLocation(300,700);
      취소.setSize(100,100);
      
      취소.setBorderPainted(false);
      //다음.setBorderPainted(false);
      
      취소.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            Structure.getter(new Home());
         }
      });
      다음.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	 Connection conn = null;
             PreparedStatement pstm = null;
             ResultSet r = null;
             
             try {
                int no = 10;
                int black=0;
                int taro=0;
                int oolong=0;
                int berry=0;
                int earlgrey=0;
                int jasmin=0;
                int mango=0;
                int grape=0;
                int greentea=0;
                int cheese=0;
                int yogurt=0;
                int cookie=0;
                int price=0;
                
                
//            for(int i=0;i<결제하기.or.length;i++) {
//              if(결제하기.orderlist[i].getText()!=null) {
//              if(orderlist[i].getText()=="블랙 밀크티") {
//                black=Integer.parseInt(결제하기.count[i].getText());
//                System.out.println(black);
//             }
//             else if(결제하기.orderlist[i].getText()=="타로 밀크티") {
//                taro=Integer.parseInt(결제하기.count[i].getText());
//             }
//             else if(결제하기.orderlist[i].getText()=="우롱 밀크티") {
//                oolong=Integer.parseInt(결제하기.count[i].getText());
//             }
//             else if(결제하기.orderlist[i].getText()=="딸기 쥬얼리 밀크티") {
//                berry=Integer.parseInt(결제하기.count[i].getText());
//             }
//             else if(결제하기.orderlist[i].getText()=="얼그레이 밀크티") {
//                earlgrey=Integer.parseInt(결제하기.count[i].getText());
//             }
//             else if(결제하기.orderlist[i].getText()=="자스민 밀크티") {
//                jasmin=Integer.parseInt(결제하기.count[i].getText());
//             }
//             else if(결제하기.orderlist[i].getText()=="망고 스무디") {
//                mango=Integer.parseInt(결제하기.count[i].getText());
//             }
//             else if(결제하기.orderlist[i].getText()=="청포도 스무디") {
//                grape=Integer.parseInt(결제하기.count[i].getText());
//             }
//             else if(결제하기.orderlist[i].getText()=="제주 그린티 스무디") {
//                greentea=Integer.parseInt(결제하기.count[i].getText());
//             }
//             else if(결제하기.orderlist[i].getText()=="치즈폼 딥초코 스무디") {
//                cheese=Integer.parseInt(결제하기.count[i].getText());
//             }
//             else if(결제하기.orderlist[i].getText()=="딸기 요구르트 크러쉬") {
//                yogurt=Integer.parseInt(결제하기.count[i].getText());
//             }
//             else if(결제하기.orderlist[i].getText()=="초코 쿠앤크 스무디") {
//                cookie=Integer.parseInt(결제하기.count[i].getText());
//             }          
//          }         
//       }
       if(결제하기.money.getText()!=null) {
          price=Integer.parseInt(결제하기.money.getText());
       }
                
                String que = "insert into orderlist values("
                 +no+","+black+","+taro+","+oolong+","+berry+","+earlgrey
                 +","+jasmin+","+mango+","+grape+","+greentea+","+cheese
                 +","+yogurt+","+cookie+","+price+")";
                
                conn = Jdbc.get();
                pstm=conn.prepareStatement(que);
                r=pstm.executeQuery();
                
                
             } catch (Exception ee) {
                ee.printStackTrace();
             }
             try {
            	 r.close();
            	 pstm.close();
            	 conn.close();	
			} catch (Exception e2) {
				e2.printStackTrace();
			}
            Structure.getter(new 결제방법());
         }
      });
      
      
      JPanel order=new JPanel();
      order.setBounds(150, 120, 500, 100);
      order.setBackground(Color.white);
      order.setLayout(new GridLayout(or.length,4,0,20));
      
      add(order);
      
      for(int i=0;i<or.length;i++) {  
         orderlist[i]=new JLabel(or[i]);
         //System.out.println(orderlist[i].getText());
         
         order.add(orderlist[i]);
         orderlist[i].setFont(new Font("Bernard MT", Font.BOLD, 30));
      }
       
      JPanel order1=new JPanel();
      order1.setBounds(500, 120, 150, 100);
      order1.setBackground(Color.white);
      order1.setLayout(new GridLayout(or.length,3,0,20));
      add(order1);
      
      JButton plus[]=new JButton[or.length];
      
      JButton minus[]=new JButton[or.length];
      
      
      JLabel 가격=new JLabel("총 주문금액");
      
      /*
      for(int i=0;i<or.length;i++) {
         int sum=0;
         int co=Integer.parseInt(count[i].getText());
         sum=sum+(5000*co);
         money.setText(sum+"");
         
      }
      */
      가격.setBounds(30, 600, 500,50);
      money.setBounds(500,600,500,50);
      가격.setFont(new Font("Bernard MT", Font.BOLD, 30));
      money.setFont(new Font("Bernard MT", Font.BOLD, 30));
      this.add(가격);
      this.add(money);
      
      
      for(int i=0;i<or.length;i++) {
         sum++;
         minus[i]=new JButton("-");
         count[i]=new JTextField("1");
         plus[i]=new JButton("+");
         
          minus[i].setFont(new Font("Bernard MT", Font.BOLD, 15));
            count[i].setFont(new Font("Bernard MT", Font.BOLD, 15));
            plus[i].setFont(new Font("Bernard MT", Font.BOLD, 15));
         
         order1.add(plus[i]);
         order1.add(count[i]);
         order1.add(minus[i]);
         
         plus[i].setBackground(color);
         minus[i].setBackground(color);
         
         plus[i].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               Object pluss=(JButton)e.getSource();
               
               if(pluss==plus[0]) {
                  int co=Integer.parseInt(count[0].getText());
                  count[0].setText(Integer.toString(co+1));
                  sum++;
                  money.setText((sum*5000)+"");
               }
               if(pluss==plus[1]) {
                  int co=Integer.parseInt(count[1].getText());
                  count[1].setText(Integer.toString(co+1));
                  sum++;
                  money.setText((sum*5000)+"");
               }
               if(pluss==plus[2]) {
                  int co=Integer.parseInt(count[2].getText());
                  count[2].setText(Integer.toString(co+1));
                  sum++;
                  money.setText((sum*5000)+"");
               }
               if(pluss==plus[3]) {
                  int co=Integer.parseInt(count[3].getText());
                  count[3].setText(Integer.toString(co+1));
                  sum++;
                  money.setText((sum*5000)+"");
               }
               if(pluss==plus[4]) {
                  int co=Integer.parseInt(count[4].getText());
                  count[4].setText(Integer.toString(co+1));
                  sum++;
                  money.setText((sum*5000)+"");
               }
               if(pluss==plus[5]) {
                  int co=Integer.parseInt(count[5].getText());
                  count[5].setText(Integer.toString(co+1));
                  sum++;
                  money.setText((sum*5000)+"");
               }
               if(pluss==plus[6]) {
                  int co=Integer.parseInt(count[6].getText());
                  count[6].setText(Integer.toString(co+1));
                  sum++;
                  money.setText((sum*5000)+"");
               }
               if(pluss==plus[7]) {
                  int co=Integer.parseInt(count[7].getText());
                  count[7].setText(Integer.toString(co+1));
                  sum++;
                  money.setText((sum*5000)+"");
               }
               if(pluss==plus[8]) {
                  int co=Integer.parseInt(count[8].getText());
                  count[8].setText(Integer.toString(co+1));
                  sum++;
                  money.setText((sum*5000)+"");
               }
               if(pluss==plus[9]) {
                  int co=Integer.parseInt(count[9].getText());
                  count[9].setText(Integer.toString(co+1));
                  sum++;
                  money.setText((sum*5000)+"");
               }
               if(pluss==plus[10]) {
                  int co=Integer.parseInt(count[10].getText());
                  count[10].setText(Integer.toString(co+1));
                  sum++;
                  money.setText((sum*5000)+"");
               }
               if(pluss==plus[11]) {
                  int co=Integer.parseInt(count[11].getText());
                  count[11].setText(Integer.toString(co+1));
                  sum++;
                  money.setText((sum*5000)+"");
               }
               
            }
         });
         minus[i].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               Object minuss=(JButton)e.getSource();
               
               if(minuss==minus[0]&& Integer.parseInt(count[0].getText())>1) {
                  int co=Integer.parseInt(count[0].getText());
                  count[0].setText(Integer.toString(co-1));
                  sum--;
                  money.setText((sum*5000)+"");
               }
               if(minuss==minus[1]&& Integer.parseInt(count[1].getText())>1) {
                  int co=Integer.parseInt(count[1].getText());
                  count[1].setText(Integer.toString(co-1));
                  sum--;
                  money.setText((sum*5000)+"");
               }
               if(minuss==minus[2]&& Integer.parseInt(count[2].getText())>1) {
                  int co=Integer.parseInt(count[2].getText());
                  count[2].setText(Integer.toString(co-1));
                  sum--;
                  money.setText((sum*5000)+"");
               }
               if(minuss==minus[3]&& Integer.parseInt(count[3].getText())>1) {
                  int co=Integer.parseInt(count[3].getText());
                  count[3].setText(Integer.toString(co-1));
                  sum--;
                  money.setText((sum*5000)+"");
               }
               if(minuss==minus[4]&& Integer.parseInt(count[4].getText())>1) {
                  int co=Integer.parseInt(count[4].getText());
                  count[4].setText(Integer.toString(co-1));
                  sum--;
                  money.setText((sum*5000)+"");
               }
               if(minuss==minus[5]&& Integer.parseInt(count[5].getText())>1) {
                  int co=Integer.parseInt(count[5].getText());
                  count[5].setText(Integer.toString(co-1));
                  sum--;
                  money.setText((sum*5000)+"");
               }
               if(minuss==minus[6]&& Integer.parseInt(count[6].getText())>1) {
                  int co=Integer.parseInt(count[6].getText());
                  count[6].setText(Integer.toString(co-1));
                  sum--;
                  money.setText((sum*5000)+"");
               }
               if(minuss==minus[7]&& Integer.parseInt(count[7].getText())>1) {
                  int co=Integer.parseInt(count[7].getText());
                  count[7].setText(Integer.toString(co-1));
                  sum--;
                  money.setText((sum*5000)+"");
               }
               if(minuss==minus[8]&& Integer.parseInt(count[8].getText())>1) {
                  int co=Integer.parseInt(count[8].getText());
                  count[8].setText(Integer.toString(co-1));
                  sum--;
                  money.setText((sum*5000)+"");
               }
               if(minuss==minus[9]&& Integer.parseInt(count[9].getText())>1) {
                  int co=Integer.parseInt(count[9].getText());
                  count[9].setText(Integer.toString(co-1));
                  sum--;
                  money.setText((sum*5000)+"");
               }
               if(minuss==minus[10]&& Integer.parseInt(count[10].getText())>1) {
                  int co=Integer.parseInt(count[10].getText());
                  count[10].setText(Integer.toString(co-1));
                  sum--;
                  money.setText((sum*5000)+"");
               }
               if(minuss==minus[11]&& Integer.parseInt(count[11].getText())>1) {
                  int co=Integer.parseInt(count[11].getText());
                  count[11].setText(Integer.toString(co-1));
                  sum--;
                  money.setText((sum*5000)+"");
                  
               }
               
               
               
               
            }
            
         });
         
      }
      
      
        
      
      
      
      
      
        
        
   }
   }