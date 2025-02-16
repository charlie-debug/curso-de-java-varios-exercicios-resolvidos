package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;

public class Program {

	public static void main(String[] args) {
	Connection conn = null;
	PreparedStatement ps = null;
	try {
		conn = DB.getConnection();
		String sql = "update seller set BaseSalary = BaseSalary+? where departmentId=?";
		ps = conn.prepareStatement(sql);
		ps.setDouble(1, 400.0);
		ps.setInt(2, 4);
		int linhasAfetadas = ps.executeUpdate();
		System.out.println("linhas afetadas: "+linhasAfetadas);
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		DB.closeStatament(ps);
		DB.closeConnection();
	}
	}

}
