package com.xiaoman.keep_system.controller;

import com.xiaoman.keep_system.pojo.dto.CustomerDto;
import com.xiaoman.keep_system.pojo.po.Comment;
import com.xiaoman.keep_system.pojo.po.Customer;
import com.xiaoman.keep_system.pojo.po.Share;
import com.xiaoman.keep_system.pojo.vo.ChCoachVo;
import com.xiaoman.keep_system.pojo.vo.CustomerVo;
import com.xiaoman.keep_system.pojo.vo.PraiseVo;
import com.xiaoman.keep_system.result.Result;
import com.xiaoman.keep_system.service.CustomerService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    /**
     * @param chCoachVo
     * @return com.xiaoman.keep_system.result.Result<java.lang.Object>
     * @desc 选择教练
     * @author Joe
     * @date 2020/1/25 21:37
     */
    @PutMapping("/choose")
    public Result<Object> chCoach(@RequestBody ChCoachVo chCoachVo){
        customerService.chCoach(chCoachVo);
        return Result.success(null);
    }

    /**
     * @param customerId
	 * @param customerVo
     * @return com.xiaoman.keep_system.result.Result<java.lang.Object>
     * @desc 更改个人信息
     * @author Joe
     * @date 2020/1/25 22:02
     */
    @PutMapping("/info/{customerId}")
    public Result<Object> updateCustomer(@PathVariable int customerId, @RequestBody CustomerVo customerVo){
        customerService.updateCustomer(customerId,customerVo);
        return Result.success(null);
    }

    /**
     * @param customerId
     * @return com.xiaoman.keep_system.result.Result<com.xiaoman.keep_system.pojo.po.Customer>
     * @desc 查询客户信息
     * @author Joe
     * @date 2020/1/25 21:44
     */
    @GetMapping("/info/{customerId}")
    public Result<CustomerDto> getCustomer(@PathVariable int customerId){
        return Result.success(customerService.getCustomer(customerId));
    }

    @GetMapping("/listShare")
    public Result<List<Share>> listShare(){
        return Result.success(customerService.listShare());
    }

    /**
     * @param share
     * @return com.xiaoman.keep_system.result.Result<java.lang.Object>
     * @desc 分享
     * @author Joe
     * @date 2020/1/26 0:05
     */
    @PostMapping("/share")
    public Result<Object> share(@RequestBody Share share){
        customerService.share(share);
        return Result.success(null);
    }

    /**
     * @param shareId
     * @return com.xiaoman.keep_system.result.Result<java.lang.Object>
     * @desc 删除分享
     * @author Joe
     * @date 2020/1/28 18:39
     */
    @Delete("/share/{shareId}")
    public Result<Object> delShare(@PathVariable int shareId){
        customerService.delShare(shareId);
        return Result.success(null);
    }

    /**
     * @param praiseVo
     * @return com.xiaoman.keep_system.result.Result<java.lang.Object>
     * @desc 点赞
     * @author Joe
     * @date 2020/1/28 20:42
     */
    @PutMapping("/praise")
    public Result<Object> praise(@RequestBody PraiseVo praiseVo){
        customerService.praise(praiseVo);
        return Result.success(null);
    }

    /**
     * @param comment
     * @return com.xiaoman.keep_system.result.Result<java.lang.Object>
     * @desc 评论
     * @author Joe
     * @date 2020/1/28 20:42
     */
    @PostMapping("/comment")
    public Result<Object> comment(@RequestBody Comment comment){
        customerService.comment(comment);
        return Result.success(null);
    }

    /**
     * @param commentId
     * @return com.xiaoman.keep_system.result.Result<java.lang.Object>
     * @desc 删除评论
     * @author Joe
     * @date 2020/1/28 20:44
     */
    @DeleteMapping("/comment/{commentId}")
    public Result<Object> delComment(@PathVariable int commentId){
        customerService.delComment(commentId);
        return Result.success(null);
    }

    @GetMapping("/comment/{shareId}")
    public Result<List<Comment>> listComment(@PathVariable int shareId){
        return Result.success(customerService.listComment(shareId));
    }
}
