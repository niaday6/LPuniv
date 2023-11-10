package com.project.lpuniv.dayoung.user.signUp.service;


import com.project.lpuniv.dayoung.user.login.dao.LoginDao;
import com.project.lpuniv.dayoung.user.signUp.dto.SignUpDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignUpService {

    @Autowired
    private LoginDao loginMapper;

    public void insertEmp(SignUpDto signUpDto) {
        loginMapper.insertEmp(signUpDto);
    }

    public boolean checkId(String user_loginId) {
        return loginMapper.checkId(user_loginId);
    }


}
