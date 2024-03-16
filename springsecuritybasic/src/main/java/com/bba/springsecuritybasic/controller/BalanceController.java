package com.bba.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

    public String getBalanceDetails(){
        return "Here are the balance details from the DB";
    }
}
