package com.greedy.section03.abstraction;

public class Car {
	
	private boolean isOn;
	private int speed;
	
	public void startUp() {
		
		if(isOn) {
			System.out.println("�̹� �õ��� �ɷ��ֽ��ϴ�.");
		} else {
			this.isOn = true;
			System.out.println("�õ��� �ɾ����ϴ�. ���� ����� �غ� �Ϸ�Ǿ����ϴ�.");
		}
	}
	
	public void go() {
		
		if(isOn) {
			System.out.println("���� ������ �����Դϴ�.");
			speed += 10;
			System.out.println("���� ���� �ü��� " + this.speed + "km/h �Դϴ�.");
		} else {
			System.out.println("���� �õ��� �ɷ����� �ʽ��ϴ�. �õ��� ���� �ɾ��ּ���.");
		}
	}
	
	public void stop() {
		
		if(isOn) {
			
			if(speed > 0) {
				speed = 0;
				System.out.println("�극��ũ�� ��ҽ��ϴ�. ���� ����ϴ�.");
			} else {
				System.out.println("���� �̹� �����ִ� �����Դϴ�.");
			}
		} else {
			System.out.println("���� �õ��� �ɷ����� �ʽ��ϴ�. �õ��� ���� �ɾ��ּ���.");
		}
	}
	
	public void turnOff() {
		
		if(isOn) {
			if(speed > 0) {
				System.out.println("�޸��� ���¿��� �õ��� �� �� �����ϴ�. ���� �켱 �����ּ���.");
			} else {
				isOn = false;
				System.out.println("�õ��� ���ϴ�. �ٽ� �����Ϸ��� �õ��� ���ּ���.");
			}
		} else {
			System.out.println("�̹� �õ��� �����ִ� �����Դϴ�. �õ����¸� Ȯ�����ּ���");
		}
	}
}
