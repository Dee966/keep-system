package com.xiaoman.keep_system.dao;

import com.xiaoman.keep_system.pojo.po.Manager;
import com.xiaoman.keep_system.pojo.po.Share;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ManagerDao {

    @Update("update customer set times = times - 1 where customer_id = #{customerId}")
    void updateCusTime(int customerId);

    @Delete("delete from customer where customer_id = #{customerId}")
    void deleteCus(int customerId);

    @Insert("insert into share values(null,#{content},#{firImg},#{secImg},#{thiImg},#{name},#{praise},#{shareTime})")
    void share(Share share);

    @Delete("delete from coach where coachId = #{coachId}")
    void deleteCoach(int coachId);

    @Update("update manager set email = #{email},telephone = #{telephone},work_time = #{workTime} where manager_id = #{managerId}")
    void updateManager(Manager manager);

    @Delete("delete from share where share_id = #{shareId}")
    void delShare(int shareId);

    @Delete("delete from comment where share_id = #{shareId}")
    void delComment(int shareId);
}
