package org.elsys.bg.ip.java;

public class EqualsExample {

	public static void main(String[] args) {
		final Room room1 = new Room();
		final Room room2 = new Room();
		
		setDimensions(room1);
		setDimensions(room2);
		
		// Both return False because objects aren't equal
		System.out.println(room1 == room2);
		System.out.println(room1.equals(room2));

	}

	private static void setDimensions(Room room) {
		room.setHeight(10);
		room.setWidth(20);
		
	}

}
