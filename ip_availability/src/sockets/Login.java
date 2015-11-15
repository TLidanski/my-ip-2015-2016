package sockets;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Login extends CommandHandler {
	public Login(String[] line) {
		super(line);
	}
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH'_'mm'_'ss.SSSZ");
	String date = sdf.format(new Date());
	
	public String login() {
		User user = new User(line[0], true, date, 1);
		
		if(!users.containsKey(line[0])) {
			users.put(line[0], user);
			
		}
		return "ok";
	}

}
