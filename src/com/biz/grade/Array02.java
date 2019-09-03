package com.biz.grade;

import java.util.Random;

public class Array02 {

	public static void main(String[] args) {
		Random rnd=new Random();
		int[] intKor=new int[50];
		int[] intEng=new int[50];
		int intSumKor=0, intSumEng=0;
		
		for(int i=0; i<intKor.length;i++) {
			intKor[i]=rnd.nextInt(100)+1;
			intEng[i]=rnd.nextInt(100)+1;
			intSumKor+=intKor[i];
			intSumEng+=intEng[i];
		}
		
		System.out.println("---------------------------------");
		System.out.println("Kor\t\tEng");
		System.out.println("---------------------------------");
		for(int i=0;i<intEng.length;i++) {
			System.out.printf("%3d\t\t",intKor[i]);
			System.out.printf("%3d\n",intEng[i]);
		}
		System.out.println("-----------------------------------");
		System.out.printf("%4d\t\t%4d\n",intSumKor,intSumEng);
	}
}
