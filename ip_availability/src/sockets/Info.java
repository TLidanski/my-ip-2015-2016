package sockets;

import java.util.Iterator;
import java.util.List;

public class Info extends CommandHandler {
	public Info(String[] line) {
		super(line);
	}
	
	public String info() {
		if(users.containsKey(line[0])) {
			if(users.containsKey(line[2])) {
				User userInfo = users.get(line[2]);
				Integer timesVisited = userInfo.getTimesVisited();
				boolean in = userInfo.isIn();
				String name = userInfo.getName();
				String datesVisited = datesToString(userInfo.getDatesVisited());
				return "ok:" + name + ":" + in + ":" + timesVisited + ":" + datesVisited;
			} else {
				return "error:user2notlogged";
			}			
		} else {
			return "error:notlogged";
		}
	}
	
	private String datesToString(List<String> list) {
		String concat= "";
		Iterator<String> i = list.iterator();
		while(i.hasNext()) {
			concat += ":" + i.next();
		}
		return concat;
	}
}
