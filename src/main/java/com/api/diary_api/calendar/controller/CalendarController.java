package com.api.diary_api.calendar.controller;

import com.api.diary_api.calendar.service.CalendarService;
import com.api.diary_api.calendar.vo.CalendarVO;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CalendarController {

    @Autowired
    CalendarService calendarService;

    @GetMapping("/api/calendar/selectScheduleList")
    public List<CalendarVO> selectScheduleList(@RequestParam String chooseDate){
        System.out.println(chooseDate);
        List<CalendarVO> list = calendarService.selectScheduleList(chooseDate);

        return list;
    }

}
