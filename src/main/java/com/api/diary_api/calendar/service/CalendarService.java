package com.api.diary_api.calendar.service;

import com.api.diary_api.calendar.mapper.CalendarMapper;
import com.api.diary_api.calendar.vo.CalendarVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalendarService {

    @Autowired
    CalendarMapper calendarMapper;

    public List<CalendarVO> selectScheduleList(String date){
        List<CalendarVO> list = calendarMapper.selectScheduleList(date);
        return list;
    }
}
