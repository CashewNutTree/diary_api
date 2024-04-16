package com.api.diary_api.calendar.mapper;

import com.api.diary_api.calendar.vo.CalendarVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CalendarMapper {
    List<CalendarVO> selectScheduleList(String date);
}
