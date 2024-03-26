package com.api.diary_api.diary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(origins = "http://localhost:3000")
public class DiaryController {

    @GetMapping("/api/test")
    public void test(){
        System.out.println("테스트 찍히는지 확인");


    }



}
