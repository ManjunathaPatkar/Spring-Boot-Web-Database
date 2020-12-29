package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
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
    public ModelAndView getAlien(@RequestParam int aid){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("showdetails.jsp");
        Alien alien=alienInterface.findById(aid).orElse(new Alien());
//        Optional<Alien> alien=alienInterface.findById(aid);
        mv.addObject(alien);
        return mv;
     }
     @RequestMapping("deletealien")
    public String deletealien(@RequestParam int aid){
        Alien alien=alienInterface.findById(aid).orElse(new Alien());
        alienInterface.delete(alien);
        return "home.jsp";

     }
//     @RequestMapping("updatealien")
//    public String updatealien(Alien alien){
//        Alien alienn=alienInterface.findById(alien.getAid()).orElse(new Alien());
//        alienInterface.delete(alienn);
//        alienInterface.save(alien);
//        return "home.jsp";
//     }
    @RequestMapping("updatealien")
    public String updatealien(Alien alien){
        alienInterface.save(alien);
        return "home.jsp";
    }
//    @RequestMapping("getalientech")
//    public ModelAndView getalientech(@RequestParam String tech){
////        System.out.println(alienInterface.findByTech(tech));
//            ModelAndView mv=new ModelAndView("showdetails.jsp");
////            List<Alien> alien= alienInterface.findByTech(tech);
//            mv.addObject(alienInterface.findByTech(tech));
//        return mv;
//    }
    @RequestMapping("greaterthanid")
    public String  greaterthanid(@RequestParam int aid){
//        ModelAndView mv=new ModelAndView("showdetails.jsp");
        System.out.println(alienInterface.findByAidGreaterThan(aid));
        return "home.jsp";
    }
}
