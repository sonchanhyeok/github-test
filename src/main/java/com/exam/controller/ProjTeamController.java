package com.exam.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.exam.dto.CalendarDTO;
import com.exam.dto.TestDTO;
import com.exam.service.ProjTeamServiceImpl;




@Controller
@RequestMapping("/project")
public class ProjTeamController {

  
      
  @Autowired
  ProjTeamServiceImpl service;
  
  @GetMapping("/testdb")
  public String testdb() {
    System.out.println("testdb test");
    System.out.println(service.testSelect());
    return "main";
  }

  @GetMapping("/index")
  public String index() {
    System.out.println("index test");
    return "index";
  }
  
  @GetMapping("/question")
  public String question() {
    System.out.println("question test");
    return "question";
  }
  
  // schedule
  @GetMapping("/schedule")
  public String test() {
    System.out.println("schedule test");
    return "schedule";
  }
  
  @GetMapping("/meeting")
  public String meeting() {
    System.out.println("meeting test");
    return "meeting";
  }
  
  @GetMapping("/info")
  public String info() {
    System.out.println("info test");
    return "info";
  }
  
  
  // schedule add a new event 
  @PostMapping("/insertSch")
  public String insertSch(@RequestBody CalendarDTO calDTO) {
    System.out.println(calDTO);
    return "schedule";
  }
  
  @GetMapping("/home1")
  public String home1() {
    System.out.println("home1 test");
    return "contents/content";
  }
  
  
  



}
