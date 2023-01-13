package com.greedy.section05.parameter;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ParameterTest {
	
	public void primitiveTypeParameter(int num) {
		
		System.out.println("�Ű������� ���޹��� �� : " + num);
	}
	
	public void primitiveTypeArrayParameter(int[] iarr) {
		
		System.out.println("�Ű������� ���޹��� �� : " + iarr);
		
		for(int i = 0; i < iarr.length; i++) {
			System.out.print(iarr[i] + " ");
		}
		System.out.println();
		
		iarr[0] = 99;
		
		for(int i = 0; i < iarr.length; i++) {
			System.out.print(iarr[i] + " ");
		}
		System.out.println();
	}
	
	public void classTypeParameter(RectAngle rectAngle) {
		
		System.out.println("�Ű������� ���޹��� �� : " + rectAngle);
		
		System.out.println("�簢���� ���̿� �ѷ� ==============");
		rectAngle.calcArea();
		rectAngle.calcRound();
		
		rectAngle.setWidth(100);
		rectAngle.setHeight(100);
		
		System.out.println("���� �� �簢���� ���̿� �ѷ� ==========");
		rectAngle.calcArea();
		rectAngle.calcRound();
	}
	
	public void variableLengthArrayParameter(String name, String...hobby) {
		
		System.out.println("�̸� : " + name);
		System.out.println("��� : " + hobby);
		System.out.println("����� ���� : " + hobby.length);
		
		for(int i = 0; i < hobby.length; i++) {
			System.out.print(hobby[i] + " ");
		}
		System.out.println();
	}
	
//	public void variableLengthArrayParameter(String...hobby) {}
}
