package com.xiaoman.keep_system.service;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import com.xiaoman.keep_system.dao.CoachDao;
import com.xiaoman.keep_system.dao.CustomerDao;
import com.xiaoman.keep_system.exception.GlobleException;
import com.xiaoman.keep_system.pojo.dto.CustomerDto;
import com.xiaoman.keep_system.pojo.po.Comment;
import com.xiaoman.keep_system.pojo.po.Customer;
import com.xiaoman.keep_system.pojo.po.CustomerLog;
import com.xiaoman.keep_system.pojo.po.Share;
import com.xiaoman.keep_system.pojo.vo.ChCoachVo;
import com.xiaoman.keep_system.pojo.vo.CustomerVo;
import com.xiaoman.keep_system.pojo.vo.DeleteCusVo;
import com.xiaoman.keep_system.pojo.vo.PraiseVo;
import com.xiaoman.keep_system.result.CodeMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerDao customerDao;

    public void chCoach(ChCoachVo chCoachVo){
        Customer customer = customerDao.getCustomerById(chCoachVo.getCustomerId());
        if (customer.getCoachId() != null){
            throw new GlobleException(CodeMsg.COACH_EXIST);
        }
        customerDao.chCoach(new Customer(chCoachVo));
    }

    public void updateCustomer(int customerId, CustomerVo customerVo){
        customerDao.updateCustomer(new Customer(customerId,customerVo));
    }

    public CustomerDto getCustomer(int customerId){
        CustomerDto customerDto = customerDao.getCustomer(customerId);
        if (customerDto == null){
            throw new GlobleException(CodeMsg.INFO_NULL);
        }
        return customerDto;
    }

    public void share(Share share){
        share.setShareTime(new Date());
        customerDao.share(share);
    }

    public void delShare(int customerId){
        customerDao.delShare(customerId);
    }

    public void praise(PraiseVo praiseVo){
        if (praiseVo.getJudge() == 0){
            customerDao.confirm(praiseVo.getShareId());
        }else {
            customerDao.cancel(praiseVo.getShareId());
        }
    }

    public void comment(Comment comment){
        customerDao.comment(comment);
    }

    public void delComment(int customerId){
        customerDao.delComment(customerId);
    }

    public List<Comment> listComment(int shareId){
        List<Comment> comments = customerDao.listComment(shareId);
        if (comments == null){
            throw new GlobleException(CodeMsg.NO_COMMENT);
        }
        return comments;
    }

    public List<Share> listShare(){
        return customerDao.listShare();
    }

    public void delCus(DeleteCusVo deleteCusVo){
        //记录删除
        CustomerLog customerLog = new CustomerLog(null,new Date(),deleteCusVo.getCustomerId(),deleteCusVo.getManagerId());
        customerDao.logDelCus(customerLog);
        customerDao.delCus(deleteCusVo.getCustomerId());
    }
}
