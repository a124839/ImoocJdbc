package action;

import java.sql.SQLException;
import java.util.List;

import dao.GoddessDao;
import model.Goddess;

public class Action {

	public static void main(String[] args) throws SQLException {
		GoddessDao gd = new GoddessDao();
		
		List<Goddess> gList = gd.queryMore();
		
		for (Goddess goddess : gList) {
			System.out.println(goddess.getUser_name()+";"+goddess.getAge());
		}
	}

}
