package sockets;

import java.util.Map.Entry;

public class ListAbsent extends CommandHandler {
	public ListAbsent(String[] line) {
		super(line);
	}
	
	public String listAbsent() {
		String concat = "";
		if(users.containsKey(line[0])) {
			for(Entry<String, User> entry : users.entrySet()) {
			    String key = entry.getKey();
			    User value = entry.getValue();
			    
			    if(value.isIn() == false) {
			    	concat += ":" + key;
			    }
			}
		    return "ok" + concat;			
		} else {
			return "error:notlogged";
		}
	}
}
