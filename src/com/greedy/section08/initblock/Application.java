package com.greedy.section08.initblock;

public class Application {
	public static void main (String[] args) {
		/* �ʱ�ȭ ��
		 * ������ �ʱ�ȭ�� ������ ��  �ִ� ���� �����ϸ�, �ν��Ͻ� �ʱ�ȭ ���� ���� �ʱ�ȭ ������ ���еȴ�.
		 * 1. �ν��Ͻ� �ʱ�ȭ ��
		 *  : �ν��Ͻ��� �����Ǵ� ������ ������ ȣ�� ������ ���� ������ �ȴ�.
		 *    �ν��Ͻ��� �����ϴ� �������� ȣ���� �ȴ�.
		 *    �ν��Ͻ� ������ �ʱ�ȭ�ϸ� ���� �ʵ忡�� ����������� ���� �����.
		 *  {
		 *  	�ʱ�ȭ ���� �ۼ�
		 *  }
		 *  
		 *  2. ���� �ʱ�ȭ ��
		 *  : Ŭ������ �ε�� �� �ѹ� �����Ѵ�.
		 *    ���� �ʵ带 �ʱ�ȭ�ϸ�, �ν��Ͻ� ������ �ʱ�ȭ���� ���Ѵ�.
		 *  static {
		 *  	�ʱ�ȭ ���� �ۼ�
		 *  }
		 *    */
		
		Product pdt = new Product();
		System.out.println(pdt.getInformation());
		
		Product pdt2 = new Product("�����", 30000, "�����");
		System.out.println(pdt2.getInformation());
	}
}
