package team1.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MvcController {
    @RequestMapping ("/")
    public String home(){
        System.out.println("Dodās uz galvenolapu....");
        return "index";
    }
    @RequestMapping ("/dati")
    public String datubaze(){
        System.out.println("Dodās uz datubāzi...");
        return "dati";
    }
}
