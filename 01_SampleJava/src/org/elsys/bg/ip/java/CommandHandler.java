package org.elsys.bg.ip.java;

import java.util.Scanner;

public class CommandHandler {

	public static void main(String[] args) {
		System.out.print("Enter command: ");
		final Scanner in = new Scanner(System.in);
		final String command = in.next();
		
		final int result = execute(command);
		
		
		System.out.println("Result: " + result);

		in.close();

	}
	
	private static int execute(String command) throws IllegalArgumentException {
		final String[] split = command.split(":");
		
		if ("sum".equals(split[0])) {
			return Integer.valueOf(split[1])
						+ Integer.valueOf(split[2]);
		}
		throw new IllegalArgumentException(
				"Unknown command: " + command);
	}

}
