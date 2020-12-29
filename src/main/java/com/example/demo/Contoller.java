package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Contoller {
    @Autowired
    AlienInterface alienInterface;
    @RequestMapping("home")
    public String home(){

        return "home.jsp";
    }
    @RequestMapping("addAlien")
    public String addAlien(Alien alien){
        alienInterface.save(alien);
        return "home.jsp";
     }
}
