package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DbIntegrityException;

public class Program {

	public static void main(String[] args) {
	Connection conn = null;
	PreparedStatement ps = null;
	try {
		conn = DB.getConnection();
		String sql = "delete from department where Id=?";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, 1);
		int linhasAfetadas = ps.executeUpdate();
		System.out.println("linhas afetadas: "+linhasAfetadas);
	} catch (SQLException e) {
		throw new DbIntegrityException(e.getMessage());
	}finally {
		DB.closeStatament(ps);
		DB.closeConnection();
	}
	}

}
