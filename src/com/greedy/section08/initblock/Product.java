package com.greedy.section08.initblock;

public class Product {
	private String name = "������";
	private int price = (int)(Math.random() * 100000);
	private static String brand= "���";
	
	{
		name = "���̾�";
		int sum = 0;
		price = (int)(Math.random() * 100000);
		for(int i = 0; i < 100000; i++) {
			sum += (int) (Math.random() * 10);
		}
		price = sum;
		brand = "����";
		System.out.println("�ν��Ͻ� �ʱ�ȭ �� ������...");
	}
	
	static {
//		name = "���̻�";
//		price = 1500000;
		brand = "���";
		System.out.println("���� �ʱ�ȭ �� ������...");
		
	}
	
	
	public Product() {
		System.out.println("�⺻ ������ ȣ���...");
	}
	
	public Product(String name, int price, String brand) {
		
		this.name = name;
		this.price = price;
		Product.brand = brand;
	
		System.out.println("�Ű����� �ִ� ������ ȣ���...");
	}
	
	public String getInformation() {
		
		return "Product [name= " + this.name + ", price= " + price + ", brand= " + brand + " ]";
		
	}
}
