package com.xiaoman.keep_system.controller;

import com.xiaoman.keep_system.pojo.dto.CoachDto;
import com.xiaoman.keep_system.pojo.dto.CusDto;
import com.xiaoman.keep_system.pojo.po.Manager;
import com.xiaoman.keep_system.pojo.po.Share;
import com.xiaoman.keep_system.pojo.vo.DateVo;
import com.xiaoman.keep_system.pojo.vo.ManagerVo;
import com.xiaoman.keep_system.result.Result;
import com.xiaoman.keep_system.service.ManagerService;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/manager")
public class ManagerController {
    @Autowired
    private ManagerService managerService;

    /**
     * @param customerId
     * @return com.xiaoman.keep_system.result.Result<java.lang.Object>
     * @desc 更新用户健身时长
     * @author Joe
     * @date 2020/1/26 0:19
     */
    @PutMapping("/update/{customerId}")
    public Result<Object> updateCusTime(@PathVariable int customerId){
        managerService.updateCusTime(customerId);
        return Result.success(null);
    }

    /**
     * @param customerId
     * @return com.xiaoman.keep_system.result.Result<java.lang.Object>
     * @desc 删除用户
     * @author Joe
     * @date 2020/1/26 0:20
     */
    @Delete("/delete_cus/{customerId}")
    public Result<Object> deleteCus(@PathVariable int customerId){
        managerService.deleteCus(customerId);
        return Result.success(null);
    }

    /**
     * @param coachId
     * @return com.xiaoman.keep_system.result.Result<java.lang.Object>
     * @desc 删除教练
     * @author Joe
     * @date 2020/1/26 0:20
     */
    @Delete("/delete_coa/{coachId}")
    public Result<Object> deleteCoach(@PathVariable int coachId){
        managerService.deleteCoach(coachId);
        return Result.success(null);
    }

    /**
     * @param pictures
     * @return
     * @desc 上传图片 图片写入磁盘
     * @author Joe
     * @date 2020/1/26 0:21
     */
    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public Result<List<String>> uploadImg(
            @Param("content") String content,
            @Param("name") String name,
            @Param("praise") int praise,
            @Param("shareTime") Date shareTime,
            @RequestParam("picture") MultipartFile[] pictures
    ) throws IOException {
        List<String> list = managerService.uploadImg(pictures);
        managerService.share(list,content,name,praise,shareTime);
//        return Result.success(managerService.uploadImg(pictures));
        return Result.success(null);
    }

    /**
     * @param share
     * @return
     * @desc 上传图片，信息写入数据库
     * @author Joe
     * @date 2020/1/26 0:21
     */
    @PostMapping("/share")
    public Result<Object> share(@RequestBody Share share){
        managerService.share(share);
        return Result.success(null);
    }

    /**
     * @param managerId
	 * @param managerVo
     * @return com.xiaoman.keep_system.result.Result<java.lang.Object>
     * @desc 修改管理员信息
     * @author Joe
     * @date 2020/1/28 21:43
     */
    @PutMapping("/{managerId}")
    public Result<Object> updateManager(@PathVariable int managerId, @RequestBody ManagerVo managerVo){
        managerService.updateManager(managerId,managerVo);
        return Result.success(null);
    }

    /**
     * @param shareId
     * @return com.xiaoman.keep_system.result.Result<java.lang.Object>
     * @desc 删除分享
     * @author Joe
     * @date 2020/1/28 21:47
     */
    @DeleteMapping("/share/{shareId}")
    public Result<Object> delShare(@PathVariable int shareId){
        managerService.delShare(shareId);
        return Result.success(null);
    }

    /**
     * @param telephone
     * @return com.xiaoman.keep_system.result.Result<com.xiaoman.keep_system.pojo.dto.CusDto>
     * @desc 用电话号码获取会员
     * @author Joe
     * @date 2020/2/4 21:55
     */
    @GetMapping("/{telephone}")
    public Result<CusDto> getCusByPhone(@PathVariable String telephone){
        return Result.success(managerService.getCusByPhone(telephone));
    }

    @PostMapping("/coach_img")
    public Result<String> uploadCoachImg(@RequestParam("img") MultipartFile picture) throws IOException {
        return Result.success(managerService.uploadCoachImg(picture));
    }

    /**
     * @param
     * @return com.xiaoman.keep_system.result.Result<com.xiaoman.keep_system.pojo.dto.CusDto>
     * @desc 获取所有用户
     * @author Joe
     * @date 2020/2/5 21:11
     */
    @GetMapping("/list_customer")
    public Result<List<CusDto>> listCustomer(){
        return Result.success(managerService.listCustomer());
    }

    /**
     * @param
     * @return com.xiaoman.keep_system.result.Result<java.util.List<com.xiaoman.keep_system.pojo.dto.CoachDto>>
     * @desc 获取所有教练
     * @author Joe
     * @date 2020/2/5 21:56
     */
    @GetMapping("/list_coach")
    public Result<List<CoachDto>> listCoach(){
        return Result.success(managerService.listCoach());
    }
}
