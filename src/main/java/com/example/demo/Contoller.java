package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

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
     @RequestMapping("getAlien")
    public ModelAndView getAlien(int aid){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("showdetails.jps");
        Optional<Alien> alien=alienInterface.findById(aid);
        mv.addObject(alien);
        return mv;
     }
}
