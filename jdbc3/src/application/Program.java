package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DB.getConnection();
			/*
			ps = conn.prepareStatement("insert into seller (Name,Email,BirthDate,BaseSalary,DepartmentId) values(?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, "Marta Lucia figueiredo");
			ps.setString(2, "mlf@gmail.com");
			ps.setDate(3, new java.sql.Date(sdf.parse("12/06/1970").getTime()));
			ps.setDouble(4, 6500.0);
			ps.setInt(5, 4);
			*/
			ps = conn.prepareStatement("insert into department (Name) values ('D1'),('D2')",Statement.RETURN_GENERATED_KEYS);
			int linhasAfetadas = ps.executeUpdate();
			 if(linhasAfetadas>0) {
				 ResultSet rs = ps.getGeneratedKeys();
				 while(rs.next()) {
					 int id = rs.getInt(1);
					 System.out.println("id do registro: "+id);
				 }
				 
					 
				
			 }else {
				 System.out.println("Nenhuma linha afetada!");
			 }
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DB.closeStatament(ps);
			DB.closeConnection();
		}
	}

}
