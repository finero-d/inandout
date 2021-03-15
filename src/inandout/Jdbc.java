package inandout;
import java.sql.*;


public class Jdbc {
 public static Connection con; 
 public static Connection get() {
  Connection conn=null;
  
  try {
   String id="system";
   String pw="ooracle";
   String url="jdbc:oracle:thin:@192.168.7.51:1521/xe";
   //JDBC 드라이버를 로딩하는 코드
   
   //문자열로 준 클래스 이름이나 인터페이스 이름을 객체로 리턴가능
   Class.forName("oracle.jdbc.driver.OracleDriver");
   //드라이버들이 읽히면 -> 자동 객체 생성되면서 DriverManager에 등록됨

   conn=DriverManager.getConnection(url,id,pw);
   //DriverManager : Connection객체를 연결하는 것

   System.out.println("데이터베이스에 연결됐다");

  }catch(Exception e) {
   System.out.println("로딩 실패");
  }
  return conn;
 }
}