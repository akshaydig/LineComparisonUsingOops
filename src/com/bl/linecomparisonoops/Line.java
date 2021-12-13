package com.bl.linecomparisonoops;

public class Line {
	Point p1, p2, p3, p4;

	public double getLength(Point r, Point s) {
		return Math.sqrt((r.x - s.x) * (r.x - s.x) + (r.y - s.y) * (r.y - s.y));
	}

	public boolean equals(Double x, Double y) {
		if (x.equals(y))
			return true;
		else
			return false;
	}
}