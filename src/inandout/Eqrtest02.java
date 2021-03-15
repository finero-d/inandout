package inandout;

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
			int black = 12;
			int taro = 1;
			int oolong = 1;
			int berry = 1;
			int earlgrey = 14;
			int jasmin = 11;
			int mango = 21;
			int grape = 21;
			int greentea = 1;
			int cheese = 21;
			int yogurt = 1;
			int cookie = 1;
			int price = 640000;
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