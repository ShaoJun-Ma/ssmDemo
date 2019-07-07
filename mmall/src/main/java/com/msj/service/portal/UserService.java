package com.msj.service.portal;

import com.msj.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    User selectByName(@Param("username")String username,@Param("password")String password);
    User selectForRegister(@Param("username")String username,@Param("password")String password,
                           @Param("email")String email,@Param("phone")String phone,
                           @Param("question")String question,@Param("answer")String answer);
}