package com.biz.grade.service;

import java.util.Scanner;

public class GradeService {
	private int[] intKor;
	private int[] intEng;
	private int[] intMath;
	private int[] intSum;
	private Scanner scan;
	
	public GradeService(int length) {
		intEng=new int[length];
		intKor=new int[length];
		intMath=new int[length];
		intSum=new int[length];
		scan=new Scanner(System.in);
	}//instructor end
	public void input() {
		for(int i=0;i<intEng.length;i++) {
			System.out.print((i+1)+"번 영어점수 > ");
			intEng[i]=Integer.valueOf(scan.nextLine());
			System.out.print((i+1)+"번 국어점수 > ");
			intKor[i]=Integer.valueOf(scan.nextLine());
			System.out.print((i+1)+"번 수학점수 > ");
			intMath[i]=Integer.valueOf(scan.nextLine());
		}
	}//input end
	public int[] total() {
		for(int i=0;i<intSum.length;i++) {
			intSum[i]=intEng[i]+intKor[i]+intMath[i];
		}
		return intSum;
	}//total end
	public void vew() {
		System.out.println("-------------성적일람표-----------------");
		for(int i=0;i<intKor.length;i++){
			System.out.println((i+1)+"번 영어점수: "+intEng[i]);
			System.out.println((i+1)+"번 수학점수: "+intMath[i]);
			System.out.println((i+1)+"번 국어점수: "+intKor[i]);
			System.out.println((i+1)+"번 총점: "+intSum[i]);
			System.out.println();
		}
		System.out.println("------------------------------------------\n");
	}
}
