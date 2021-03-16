package inandout;

import inandout.결제하기;
import inandout.MenuSelect;
import inandout.Option;
import inandout.Jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Eqrtest02 {
   public static void main(String[] args) throws SQLException {
      
      Connection conn = null;
      PreparedStatement pstm = null;
      ResultSet r = null;
      
      try {
         int no = 9;
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
         
//         for(int i=0;i<결제하기.or.length;i++) {
//            if(결제하기.orderlist[i]!=null) {
//                if(결제하기.orderlist[i]=="블랙 밀크티") {
//                  black=Integer.parseInt(결제하기.count[i].getText());
//               }
//               else if(결제하기.orderlist[i]=="타로 밀크티") {
//                  taro=Integer.parseInt(결제하기.count[i].getText());
//               }
//               else if(결제하기.orderlist[i]=="우롱 밀크티") {
//                  oolong=Integer.parseInt(결제하기.count[i].getText());
//               }
//               else if(결제하기.orderlist[i]=="딸기 쥬얼리 밀크티") {
//                  berry=Integer.parseInt(결제하기.count[i].getText());
//               }
//               else if(결제하기.orderlist[i]=="얼그레이 밀크티") {
//                  earlgrey=Integer.parseInt(결제하기.count[i].getText());
//               }
//               else if(결제하기.orderlist[i]=="자스민 밀크티") {
//                  jasmin=Integer.parseInt(결제하기.count[i].getText());
//               }
//               else if(결제하기.orderlist[i]=="망고 스무디") {
//                  mango=Integer.parseInt(결제하기.count[i].getText());
//               }
//               else if(결제하기.orderlist[i]=="청포도 스무디") {
//                  grape=Integer.parseInt(결제하기.count[i].getText());
//               }
//               else if(결제하기.orderlist[i]=="제주 그린티 스무디") {
//                  greentea=Integer.parseInt(결제하기.count[i].getText());
//               }
//               else if(결제하기.orderlist[i]=="치즈폼 딥초코 스무디") {
//                  cheese=Integer.parseInt(결제하기.count[i].getText());
//               }
//               else if(결제하기.orderlist[i]=="딸기 요구르트 크러쉬") {
//                  yogurt=Integer.parseInt(결제하기.count[i].getText());
//               }
//               else if(결제하기.orderlist[i]=="초코 쿠앤크 스무디") {
//                  cookie=Integer.parseInt(결제하기.count[i].getText());
//               }          
//            }         
//         }
//         if(결제하기.money.getText()!=null) {
//            price=Integer.parseInt(결제하기.money.getText());
//         }
         
         String que = "insert into orderlist values("
          +no+","+black+","+taro+","+oolong+","+berry+","+earlgrey
          +","+jasmin+","+mango+","+grape+","+greentea+","+cheese
          +","+yogurt+","+cookie+",to_char(sysdate, 'YYYY/MM/DD'),to_char(sysdate,'hh24:mi:ss'),"+price+")";
         
         conn = Jdbc.get();
         pstm=conn.prepareStatement(que);
         r=pstm.executeQuery();
         
         
      } catch (Exception e) {
         e.printStackTrace();
      }
      r.close();
      pstm.close();
      conn.close();
   }
}