package com.greedy.section02.encapsulation.problem1;

public class Monster {
	
	String name;
	int hp;
	
	public void setHp(int hp) {
		
		if(hp > 0) {
			System.out.println("��� ���� �ԷµǾ� ������ ü���� �Է��� ������ �����մϴ�.");
			this.hp = hp;
		} else {
			System.out.println("0���� �۰ų� ���� ���� �Է� �Ǿ� ���� ü���� 0���� �����մϴ�.");
		}
	}
}
