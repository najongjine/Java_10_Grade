package com.biz.grade;

import java.util.Scanner;

public class Grade01Exec {
	/*
	 * static main 함수에서 멤버변수|멤버메서드에 접근하려면 맴버 변수도 static 이어야함
	 * 다른 메서드도 static을 붙여야 한다
	 */
	private static int [] intKor;
	private static Scanner scanner;
	//private static int index=0;
	public static void main(String[] args) {
		intKor=new int[5];
		scanner=new Scanner(System.in);
		
		for(int i=0;i<intKor.length; i++) {
			input(i);
		}
		for(int i=0;i<intKor.length;i++) {
			view(i);
		}
		view(intKor);
	}
	public static void input(int index) {
		System.out.printf("[%d]번 배열에 입력할 값을 입력하세요 > ",index);
		String strNum=scanner.nextLine();
		intKor[index]=Integer.valueOf(strNum);
	}
	public static void view(int index) {
		System.out.printf("[%d]번 배열의 값: %d\n",index,intKor[index]);
	}
	public static void view(int[] intKor) {
		for(int i=0; i<intKor.length;i++) {
			System.out.printf("[%d]번 배열의 값: %d\n",i,intKor[i]);
		}
	}
}
