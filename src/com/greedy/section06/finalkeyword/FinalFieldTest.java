package com.greedy.section06.finalkeyword;

public class FinalFieldTest {
	
//	private final int nonStaticNum;		//0���� �ʱ�ȭ �Ǿ� ���� ���� �Ұ���
	
	/* 1. ����� ���ÿ� �ʱ�ȭ */
	private final int NON_STATIC_NUM = 1;
	
	/* 2. �����ڸ� �̿��ؼ� �ʱ�ȭ */
	private final String NON_STATIC_NAME;
	
	public FinalFieldTest(String name) {
		this.NON_STATIC_NAME = name;
	}
	
	/* final�� static�� �����ؼ� ����� �� �ִ�. */
	/* static�� jvm�� ���� �ʱⰪ���� �ʱ�ȭ �Ǳ� ������ final Ű���� ��� �� ����� �ʱⰪ�� �ۼ��ؾ� �Ѵ�. */
	private static final int STATIC_NUM = 1;
	
	/* �����ڷ� �ʱ�ȭ �Ұ� */
	private static final double STATIC_DOUBLE;
//	
//	public FinalFieldTest(double staticDouble) {
//		FinalFieldTest.STATIC_DOUBLE = staticDouble;
//	}
	
	/* ���� �ʱ�ȭ ���� �̿��ϴ� ���� ���� */
	static {
		STATIC_DOUBLE = 5.0;
	}
	
}
