package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = DB.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from department");
			while(rs.next()) {
				System.out.println(rs.getInt("Id")+", "+rs.getString("Name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DB.closeStatament(stmt);
			DB.closeResultSet(rs);
			DB.closeConnection();
		}
	}

}
