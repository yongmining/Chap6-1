package com.greedy.section06.statickeyword;

public class StaticMethodTest {
	
	private int count;
	
	public void nonStaticMethod() {
		
		this.count++;
		
		System.out.println("nonStaticMethod ȣ���...");
	}
	
	public static void staticMethod() {
		
//		this.count++;		//static �޼ҵ�� �ν��Ͻ��� �������� �ʰ� ����ϴ� �޼ҵ� �̱� ������ this�� �ּҰ� �� �� ����.
		
		System.out.println("staticMethod ȣ���...");
	}

}
