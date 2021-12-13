package com.bl.linecomparisonoops;

public class Line {
	Point p1, p2, p3, p4;

	public double getLength(Point r, Point s) {
		return Math.sqrt((r.x - s.x) * (r.x - s.x) + (r.y - s.y) * (r.y - s.y));
	}

	public void compare(Double x, Double y) {
		if (x.equals(y)) {
			System.out.println("LengthOne and LengthTwo are Equal");
			;
		} else if (x.compareTo(y) < 0) {
			System.out.println("LengthTwo is greater than LengthOne");
		} else
			System.out.println("LengthOne is greater than lengthTwo");
	}
}