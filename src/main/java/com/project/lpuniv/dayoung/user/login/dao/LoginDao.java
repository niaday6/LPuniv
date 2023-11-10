package com.project.lpuniv.dayoung.user.login.dao;


import com.project.lpuniv.dayoung.user.login.dto.UserDto;
import com.project.lpuniv.dayoung.user.login.dto.LoginDto;
import com.project.lpuniv.dayoung.user.signUp.dto.SignUpDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface LoginDao {

    public void insertEmp(SignUpDto signUpDto);
    Integer countEmpAdress();

    boolean checkTel(String user_tel);

    UserDto  loginById(String user_loginId);

     UserDto selectById(@Param("user_loginId") String user_loginId);

    public Integer TypeById(@Param("user_loginId") int user_loginId);


    boolean checkId(String userLoginId);
    UserDto loginByPw(@Param("user_loginId") String user_loginId);

    UserDto selectByID(@Param("user_loginId") String user_loginId);
}
