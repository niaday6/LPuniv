package com.project.lpuniv.dayoung.user.signUp.controller;


import com.project.lpuniv.dayoung.user.signUp.dto.SignUpDto;
import com.project.lpuniv.dayoung.user.signUp.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SignUpController {

    @Autowired
    SignUpService signUpService;


    @RequestMapping(value = "/dayoung/signUp", method = RequestMethod.GET)
    public String getSignUp() {
        return "dayoung/signUpForm";
    }

    @RequestMapping(value = "/dayoung/signUp", method = RequestMethod.POST)
    public String postSignUp(@ModelAttribute SignUpDto signUpDto, RedirectAttributes redirectAttributes) {

            signUpService.insertEmp(signUpDto);
            return "/main";

    }


}
