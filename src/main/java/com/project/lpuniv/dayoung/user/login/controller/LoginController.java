package com.project.lpuniv.dayoung.user.login.controller;


import com.project.lpuniv.dayoung.user.login.dao.LoginDao;
import com.project.lpuniv.dayoung.user.login.dto.AuthInfo;
import com.project.lpuniv.dayoung.user.login.dto.UserDto;
import com.project.lpuniv.dayoung.user.login.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private LoginDao loginDao;

    @Autowired
    private AuthService authService;

    @GetMapping(value = "/")
    public String getLogin() {
        return "dayoung/loginForm";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String PostLogin(@RequestParam("user_loginId") String user_loginId, @RequestParam("user_passwd") String user_passwd, HttpSession session) {
        AuthInfo authInfo = authService.authenticate(user_loginId, user_passwd);
        session.setAttribute("authInfo", authInfo);

        String id = user_loginId;

         UserDto userDto= loginDao.loginById(id);
         String userId = userDto.getUser_loginId();
       ;


        if(userId != null ){

            userDto = loginDao.loginByPw(id);
            String pw=  userDto.getUser_passwd();


            if(user_passwd.equals(pw)){

              int type =authInfo.getUser_tp();

                if(authInfo !=null) {
                    int user_tp =authInfo.getUser_tp();

                    if (user_tp == 1) {
                        return "/dayoung/stuMain";
                    } else if (user_tp == 2) {
                        return "/dayoung/teaMain";

                    } else if (user_tp == 3) {
                        return "/dayoung/adminMain";

                    }
                }
          }
        }
        return "redirect:/";
    }



}
