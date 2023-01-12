package com.greedy.section04.constructor;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		/* ��ü ���� ����
		 * Ŭ������ ���۷������� = new Ŭ������();
		 * -> Ŭ�����ڷ��� ���۷������� = new �������Լ�();
		 * */
		
		/* �����ڶ�?
		 * �ν��Ͻ��� ������ �� �ʱ� ������ ����� �ۼ��ϴ� �޼ҵ��� ����ü
		 * ��, �ѹ��� ȣ���� �� �ִ�.
		 * �ַ� ��� ������ �ʵ带 �ʱ�ȭ �� �������� ����Ѵ�.
		 * */
		User user1 = new User();
		System.out.println(user1.getInformation());
//		System.out.println(user1);
		
		User user2 = new User("user01", "pass01", "ȫ�浿");
		System.out.println(user2.getInformation());
//		System.out.println(user2);
		
		User user3 = new User("user02", "pass02", "������", new java.util.Date());
		System.out.println(user3.getInformation());
		
		User user4 = new User(user3);
		System.out.println(user4.getInformation());
	}

}
