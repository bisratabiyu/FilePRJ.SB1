package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @GetMapping("/songform")
    public String loadSongFrom(Model model)
    {
        model.addAttribute("songObj",new Song());
        return "songform";
    }
    @PostMapping("/songform")
    public String loadSongForm(@ModelAttribute Song songObj,Model model)
    {
        model.addAttribute("mysong", songObj);

        return "confirmsong";
    }
}
