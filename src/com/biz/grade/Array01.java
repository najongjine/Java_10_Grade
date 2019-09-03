package com.biz.grade;

import java.util.Random;

public class Array01 {

	public static void main(String[] args) {
		int[] intNum=new int[50];
		int intSum=0;
		double dAvg=0.0;
		Random rnd=new Random();
		
		for(int i=0; i<intNum.length;i++) {
			intNum[i]=rnd.nextInt(100)+1;
			intSum+=intNum[i];
		}
		dAvg=(double)intSum/intNum.length;
		System.out.println("숫자들의 총 합: "+intSum);
		System.out.println("숫자들의 평균: "+dAvg);
		
		
	}
}
