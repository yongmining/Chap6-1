package com.greedy.section05.parameter;

public class RectAngle {
	
	private double width;
	private double height;
	
	public RectAngle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void calcArea() {
		
		double area = width * height;
		
		System.out.println("�� �簢���� ���̴� " + area + "�Դϴ�.");
	}
	
	public void calcRound() {
		
		double round = (width + height) * 2;
		
		System.out.println("�� �簢���� �ѷ��� " + round + "�Դϴ�.");
	}
	
}
