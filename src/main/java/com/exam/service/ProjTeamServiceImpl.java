package com.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dao.ProjTeamDAO;
import com.exam.dto.CalendarDTO;
import com.exam.dto.TestDTO;

@Service
public class ProjTeamServiceImpl implements ProjTeamService {
	
	@Autowired
	ProjTeamDAO dao;

	@Override
	public List<CalendarDTO> insertSch() {
		return dao.insertSch();
	}
	
	@Override
    public List<TestDTO> testSelect() {
        return dao.testSelect();
    }

}
