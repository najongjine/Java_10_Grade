package com.biz.grade;

import com.biz.grade.service.GradeServiceV2;

public class Grade03 {

	public static void main(String[] args) {
		GradeServiceV2 gs=new GradeServiceV2(5);
		
		gs.input();
		gs.total();
		gs.sort();
		gs.vew();
	}//main end
}
