/* ��Ű�� ����� */
package com.greedy.section07.kindsofvariable;

/* import */

/* Ŭ���� ����� */
public class KindsOfVariable {  //Ŭ���� ���� ����

	/* �ʵ� <- �ۼ� ��ġ�� ���� �̸� 
	 * �ʵ� == �������(Ŭ������ ������ ������ �ǹ�) == ��������(Ŭ���� �������� ����� �� �ִ� ������� �ǹ�)
	 * */
	
	/* non static field�� �ν��Ͻ� ������� �Ѵ�. (�ν��Ͻ� ���� ������ ��� ������ ������� �ǹ� )*/
	private int globalNum;
	
	/* static field�� ���� �ʵ�(Ŭ���� ����)��� �Ѵ�. (����(Ŭ����) ������ �����Ǵ� ������� �ǹ��̴�.) */
	private static int staticNum;
	
	
	/* ������ */
	/* �޼ҵ� 
	 * public void testMethod() <- �޼ҵ� ���
	 * {} <-�޼ҵ� �ٵ�(��)
	 * testMethod() <- �޼ҵ� �ñ״�ó
	 * */
	
	public void testMethod(/* �Ű����� ����� */ int num) { //�޼ҵ� ������ ����
		/* �Ű������� �����Ͽ� �޼ҵ� ���� ���� �ۼ��ϴ� ������ ����������� �Ѵ�.
		 * ���������� stack�� �̿��Ѵ�.*/
		int localNum;
		
		System.out.println(num);
		/* ���� ������ �ݵ�� �ʱ�ȭ �ؾ� �Ѵ�. */
//		System.out.println(localNum);
		
		System.out.println(globalNum);
		System.out.println(staticNum);
	}// �޼ҵ� ������ ��
	
	public void testMethod2() {
//		localNum = 0;
		
		System.out.println(globalNum);
		System.out.println(staticNum);
	}
	
	
}	//Ŭ���� ���� ��

