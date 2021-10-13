package team1.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DataController {

    @Autowired
    private DataDao dao;

    @PostMapping("/data")
    public String handlePostRequest(Data data) {
        dao.save(data);
        return "redirect:/data";
    }

    @GetMapping("/data")
    public String handleGetRequest(Model model) {
        model.addAttribute("ievades", dao.loadAll());
        return "index";
    }
}
