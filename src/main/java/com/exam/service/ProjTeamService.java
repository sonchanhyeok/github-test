package com.exam.service;

import java.util.List;
import com.exam.dto.CalendarDTO;
import com.exam.dto.TestDTO;


public interface ProjTeamService {
	public List<CalendarDTO> insertSch();
	public List<TestDTO> testSelect();
}
