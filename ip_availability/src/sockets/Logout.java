package sockets;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logout extends CommandHandler {
	public Logout(String[] line) {
		super(line);
	}

	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH'_'mm'_'ss.SSSZ");
	String date = sdf.format(new Date());
	
	public String logout() {
		if(!users.containsKey(line[0])) {
			return "error:notlogged";
			
		} else {
			User userToLogout = users.get(line[0]);
			userToLogout.setIn(false);
			userToLogout.setDatesVisited(date);
			users.put(line[0], userToLogout);
			return "ok";
		}
	}
}
