package com.greedy.section05.parameter;

public class Application {

	public static void main(String[] args) {
		
		ParameterTest pt = new ParameterTest();
		pt.primitiveTypeParameter(20);
		
		int[] iarr = new int[] {1, 2, 3, 4, 5};
		System.out.println("���ڷ� �����ϴ� �� : " + iarr);
		pt.primitiveTypeArrayParameter(iarr);
		
		for(int i = 0; i < iarr.length; i++) {
			System.out.print(iarr[i] + " ");
		}
		System.out.println();
		
		RectAngle r1 = new RectAngle(12.5, 22.5);
		System.out.println("���ڷ� �����ϴ� �� : " + r1);
		pt.classTypeParameter(r1);
		
		System.out.println("���� �� Application���� �簢���� ���̿� �ѷ� ==========");
		r1.calcArea();
		r1.calcRound();
		
		pt.variableLengthArrayParameter("ȫ�浿");
		pt.variableLengthArrayParameter("������", "����");
		pt.variableLengthArrayParameter("�̼���", "����", "�౸", "�籸");
		pt.variableLengthArrayParameter("�Ż��Ӵ�", new String[] {"�״Ͻ�", "����", "�����"});
		
	}

}
