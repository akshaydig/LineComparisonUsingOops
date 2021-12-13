package com.bl.linecomparisonoops;

public class Main {
	public static void main(String[] args) {
		Point p1 = new Point();
		p1.x = 4;
		p1.y = 3;
		Point p2 = new Point();
		p2.x = 3;
		p2.y = 2;

		Line line = new Line();
		line.p1 = p1;
		line.p2 = p2;

		double length = line.getLength();
		System.out.println("Length of Line is :" + length);
	}
}
