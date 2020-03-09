package com.xiaoman.keep_system.service;

import com.xiaoman.keep_system.dao.CoachDao;
import com.xiaoman.keep_system.pojo.dto.AttendanceDto;
import com.xiaoman.keep_system.pojo.dto.CoachDto;
import com.xiaoman.keep_system.pojo.po.Coach;
import com.xiaoman.keep_system.pojo.po.CoachLog;
import com.xiaoman.keep_system.pojo.vo.AttendanceVo;
import com.xiaoman.keep_system.pojo.vo.ClockInVo;
import com.xiaoman.keep_system.pojo.vo.CoachVo;
import com.xiaoman.keep_system.pojo.vo.DeleteCusVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class CoachService {
    @Autowired
    private CoachDao coachDao;

    public void updateInfo(int coachId, CoachVo coachVo){
        coachDao.updateInfo(new Coach(coachId,coachVo));
    }

    public CoachDto getCoachDto(int coachId){
        return coachDao.getCoachDto(coachId);
    }

    public void clockIn(ClockInVo clockInVo) throws ParseException {
        //查询数据库，看看今天是否已经打过卡
        Date date = new Date();
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        String dateStr = simpleDateFormat1.format(date);
        Long today = simpleDateFormat1.parse(dateStr).getTime();
        if (coachDao.checkDate(today) == null){
            coachDao.addClockIn(clockInVo.getClockInTime(),today,clockInVo.getCoachId());
        } else {
            coachDao.addEnd(clockInVo.getClockInTime(),today,clockInVo.getCoachId());
        }
    }

    public List<AttendanceDto> listTime(int coachId){
        return coachDao.listTime(coachId);
    }

    public List<AttendanceDto> listDate(AttendanceVo attendanceVo){
        Long start = attendanceVo.getStart();
        Long end = attendanceVo.getEnd();
        return coachDao.listDate(attendanceVo.getId(),start,end);
    }

    public List<CoachDto> listCoach(){
        return coachDao.listCoach();
    }

    public void delCoach(DeleteCusVo deleteCusVo){
        CoachLog coachLog = new CoachLog(null,new Date(),deleteCusVo.getCustomerId(),deleteCusVo.getManagerId());
        coachDao.logDelCoach(coachLog);
        coachDao.delCoach(deleteCusVo.getCustomerId());
    }
}
