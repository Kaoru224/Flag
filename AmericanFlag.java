class AmericanFlag {
	
	private int x,y;
	private double scale;
	private Rectangle union;
	private Rectangle[] stripes;
	//private Star[] stars;

	public AmericanFlag(int x, int y, double scale) {
		setX(x);
		setY(y);
		setScale(scale);

	}

	public void draw(Graphics g) {
		union.doIt();
	}
	

	public int x() {
		return x;
	}

	public int y() {
		return y;
	}

	public double scale() {
		return scale;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setScale(double scale) {
		return scale;
	}

}