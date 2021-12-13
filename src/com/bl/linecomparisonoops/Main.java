package com.bl.linecomparisonoops;

public class Main {
	public static void main(String[] args) {
		Point p1 = new Point();
		p1.x = 5;
		p1.y = 3;
		Point p2 = new Point();
		p2.x = 3;
		p2.y = 2;
		Point p3 = new Point();
		p3.x = 5;
		p3.y = 3;
		Point p4 = new Point();
		p4.x = 3;
		p4.y = 2;

		Line lineOne = new Line();
		lineOne.p1 = p1;
		lineOne.p2 = p2;
		Line lineTwo = new Line();
		lineTwo.p3 = p3;
		lineTwo.p4 = p4;

		Double lengthOne = lineOne.getLength(p1, p2);
		Double lengthTwo = lineTwo.getLength(p3, p4);

		Line line = new Line();
		line.compare(lengthOne, lengthTwo);
	}
}