package com.greedy.section01.usertype;

public class Application {

	public static void main(String[] args) {
		
		/* ȸ�� ���� ����
		 * ���̵�, ��й�ȣ, �̸�, ����, ����, ���
		 * */
		String id = "user01";
		String pwd = "pass01";
		String name = "ȫ�浿";
		int age = 20;
		char gender = '��';
		String[] hobby = new String[] {"�౸", "����", "�״Ͻ�"};
		
		System.out.println("id : " + id);
		System.out.println("pwd : " + pwd);
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("gender : " + gender);
		System.out.print("hobby : ");
		for(int i = 0; i < hobby.length; i++) {
			System.out.print(hobby[i] + " ");
		}
		System.out.println();
		
		/* ����� ������ �ڷ��� ��� */
		/* 1. ���� ���� �� ��ü ���� */
		/* Ŭ���� ������̸� = new Ŭ����();	<- ��ü(instance) ���� ����
		 * �ڷ��� ������ = new Ŭ������();
		 *  */
		Member member = new Member();
		
		System.out.println("member.id : " + member.id);
		System.out.println("member.pwd : " + member.pwd);
		System.out.println("member.name : " + member.name);
		System.out.println("member.age : " + member.age);
		System.out.println("member.gender : " + member.gender);
		System.out.println("member.hobby : " + member.hobby);
		
		member.id = "user01";
		member.pwd = "pass01";
		member.name = "ȫ�浿";
		member.age = 20;
		member.gender = '��';
		member.hobby = new String[] {"�౸", "����", "�״Ͻ�"};
		
		System.out.println("���� �� member.id : " + member.id);
		System.out.println("���� �� member.pwd : " + member.pwd);
		System.out.println("���� �� member.name : " + member.name);
		System.out.println("���� �� member.age : " + member.age);
		System.out.println("���� �� member.gender : " + member.gender);
		System.out.print("���� �� member.hobby : ");
		for(int i = 0; i < member.hobby.length; i++) {
			System.out.print(member.hobby[i] + " ");
		}
		System.out.println();
	}

}








