package com.api.diary_api.calendar.vo;

import com.api.diary_api.common.vo.CommonVO;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CalendarVO extends CommonVO {
    private String calendarId;
    private String calendarDtlSrno;
    private String calendarKcd;
    private String rgsrDt;
    private String calendarCnts;

    private String strtTime;
    private String endTime;
}
