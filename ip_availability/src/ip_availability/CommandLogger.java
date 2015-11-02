package ip_availability;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;

public class CommandLogger {
	public static void main(String[] args) {
		final List<String> currentlyLoggedUsers = new LinkedList<String>();
		
		final Map<String, Integer> usersToLoginCount = 
				new HashMap<String, Integer>();
		
		final Scanner in = new Scanner(System.in);
		String[] result;
		
		while (/*command!="shutdown"*/true) {
			System.out.println("Enter command");
			final String command = in.next();
			
			result = parse(command);
			loginUser(currentlyLoggedUsers, result, usersToLoginCount);
			
//			if("info".equals(result[1])) {
//				System.out.println(currentlyLoggedUsers.get(result[2]));
//			}
			
			if ("shutdown".equals(result[1])) {
				break;
			}
		}
		
		in.close();
		System.out.println("Program terminated");
	}
	private static void loginUser(final List<String> currentlyLoggedUsers, 
			String[] result, final Map<String, Integer> usersToLoginCount) {
		int i = 0;
		if("login".equals(result[1])) {
			i++;
			if(!(currentlyLoggedUsers.contains(result[0]))) {
				currentlyLoggedUsers.add(result[0]);
				usersToLoginCount.put(result[0], i);
				System.out.println(usersToLoginCount.get(result[0]));
				System.out.println(result[0]);
			}	
		}
	}	
	private static String[] parse(String command) throws IllegalArgumentException{		
		final String[] split = command.split(":");
		if(split.length > 2) {
			return split;
		}	
		throw new IllegalArgumentException("Invalid format");
	}

}
