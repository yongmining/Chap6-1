package com.greedy.section04.dto;

public class Application {

	public static void main(String[] args) {
		
		/* 1. �����ڸ� �̿��� �ʱ�ȭ
		 * ���� : setter �޼ҵ带 ���� �� ȣ���ؼ� ������� �ʰ� �� ���� ȣ��� �ν��Ͻ��� ���� �� �ʱ�ȭ �� �� �ִ�.
		 * ���� : �ʵ带 �ʱ�ȭ �� �Ű������� ������ ����� �� ���� ��� �������� �Ѵ�.
		 *       ȣ�� �� ���ڰ� �������� ��� ��� ���� � �ʵ带 �ǹ��ϴ��� �� ������ ���� �����.
		 *       ��) ���̵�, ��й�ȣ, �̸��� ��� greedy�� ���
		 *       new User("greedy", "greedy", "greedy");
		 * 
		 * 2. �����ڸ� �̿��� �ʱ�ȭ
		 * ���� : �ʵ带 �ʱ�ȭ�ϴ� ������ ���� � �ʵ忡 ���ԵǴ��� �����ϱ� ���ϴ�
		 *       ��)
		 *       User user = new User();
		 *       user.setId("greedy");
		 *       user.setPwd("greedy");
		 *       user.setName("greedy"); 
		 * ���� : �ϳ��� �ν��Ͻ��� ������ �� �� ���� ȣ��� ������ �ʴ´�.
		 * */
		UserDTO user1 = new UserDTO("greedy", "greedy", "greedy", new java.util.Date());
		System.out.println(user1.getInformation());
		
		UserDTO user2 = new UserDTO();
		user2.setId("greedy");
		user2.setPwd("greedy");
		user2.setName("greedy");
		user2.setEnrollDate(new java.util.Date());
		System.out.println(user2.getInformation());
		
		/* �� �� ���� ������� ������ �ذ��� ��� : ��������
		 * User user3 = User.builder()
		 * 				.id("greedy")
		 *              .pwd("greedy")
		 *              .name("greedy")
		 *              .enrollDate(new java.util.Date())
		 *              .build();
		 * */
	}

}
