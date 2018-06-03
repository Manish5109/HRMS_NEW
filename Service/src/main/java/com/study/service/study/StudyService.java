package com.study.service.study;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.common.DateAndTime;
import com.study.doa.study.Study;
import com.study.study.StudyModel;

@Service
public class StudyService {
	
	@Autowired
	private Study study;

	public void studySave(StudyModel stm) {
		StudyModel sm = new StudyModel();

		DateAndTime dt = new DateAndTime();
		// dt.setDateFormate("yyyy-MM-dd", "yyyy-MM-dd", sm.getDate());
		dt.setDateTimeFormate("yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss", sm.getTimestamp());
		sm.setDate(new java.sql.Date(new Date().getTime()));
		sm.setTimestamp(dt.getDateTimeFormate());

		Study st = new Study();
		st.studySave(stm);
	}
	
	public void delete(String id) {
		study.delete(id);
	}
}
