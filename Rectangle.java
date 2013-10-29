public class Rectangle {

	private int width,height;
	private Point topLeft;

	public Rectangle(int width, int height) {
		setWidth(width);
		setHeight(height);

	}

	public void doIt(Graphics g) {
		g.fillRect(topLeft,width,height);
	}




	public int width() {
		return width;
	}

	public int height() {
		return height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}