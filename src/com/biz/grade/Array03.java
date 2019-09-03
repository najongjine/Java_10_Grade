package com.biz.grade;

import java.util.Random;

public class Array03 {
	public static void main(String[] args) {
		int[] intNum=new int[50];
		int intSumOfEvens=0;
		Random rnd=new Random();
		
		for(int i=0; i<intNum.length;i++) {
			intNum[i]=rnd.nextInt(100)+1;
			if(intNum[i]%2==0) {
				intSumOfEvens+=intNum[i];
				System.out.printf("%d 번째 값: %d\n",i,intNum[i]);
			}
		}
	}
}
