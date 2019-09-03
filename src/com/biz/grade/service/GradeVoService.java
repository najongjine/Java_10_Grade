package com.biz.grade.service;

import java.util.Random;

import com.biz.grade.model.GradeVO;

public class GradeVoService {
	private int sumOfTotal=0, avgOfTotalAvg=0, intEngTotal=0, intKorTotal=0, intMathTotal=0;
	private GradeVO[] gradeVO;
	Random rnd;
	
	public GradeVoService(int length) {
		gradeVO=new GradeVO[length];
		rnd=new Random();
		for(int i=0; i<gradeVO.length;i++) {
			gradeVO[i]=new GradeVO();
		}
	}//instruc end
	public void input() {
		for(int i=0;i<gradeVO.length;i++) {
			this.gradeVO[i].strNum=String.format("%03d", i+1);
			//gradeVO[i]=i+"";
			this.gradeVO[i].intEng=rnd.nextInt(100)+1;
			this.gradeVO[i].intKor=rnd.nextInt(100)+1;
			this.gradeVO[i].intMath=rnd.nextInt(100)+1;
		}
	}//input end
	public void view() {
		System.out.println("-------------------성적일람표-----------------------");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println("---------------------------------------------------");
		for(int i=0;i<gradeVO.length;i++) {
			System.out.printf("%s\t",gradeVO[i].strNum);
			System.out.printf("%3d\t",gradeVO[i].intKor);
			System.out.printf("%3d\t",gradeVO[i].intEng);
			System.out.printf("%3d\t",gradeVO[i].intMath);
			System.out.printf("%4d\t",gradeVO[i].intSum);
			System.out.printf("%3d\t",gradeVO[i].intAvg);
			System.out.printf("%3d\n",gradeVO[i].intRank);
		}
		System.out.println("-------------------------------------------------");
		sumAllTotal_N_AvgOfAvg();
		System.out.printf("\t");
		System.out.printf("%4d\t",intKorTotal);
		System.out.printf("%4d\t",intEngTotal);
		System.out.printf("%4d\t",intMathTotal);
		System.out.printf("%4d\t",sumOfTotal);
		System.out.printf("%4d\t\n",avgOfTotalAvg);
	}//view end
	public void total_N_avg() {
		for(int i=0;i<gradeVO.length;i++) {
			gradeVO[i].intSum=gradeVO[i].intEng+gradeVO[i].intKor+gradeVO[i].intMath;
			gradeVO[i].intAvg=gradeVO[i].intSum/3;
		}
	}// total n avg end
	public void rank() {
		for (int i=0;i<gradeVO.length;i++) {
			for(int j=i+1;j<gradeVO.length;j++) {
				if(gradeVO[i].intSum<gradeVO[j].intSum) {
					/*
					 * 주소갚을 서로 바꿔주는거임
					 */
					GradeVO _temp=gradeVO[i];
					gradeVO[i]=gradeVO[j];
					gradeVO[j]=_temp;
				}
			}
		}
		for(int i=0;i<gradeVO.length;i++) {
			gradeVO[i].intRank=i+1;
		}
	}//rank end
	public void sortToStrNum() {
		for (int i=0;i<gradeVO.length;i++) {
			for(int j=i+1;j<gradeVO.length;j++) {
				if(Integer.valueOf(gradeVO[i].strNum)>Integer.valueOf(gradeVO[j].strNum)) {
					GradeVO _temp=gradeVO[i];
					gradeVO[i]=gradeVO[j];
					gradeVO[j]=_temp;
				}
			}
		}
	}//sortonum end
	public void sumAllTotal_N_AvgOfAvg() {
		for(int i=0; i<gradeVO.length;i++) {
			sumOfTotal+=gradeVO[i].intSum;
			intEngTotal+=gradeVO[i].intEng;
			intKorTotal+=gradeVO[i].intKor;
			intMathTotal+=gradeVO[i].intMath;
			avgOfTotalAvg+=gradeVO[i].intAvg;
		}
		avgOfTotalAvg=avgOfTotalAvg/gradeVO.length;
	}//sumAllTotal_N_AvgOfAvg end
}
