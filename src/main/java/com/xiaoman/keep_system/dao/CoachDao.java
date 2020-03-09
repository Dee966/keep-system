package com.xiaoman.keep_system.dao;

import com.xiaoman.keep_system.pojo.dto.AttendanceDto;
import com.xiaoman.keep_system.pojo.dto.CoachDto;
import com.xiaoman.keep_system.pojo.po.Attendance;
import com.xiaoman.keep_system.pojo.po.Coach;
import com.xiaoman.keep_system.pojo.po.CoachLog;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Mapper
@Repository
public interface CoachDao {

    @Update("update coach set " +
            "telephone=#{telephone},name=#{name},age=#{age},tall=#{tall},weight=#{weight} " +
            "where coach_id=#{coachId}")
    void updateInfo(Coach coach);

    @Select("select " +
            "email,telephone,name,img,sex,age,tall,weight,work_time,work_experience,title from coach " +
            "where coach_id = #{coachId}")
    CoachDto getCoachDto(int coachId);

    @Select("select * from attendance where coach_id = #{coachId}")
    List<AttendanceDto> listTime(int coachId);

    @Select("select * from attendance where coach_id = #{coachId} and attendant between #{start} and #{end} ")
    List<AttendanceDto> listDate(@Param("coachId") int coachId,@Param("start") Long start,@Param("end") Long end);

    @Select("select * from attendance where attendant = #{today}")
    Attendance checkDate(Long today);

    @Select("insert into attendance values(null,#{clockIn},null,#{today},#{coachId})")
    void addClockIn(Date clockIn,Long today,int coachId);

    @Update("update attendance set end = #{end} where coach_id = #{coachId} and attendant = #{today}")
    void addEnd(Date end,Long today,int coachId);

    @Select("select * from coach")
    List<CoachDto> listCoach();

    @Insert("insert into coach_log values(null,#{coachLeave},#{coachId},#{managerId})")
    void logDelCoach(CoachLog coachLog);

    @Delete("delete coach from coach where coach_id = #{coachId}")
    void delCoach(int coachId);


}
