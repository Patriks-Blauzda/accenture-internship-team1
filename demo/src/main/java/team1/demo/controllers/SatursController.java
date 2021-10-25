package team1.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import team1.demo.entity.Datubaze.Saturs;
import team1.demo.services.SatursService;


@Controller
public class SatursController {

    @Autowired
    private SatursService satursService;

    public SatursController(SatursService satursService) {
        this.satursService = satursService;
    }

    @GetMapping ("/")
    public String insertData(Model model){
        Saturs saturs = new Saturs();
        model.addAttribute("insertData",saturs);
        System.out.println("Dodās uz galvenolapu....");
        return "index";
    }
    @GetMapping("/saturs")
    public String listSaturs(Model model){
        model.addAttribute("saturs",satursService.findAll());
        System.out.println("Dodās uz datubāzi....");
        return "saturs";
    }
    @PostMapping("/")
    public String saveSaturs(@ModelAttribute("saturs") Saturs saturs){
       satursService.saveSaturs(saturs);
       return "redirect:/saturs";
    }













    //@GetMapping ("/dati")
    //public String datubaze(){
        //Saturs saturs = new Saturs();
        //saturs.setNr(1L);
                //satursService.save(saturs);
        //List<Saturs>sararakst = satursService.findAll();
        //System.out.println("Dodās uz datubāzi...");
        //return "dati";
    //}

}
