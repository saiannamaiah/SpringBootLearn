package com.love2code.sprinboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")

    private String teamName;


    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach " +coachName + " Team name " + teamName;
    }

    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run 5kms";
    }



}
