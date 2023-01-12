package com.greedy.section03.dto;

public class Application {

	public static void main(String[] args) {
		
		/* ���� ���ְ� �ƴ� �����͸� �ϳ��� ��ġ�� ���� ��ü(Data Transfer Object)�� ���
		 * ������ ������� �߻�ȭ�� ���� �ʰ� �����͸� ������� �߻�ȭ�� �Ѵ�.
		 * �����δ� ĸ��ȭ ��Ģ�� ����Ǳ� ������ �ּ����� ��Ģ�� ���Ѽ� �ۼ��Ѵ�.
		 * 
		 * DTO Ŭ���� �ۼ� ��Ģ
		 * 1. ��� �ʵ�� private ���������� ����(�ʼ�)
		 * 2. �⺻������(�ʼ�), ��� �ʵ带 �ʱ�ȭ�ϴ� ������(����)
		 * 3. ��� �ʵ忡 ���� setter/getter �ۼ�(�ʼ�)
		 * 4. toString �޼ҵ� �������̵�(����)
		 * 5. ����ȭ ó��(����)
		 * */
		MemberDTO member = new MemberDTO();
		member.setNumber(1);
		member.setName("ȫ�浿");
		member.setAge(20);
		member.setGender('��');
		member.setHeight(180.5);
		member.setWeight(80.6);
		member.setActivated(true);
		
		System.out.println("ȸ����ȣ : " + member.getNumber());
		System.out.println("ȸ���� : " + member.getName());
		System.out.println("���� : " + member.getAge());
		System.out.println("���� : " + member.getGender());
		System.out.println("Ű : " + member.getHeight());
		System.out.println("������ : " + member.getWeight());
		System.out.println("ȸ��Ȱ��ȭ���� : " + member.isActivated());
	}

}
