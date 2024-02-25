package com.gugu.example.springmybatisproxy.mapper;

import com.gugu.example.springmybatisproxy.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author gugu
 * @Classname UserMapper
 * @Description TODO
 * @Date 2022/7/17 9:03
 */
public interface UserMapper {
    @Select("select * from user where id = #{userId}")
    User getUser(@Param("userId") String userId);
}
