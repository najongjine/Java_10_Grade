package com.biz.grade;

import com.biz.grade.service.GradeVoService;

public class GradeVOEx01 {

	public static void main(String[] args) {
		GradeVoService gs=new GradeVoService(100);
		
		gs.input();
		gs.total_N_avg();
		gs.rank();
		
		//gs.sortToStrNum();
		gs.view();

	}

}
