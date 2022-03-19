package com.example.my_spring_book_manager.mapper;

import com.example.my_spring_book_manager.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from user where username = #{username}")
    User getPasswordByUserName(@Param("username") String username);

}
