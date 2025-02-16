package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;
import db.DbIntegrityException;

public class Program {

	public static void main(String[] args) {
	Connection conn = null;
	Statement st = null;
	try {
		conn = DB.getConnection();
		st = conn.createStatement();
		conn.setAutoCommit(false);
		int linha1 = st.executeUpdate("update seller set BaseSalary=10000 where DepartmentId=3");
		int x=3;
		if(x<7) {
			throw new DbException("simulacao de erro!");
		}
		int linha2 = st.executeUpdate("update seller set BaseSalary=10000 where DepartmentId=4");
         conn.commit();
		System.out.println("linha 1: "+linha1);
      System.out.println("linha 2: "+linha2);
	} catch (SQLException e) {
		try {
			conn.rollback();
			throw new DbException("Desfazendo a operacao!"+e.getMessage());
		} catch (SQLException e1) {
			throw new DbException("erro no rollback!"+e1.getMessage());
	
			
		}
	}finally {
		DB.closeStatament(st);
		DB.closeConnection();
	}
	}

}
