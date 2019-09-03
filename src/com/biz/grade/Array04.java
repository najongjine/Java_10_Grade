package com.biz.grade;

import java.util.Random;

public class Array04 {

	public static void main(String[] args) {
		int[] intNum=new int[50];
		Random rnd=new Random();
		int index1=0, index2=2;
		boolean bVar=false;
		
		for(int i=0;i<intNum.length;i++) {
			intNum[i]=rnd.nextInt(100)+1;
		}//초기화
		for(int i=0;i<intNum.length;i++) {
			for(index1=2, index2=2; index1<intNum[i];index1++) {
				if(intNum[i]%index1!=0) {
					index2++;
				
				}
				if(intNum[i]<=index2) {
					System.out.printf("[%d] 번째는 소수입니다 : %d\n",i, intNum[i]);
					bVar=true;
				}
			}
		}
		if(bVar==false) {
			System.out.println("50개의 배열중 소수는 단 한개도 생성이 안됬습니다");
		}

	}

}
