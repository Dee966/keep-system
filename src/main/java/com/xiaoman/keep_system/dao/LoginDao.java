package com.xiaoman.keep_system.dao;

import com.xiaoman.keep_system.pojo.po.Coach;
import com.xiaoman.keep_system.pojo.po.Customer;
import com.xiaoman.keep_system.pojo.po.Manager;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface LoginDao {
    @Select("select * from customer where username = #{username}")
    Customer getCusByUsername(String username);

    @Select("select * from coach where username = #{username}")
    Coach getCoachByUsername(String username);

    @Select("select * from manager where username = #{username}")
    Manager getMaByUsername(String username);

    @Insert("insert into customer values(null,#{username},#{password},null,null,null,null,null,null,null,null,null,null,null)")
    @Options(useGeneratedKeys = true,keyProperty = "customerId",keyColumn = "customer_id")
    Integer registerCus(Customer customer);

    @Insert("insert into coach values(null,#{username},#{password},null,null,null,null,null,null,null,null,null,null,null,null,null)")
    void registerCoach(Coach coach);

    @Insert("insert into manager values(null,#{username},#{password},null,null,null)")
    void registerMa(Manager manager);

    @Update("update customer set email = #{email},safe_code = #{code} where customer_id = #{customerId}")
    void addCode(@Param("email") String email,@Param("code") String code,@Param("customerId") int customerId);

    @Select("select safe_code from customer where customer_id = #{customerId}")
    String getCode(int customerId);

    @Update("update customer set safe_code = ' ' where customer_id = #{customerId}")
    void moveCode(int customerId);

    @Update("update customer set password = #{password} where customer_id = #{customerId}")
    void updCusPass(Customer customer);

    @Update("update coach set password = #{password} where coach_id = #{coachId}")
    void updCoachPass(Coach coach);
}
