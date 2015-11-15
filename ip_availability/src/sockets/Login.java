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
		if(!users.containsKey(line[0])) {
			users.put(line[0], new User(line[0], true, datesVisited.add(date)));
			
		}
		return "ok";
	}

}
