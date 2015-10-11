package org.elsys.bg.ip.java;

public class ClassesExample {

	public static void main(String[] args) {
		// Navigate cursor to Room() and press Ctrl+2 L
		// to create local var automatically
		// Press Ctrl+2 F to create class field
		// Create object of type Room
		
		// Final means that reference room can't be 
		// changed to other object
		final Room room = new Room();
		// Compile error, cause of final keyword
//		room = new Room();
		
		room.setHeight(10);
		room.setWidth(20);
		// Get value of obj field
		final int height = room.getHeight();
		
		System.out.println(room.calculateArea());
		
		System.out.println(room.getHeight());
		System.out.println(room.getWidth());
		
	}

}
