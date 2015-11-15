package sockets;

import java.util.LinkedList;
import java.util.List;

public class User {
	public String name;
	private boolean in;
	public Integer timesVisited;
	public List<String> datesVisited = new LinkedList<String>();
	
	public User(String name, boolean in, String datesVisited, 
			Integer timesVisited) {
		this.name = name;	
		this.in = in;
		this.datesVisited.add(datesVisited);
		this.timesVisited += timesVisited;
	}

	public Integer getTimesVisited() {
		return timesVisited;
	}

	public String getName() {
		return name;
	}

	public boolean isIn() {
		return in;
	}

	public List<String> getDatesVisited() {
		return datesVisited;
	}

	
	
}