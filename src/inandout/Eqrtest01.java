package inandout;

import inandout.Jdbc;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Eqrtest01 {
	public static void main(String[] args) throws SQLException {
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet r = null;
		
		try {
			String que = "select * from orderlist";
			
			conn = Jdbc.get();
			pstm=conn.prepareStatement(que);
			r=pstm.executeQuery();
			
			while(r.next()) {
				int no = r.getInt(1);
				int black = r.getInt(2);
				int taro = r.getInt(3);
				int oolong = r.getInt(4);
				int berry = r.getInt(5);
				int earlgrey = r.getInt(6);
				int jasmin = r.getInt(7);
				int mango = r.getInt(8);
				int grape = r.getInt(9);
				int greentea = r.getInt(10);
				int cheese = r.getInt(11);
				int yogurt = r.getInt(12);
				int cookie = r.getInt(13);
				java.sql.Date date = r.getDate(14);
				java.sql.Date time = r.getDate(15);
				int price = r.getInt(16);
				
				System.out.println(no + " " + black + " " + taro + " " + oolong + " " + berry + " " + 
				earlgrey + " " + jasmin + " " + mango + " " + grape + " " + greentea + " " + cheese + " " + 
						yogurt + " " + cookie + " " + date + " " + time + " " + price);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		r.close();
		pstm.close();
		conn.close();
	}
}
