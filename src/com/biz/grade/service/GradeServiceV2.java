package com.biz.grade.service;

import java.util.Scanner;

public class GradeServiceV2 {
	private int[] intKor;
	private int[] intEng;
	private int[] intMath;
	private int[] intSum;
	private Scanner scan;
	
	public GradeServiceV2(int length) {
		intEng=new int[length];
		intKor=new int[length];
		intMath=new int[length];
		intSum=new int[length];
		scan=new Scanner(System.in);
	}//instructor end
	public void input() {
		for(int i=0;i<intEng.length;i++) {
			inputKor(i);
			inputEng(i);
			inputMath(i);
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
			System.out.println("번 영어점수: "+intEng[i]);
			System.out.println("번 수학점수: "+intMath[i]);
			System.out.println("번 국어점수: "+intKor[i]);
			System.out.println("번 총점: "+intSum[i]);
			System.out.println();
		}
		System.out.println("------------------------------------------\n");
	}//view end
	private void inputEng(int index) {
		System.out.print("영어점수 > ");
		intEng[index]=Integer.valueOf(scan.nextLine());
	}//end
	private void inputMath(int index) {
		System.out.print("수학점수 > ");
		intMath[index]=Integer.valueOf(scan.nextLine());
	}//end
	private void inputKor(int index) {
		System.out.print("국어점수 > ");
		intKor[index]=Integer.valueOf(scan.nextLine());
	}//end
	public void sort() {
		for(int i=0;i<intSum.length;i++) {
			for(int j=i+1; j<intSum.length;j++) {
				if(intSum[i]<intSum[j]) {
					int _temp=intSum[i];
					intSum[i]=intSum[j];
					intSum[j]=_temp;
					
					_temp=intKor[i];
					intKor[i]=intKor[j];
					intKor[j]=_temp;
					
					_temp=intEng[i];
					intEng[i]=intEng[j];
					intEng[j]=_temp;
					
					_temp=intMath[i];
					intMath[i]=intMath[j];
					intMath[j]=_temp;
				}
			}
		}
	}
}
