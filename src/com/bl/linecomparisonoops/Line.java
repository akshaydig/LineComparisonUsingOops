package com.bl.linecomparisonoops;

public class Line {
	Point p1, p2;

	public double getLength() {
		return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
	}
}