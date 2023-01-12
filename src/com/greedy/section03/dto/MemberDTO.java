package com.greedy.section03.dto;

public class MemberDTO {
	
	private int number;					//ȸ����ȣ
	private String name;				//ȸ����
	private int age;					//����
	private char gender;				//����
	private double height;				//Ű
	private double weight;				//������
	private boolean isActivated;		//ȸ��Ż�𿩺�(Ȱ��ȭ����)
	
//	public MemberDTO() {}
	
	/* ������(setter) / ������(getter) */
	
	/* ������(setter) �ۼ� ��Ģ
	 * : �ʵ� ���� ������ ������ �Ű������� �����Ϸ��� �ʵ�� ���� �ڷ������� �����ϰ�
	 *   ȣ�� �� ���޵Ǵ� �Ű������� ���� �̿��Ͽ� �ʵ��� ���� �����Ѵ�.
	 *   
	 * [ǥ����]
	 * public void set�ʵ��(�Ű�����) {
	 *     �ʵ� = �Ű�����;
	 * }
	 * 
	 * [�ۼ�����]
	 * public void setName(String name) {
	 *     this.name = name;
	 * }
	 * 
	 * ������(getter) �ۼ���Ģ
	 * : �ʵ��� ���� ��ȯ���� ������ �޼ҵ� ������ �ǹ��Ѵ�.
	 *   �� �����ڴ� �ϳ��� �ʵ忡�� �����ϵ��� �Ѵ�.
	 *   �ʵ忡 �����ؼ� ��ϵ� ���� return�� �̿��Ͽ� ��ȯ�ϸ�,
	 *   �� �� �޼ҵ��� ��ȯŸ���� ��ȯ�Ϸ��� ���� �ڷ����� ��ġ��Ų��.
	 *   
	 * [ǥ����]
	 * public ��ȯ�� get�ʵ��() {
	 *     return ��ȯ��;
	 * }
	 * 
	 * [�ۼ�����]
	 * public String getName() {
	 *     return this.name;
	 * }
	 * */
	
	/* ������(setter) */
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setHeight(double height) {
//		if(height > 0) {
//			this.height = height;			
//		} else {
//			throw new Exception();
//		}
		this.height = height;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	/* boolean ���� ��� is�� �����ϰ� �ۼ��Ѵ�. */
	public void setActivated(boolean isActivated) {
		this.isActivated = isActivated;
	} 
	
	/* ������(getter) �޼ҵ� */
	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	/* boolean�� �����ڴ� get���� �������� �ʰ� is�� �����ϴ� ���� �Ϲ����� �����̴�. 
	 * is�� �����ϴ� ��� �ʵ��� is�� �����Ѵ�.
	 * ������ has�� ������ ��� has�� ����� �� �ִ�.
	 * */
	public boolean isActivated() {
		return isActivated;
	}
	
}

















