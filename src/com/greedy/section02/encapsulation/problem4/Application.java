package com.greedy.section02.encapsulation.problem4;

public class Application {

	public static void main(String[] args) {
		
		Monster monster1 = new Monster();
//		monster1.kinds = "�����˽�Ÿ��";
//		monster1.hp = 200;
		
		monster1.setKinds("�����˽�Ÿ��");
		monster1.setHp(200);
		
		System.out.println(monster1.getInfo());

	}

}
