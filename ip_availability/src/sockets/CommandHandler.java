package sockets;

import java.util.HashMap;
import java.util.Map;

public class CommandHandler {
	protected String[] line;
	public Map<String, User> users = new HashMap<String, User>(); 
	
	public CommandHandler(String[] line) {
		this.line = line;
	}
	
	 

	public Object execute() {
		switch (line[1]) {
		case "login":
			return new Login(line).login();
		break;
		case "info":
			return new Info(line);
		break;	

		default: 
			break;
		}
	}
}
