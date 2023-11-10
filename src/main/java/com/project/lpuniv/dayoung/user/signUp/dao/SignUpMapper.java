package com.project.lpuniv.dayoung.user.signUp.dao;


import com.project.lpuniv.dayoung.user.signUp.dto.SignUpDto;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface SignUpMapper {

    void insertUser(SignUpDto signUpDto);

}
