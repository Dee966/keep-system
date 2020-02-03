package com.xiaoman.keep_system.controller;

import com.xiaoman.keep_system.pojo.dto.CoachDto;
import com.xiaoman.keep_system.pojo.po.Attendance;
import com.xiaoman.keep_system.pojo.vo.AttendanceVo;
import com.xiaoman.keep_system.pojo.vo.ClockInVo;
import com.xiaoman.keep_system.pojo.vo.CoachVo;
import com.xiaoman.keep_system.result.Result;
import com.xiaoman.keep_system.service.CoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/coach")
public class CoachController {
    @Autowired
    private CoachService coachService;

    /**
     * @param coachId
	 * @param coachVo
     * @return com.xiaoman.keep_system.result.Result<java.lang.Object>
     * @desc 修改教练信息
     * @author Joe
     * @date 2020/1/25 22:09
     */
    @PutMapping("/info/{coachId}")
    public Result<Object> updateInfo(@PathVariable int coachId, @RequestBody CoachVo coachVo){
        coachService.updateInfo(coachId,coachVo);
        return Result.success(null);
    }

    /**
     * @param coachId
     * @return com.xiaoman.keep_system.result.Result<com.xiaoman.keep_system.pojo.dto.CoachDto>
     * @desc 获取教练信息
     * @author Joe
     * @date 2020/1/25 22:19
     */
    @GetMapping("/info/{coachId}")
    public Result<CoachDto> getCoachDto(@PathVariable int coachId){
        return Result.success(coachService.getCoachDto(coachId));
    }

    /**
     * @param coachId
     * @return com.xiaoman.keep_system.result.Result<com.xiaoman.keep_system.pojo.po.Attendance>
     * @desc 查询打卡信息
     * @author Joe
     * @date 2020/1/25 22:28
     */
    @GetMapping("/attendance/{coachId}")
    public Result<Attendance> getAttendance(@PathVariable int coachId){
        return Result.success(null);
    }

    /**
     * @param clockInVo
     * @return com.xiaoman.keep_system.result.Result<java.lang.Object>
     * @desc 打卡
     * @author Joe
     * @date 2020/1/25 23:50
     */
    @PostMapping("/clock_in")
    public Result<Object> clockIn(@RequestBody ClockInVo clockInVo) throws ParseException {
        coachService.clockIn(clockInVo);
        return Result.success(null);
    }

    /**
     * @param coachId
     * @return com.xiaoman.keep_system.result.Result<java.util.List<com.xiaoman.keep_system.pojo.po.Attendance>>
     * @desc 查询教练所有打卡时间
     * @author Joe
     * @date 2020/1/25 23:58
     */
    @GetMapping("/list_time/{coachId}")
    public Result<List<Attendance>> listTime(@PathVariable int coachId){
        return Result.success(coachService.listTime(coachId));
    }

    /**
     * @param coachId
	 * @param attendanceVo
     * @return com.xiaoman.keep_system.result.Result<java.util.List<com.xiaoman.keep_system.pojo.po.Attendance>>
     * @desc 按时间段查询打卡记录
     * @author Joe
     * @date 2020/1/26 0:02
     */
    @GetMapping("/list_date/{coachId}")
    public Result<List<Attendance>> listDate(@PathVariable int coachId,@RequestBody AttendanceVo attendanceVo){
        return Result.success(coachService.listDate(coachId,attendanceVo));
    }

    /**
     * @param
     * @return com.xiaoman.keep_system.result.Result<java.util.List<com.xiaoman.keep_system.pojo.dto.CoachDto>>
     * @desc 过去所有教练
     * @author Joe
     * @date 2020/2/2 23:10
     */
    @GetMapping("/list_coach")
    public Result<List<CoachDto>> listCoach(){
        return Result.success(coachService.listCoach());
    }
}
