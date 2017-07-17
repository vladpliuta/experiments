package by.pliuta.experements.experementPi;

public class Point {
	private int x;
	private int y;
	private int border;

	public Point(int border) {
		this.border = border;
		this.x = (int) (Math.random() * 2 * border - border);
		this.y = (int) (Math.random() * 2 * border - border);
	}

	public int getBorder() {
		return border;
	}

	public void setBorder(int border) {
		this.border = border;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";

	}
}
