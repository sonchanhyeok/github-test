package com.exam.dto;

import org.apache.ibatis.type.Alias;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
@ToString
@NoArgsConstructor
@Alias("calendarDTO")
public class CalendarDTO {
	private int calendarId;
	private String title;
	private String startDate;
	private String endDate;
	private String color;
	

  public CalendarDTO(int calendarId, String title, String startDate, String endDate, String color) {
    this.calendarId = calendarId;
    this.title = title;
    this.startDate = startDate;
    this.endDate = endDate;
    this.color = color;
  }
  
	
	
	
}
