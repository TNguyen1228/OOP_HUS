package ex2_7;

public class MyLine {
	private MyPoint begin;
	private MyPoint end;

	public MyLine(int x1, int y1, int x2, int y2) {
		begin = new MyPoint(x1, y1);
		end = new MyPoint(x2, y2);
	}

	public MyLine(MyPoint begin, MyPoint end) {
		this.begin = begin;
		this.end = end;
	}

	public MyPoint getBegin() {
		return begin;
	}

	public void setBegin(MyPoint begin) {
		this.begin = begin;
	}

	public MyPoint getEnd() {
		return end;
	}

	public void setEnd(MyPoint end) {
		this.end = end;
	}

	public int getBeginX() {
		return begin.getX();
	}

	public int getBeginY() {
		return begin.getY();
	}

	public int getEndX() {
		return end.getX();
	}

	public int getEndY() {
		return end.getY();
	}

	public void setBeginX(int x) {
		begin.setX(x);
	}

	public void setBeginY(int y) {
		begin.setY(y);
	}

	public void setEndX(int x) {
		end.setX(x);
	}

	public void setEndY(int y) {
		end.setY(y);
	}

	public int[] getBeginXY() {
		int begin[] = { getBeginX(), getBeginY() };
		return begin;
	}

	public void setBeginXY(int x, int y) {
		begin.setXY(x, y);
	}

	public int[] getEndXY() {
		int end[] = { getEndX(), getEndY() };
		return end;
	}

	public void setEndXY(int x, int y) {
		end.setXY(x, y);
	}

	public double getLength() {
		int xDiff = getEndX() - getBeginX();
		int yDiff = getEndY() - getBeginY();
		return (double) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
	}

	public double getGradient() {
		int xDiff = getEndX() - getBeginX();
		int yDiff = getEndY() - getBeginY();
		return Math.atan2(yDiff, xDiff);
	}

	public String toString() {
		return "Line[begin=(" + begin.getX() + "," + begin.getY() 
				+ "), end=(" + end.getX() + "," + end.getY() + ")]";
	}
	
}
