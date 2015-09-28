package Main;

import Main.GeometricObject;

public class Triangle extends GeometricObject{
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public Triangle() {
		
	}
	
	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double getSide1() {
	    return side1;
	}

	public double getSide2() {
	    return side2;
	}

	public double getSide3() {
	    return side3;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	public double getPerimeter(){
		return (side1 + side2 + side3);
	}
	
	public double getArea() {
		double pm = getPerimeter() / 2;
		double area = Math.sqrt(pm * ((pm - side1) * (pm - side2) * (pm - side3)));
		double area100 = area * 100;
		double dArea = Math.round(area100);
		return dArea/100;
	}
	
	public String toString() {
		return ("The triangle: side 1 = " + side1 + " side 2 = " + side2 
				+ " side 3 = " + side3);
	}
}
