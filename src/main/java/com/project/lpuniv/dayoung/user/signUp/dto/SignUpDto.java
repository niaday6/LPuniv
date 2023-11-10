package com.project.lpuniv.dayoung.user.signUp.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;



    @Getter
    @Setter
    public  class SignUpDto {

        private int user_no;
        private Integer user_tp;
        private String user_name;
        private String user_tel;
        private String user_loginId;
        private String user_passwd;
        private String user_email;
        private String user_brdt;
        private Integer user_gen;
        private Date user_signdate;

        public SignUpDto(Integer user_no,Integer user_tp, String user_passwd, String user_name, String user_brdt, String user_email, String user_tel, Date user_signdate,Integer user_gen,String user_loginId) {
            this.user_no = user_no;
            this.user_tp = user_tp;
            this.user_name = user_name;
            this.user_tel = user_tel;
            this.user_loginId = user_loginId;
            this.user_passwd = user_passwd;
            this.user_email = user_email;
            this.user_brdt = user_brdt;
            this.user_gen = user_gen;
            this.user_signdate = user_signdate;
        }
    }

