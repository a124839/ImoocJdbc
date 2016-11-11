package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Goddess;
import util.DButil;

public class GoddessDao {
	public void addGoddess() {
		
	}
	public void updateGoddess() {
		
	}
	public void deleteGoddess(){
		
	}
	public List<Goddess> queryMore(){
		Connection conn= DButil.getConnection();
		List<Goddess> goddessesList = new ArrayList<Goddess>();
		Statement statement;
		try {
			statement = conn.createStatement();
			ResultSet rs = statement.executeQuery("select name,age from imooc_jdbc_goddess");			
			while (rs.next()) {
				Goddess goddess = new Goddess();
				goddess.setUser_name(rs.getString("user_name"));
				goddess.setAge(rs.getInt("age"));					
				goddessesList.add(goddess);
			}	
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		return goddessesList;
	}
	public void querySingle(){
		
	}
}
