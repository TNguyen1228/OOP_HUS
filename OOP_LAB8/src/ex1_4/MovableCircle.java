package ex1_4;



public class MovableCircle implements Movable {

	private MovablePoint center;
	private int radius;

	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		center = new MovablePoint(x, y, xSpeed, ySpeed);
		this.radius = radius;
	}

	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		center.moveUp();
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		center.moveDown();
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		center.moveLeft();
	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		center.moveRight();
	}

	@Override
	public String toString() {
		return String.format("(%1$d, %2$d), speed (%3$d, %4$d), radius=%5$d", 
							center.x, center.y, center.xSpeed,center.ySpeed, radius);
	}
}
