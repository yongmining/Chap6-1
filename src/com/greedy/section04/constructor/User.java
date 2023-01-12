package com.greedy.section04.constructor;

public class User {
	
	private String id;
	private String pwd;
	private String name;
	private java.util.Date enrollDate;
	
	/* ������ �ۼ� ��ġ
	 * �ۼ� ��ġ�� ���������δ� Ŭ���� ���ο� �ۼ��ϸ� ������
	 * ��������δ� �ʵ� ����ο� �޼ҵ� ����� ���̿� �ۼ��ϴ� ���� �����̴�.
	 * */
	
	/* ������ �ۼ� ���
	 * [ǥ����]
	 * ���������� Ŭ������([�Ű�����]) {
	 *     �ν��Ͻ� ���� ������ ������ ����� ��� (�ַ� �ʵ带 �ʱ�ȭ)
	 *     this.�ʵ�� = �Ű�����;			//������(setter) ���� ���� ����� �� ���� ȣ��� ������ �� �ִ�.
	 * }
	 * 
	 * ���ǻ���
	 * 1. ������ �޼ҵ�� �ݵ�� Ŭ���� �̸��� �����ϰ� �ۼ��ؾ� �Ѵ�. (��/�ҹ��ڱ��� ���ƾ� ��)
	 * 2. ������ �޼ҵ�� ��ȯ���� �ۼ����� �ʴ´�. (�ۼ��ϰ� �Ǹ� �����ڰ� �ƴ� �޼ҵ�� �ν��Ѵ�.)
	 * 
	 * �������� ��� ����
	 * 1. �ν��Ͻ� ���� ������ ������ ����� �ִ� ��� ���
	 * 2. �Ű����� �ִ� �������� ��� �Ű������� ���޹��� ������ �ʵ尪�� �ʱ�ȭ�ϸ� �ν��Ͻ��� ������ �������� �ַ� ����Ѵ�.
	 * 3. �ν��Ͻ� ���� �� �ʱⰪ ������ ����ȭ �ϱ� ���� ����Ѵ�.
	 *  */
	
	/* �⺻������(default constructor) 
	 * : �����Ϸ��� �ڵ����� �߰����ִ� ����
	 *   �Ű����� �ִ� �����ڰ� �� ���� �����ϴ� ��� �⺻ �����ڴ� �ڵ����� �߰����� �ʴ´�.
	 * */
	public User() {
		System.out.println("User Ŭ������ �⺻������ ȣ����...");
	}
	
//	public User() {}
	
	/* �Ű����� �ִ� ������ */
	public User(String id, String pwd, String name) {
		
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		
		System.out.println("User Ŭ������ id, pwd, name�� �ʱ�ȭ�ϴ� ������ ȣ����...");
	}
	
	public User(String id, String pwd, String name, java.util.Date enrollDate) {
		
//		this.id = id;
//		this.pwd = pwd;
//		this.name = name;
		
		/* this()�� ���� Ŭ���� ���� �ۼ��� �ٸ� ������ �޼ҵ带 ȣ���ϴ� �����̴�.
		 * ��ȣ �ȿ� ���ڷ� ������ ���� �����ڿ� ����� �Ű������� Ÿ��, ����, ������ ��ġ�ϴ� �����ڸ� ȣ���ϰ�
		 * ������ ������ �����ϴ� �ڵ带 �� ���� �� ȣ�� �������� �����Ѵ�.
		 * ���ϵǾ� ���ƿ����� ���ϰ��� �������� �ʴ´�.
		 * this()�� ���� ù �ٿ� �����ؾ� �ϸ� �׷��� ���� ��� ������ ������ �߻��Ѵ�.
		 * */
		this(id, pwd, name);
		this.enrollDate = enrollDate;
		
		System.out.println("User Ŭ������ ��� �ʵ带 �ʱ�ȭ�ϴ� ������ ȣ����...");
	}
	
	/* ���������
	 * �̹� ������� ������ Ÿ���� �ν��Ͻ��� ������ �ʵ尪�� �̿��ؼ� ���ο� �ν��Ͻ��� ���� �� �ʱⰪ���� �̿��� �� �ִ�.
	 * ������ ���� �������� ���Ӱ� �Ҵ�Ǵ� �ν��Ͻ��̱� ������ ���� �ٸ� �ּҰ��� ������ �ȴ�. (��������)
	 * */
	public User(User otherUser) {
		
//		this.id = otherUser.id;
//		this.pwd = otherUser.pwd;
//		this.name = otherUser.name;
//		this.enrollDate = otherUser.enrollDate;
		
		this(otherUser.id, otherUser.pwd, otherUser.name, otherUser.enrollDate);
		
		System.out.println("User Ŭ������ ���� ������ ȣ����...");
		System.out.println(this.hashCode());
		System.out.println(otherUser.hashCode());
	}
	
	public String getInformation() {
		return "User [id=" + this.id + ", pwd=" + this.pwd + ", name=" + this.name + ", enrollDate=" + this.enrollDate;
	}
}
