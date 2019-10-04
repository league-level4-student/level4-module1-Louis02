package _06_Snake;

import java.awt.Graphics;

public class SnakeSegment {
	private Location location;
	private int size;

	public SnakeSegment(Location loc, int size) {
		this.location = new Location(loc.x, loc.y);
		this.size = size;
	}
	
	public void setLocation(Location loc) {
		this.location = new Location(loc.x, loc.y);
	}
	
	public Location getLocation() {
		return location;
	}
	
	public void draw(Graphics g) {
		g.setColor(Snake.SNAKE_COLOR);
		g.drawRect(location.x * size, location.y * size, size, size);;
	}
}
