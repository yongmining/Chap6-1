package com.greedy.section02.encapsulation.problem4;

public class Monster {
	
	/* �ʵ�(== �������� == ������� == �ν��Ͻ�����) */
	
	/* ���� ������
	 * Ŭ���� Ȥ�� Ŭ������ ����� ���������ڷ� ������ �� �ִ� ������ �����ϱ� ���� Ű�����̴�.
	 * 1. public : ��� ��Ű������ ������ ����
	 * 2. protected : ���� ��Ű�������� ������ ����. ��, ��Ӱ��迡 �ִ� ��� �ٸ� ��Ű������ ���� ����
	 * 3. default : ���� ��Ű�������� ������ ����
	 * 4. private : Ŭ���� �������� ���� ����
	 * */
	private String kinds;
	private int hp;
	
	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
	
	public void setHp(int hp) {
		if(hp > 0) {
			this.hp = hp;
		}
	}
	
	public String getInfo() {
		
		return "������ ������ " + this.kinds + "�̰�, ü���� " + this.hp + "�Դϴ�.";
	}
}
