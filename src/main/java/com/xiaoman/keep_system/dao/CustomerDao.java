package com.xiaoman.keep_system.dao;

import com.xiaoman.keep_system.pojo.dto.CoachDto;
import com.xiaoman.keep_system.pojo.dto.CustomerDto;
import com.xiaoman.keep_system.pojo.po.*;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CustomerDao {
    @Select("select * from customer where customer_id = #{customerId}")
    Customer getCustomerById(@Param("customerId") int customerId);

    @Update("update customer set coach_id = #{coachId} where customer_id = #{customerId}")
    void chCoach(Customer customer);

    @Update(("update customer set " +
            "telephone = #{telephone},name = #{name},sex = #{sex},age = #{age},tall = #{tall},weight = #{weight} " +
            "where customer_id = #{customerId}"))
    void  updateCustomer(Customer customer);

    @Select("select * from customer where customer_id = #{customerId}")
    @Results({
//            @Result(property = "coachId", column = "coach_id"),
            @Result(property = "coachDto", column = "coach_id", one = @One(select = "com.xiaoman.keep_system.dao.CustomerDao.getCoachDto"))
    })
    CustomerDto getCustomer(int customerId);

    @Select("select * from coach where coach_id = #{coachId}")
    CoachDto getCoachDto(int coachId);

    @Insert("insert into share values(null,#{content},#{firImg},#{secImg},#{thiImg},#{name},0,#{workTime})")
    void share(Share share);

    @Delete("delete from customer where share_id = #{shareId}")
    void delShare(int shareId);

    @Update("update share set praise = praise + 1 where share_id = #{shareId}")
    void confirm(int shareId);

    @Update("update share set praise = praise - 1 where share_id = #{shareId}")
    void cancel(int shareId);

    @Insert("insert into comment values(null,#{content},#{shareId},#{name})")
    void comment(Comment comment);

    @Delete("delete from comment where comment_id = #{commentId}")
    void delComment(int commentId);

    @Select("select * from comment where share_id = #{shareId}")
    List<Comment> listComment(int shareId);

    @Select("SELECT * FROM `share` ORDER BY share_id DESC")
    List<Share> listShare();

    @Insert("insert into customer_log values(null,#{customerLeave},#{customerId},#{managerId})")
    void logDelCus(CustomerLog customerLog);

    @Delete("delete from customer where customer_id = #{customerId}")
    void delCus(int customerId);

}
