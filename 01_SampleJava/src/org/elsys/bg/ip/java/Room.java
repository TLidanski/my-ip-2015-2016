package org.elsys.bg.ip.java;

public class Room {
	// Define fields
	private int width;
	private int height;
	
	// Getters and setters
	// Alt+Shift+R to generate getters and setters
	// Or right click->Source->Generate getters and setters
	public int getWidth() {
		return width;
	}	
	
	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getHeight() {
		return height;
	}
	// Type the method name and hit Ctrl+Space
	// Define method
	public int calculateArea() {
		// To change the return type from void to int hit Ctrl+1
		// Return value
		return height * width;

	}
	// When overriding equals() consider overriding hashCode()
	@Override
	public boolean equals(Object obj) {
		// Optimization
		/*if (obj == this) {
			return true;
		}*/
		if (obj instanceof Room) {
			final Room room2 = (Room) obj;
			return room2.height == height && room2.width == width;
		}
		return false;
	}
	
}
