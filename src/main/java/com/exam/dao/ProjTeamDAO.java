package com.exam.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.exam.dto.CalendarDTO;
import com.exam.dto.TestDTO;



@Repository
public class ProjTeamDAO {
	
	@Autowired
	SqlSessionTemplate session;
	
	public List<CalendarDTO> insertSch(){
		return session.selectList("ProjectTeamMapper.insertSch");
	}
	
	public List<TestDTO> testSelect() {
	  return session.selectList("TestMapper.testSelect");
	}
}
