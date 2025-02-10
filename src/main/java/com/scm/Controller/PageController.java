package com.scm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/home")
    public String homePage(Model model) {

        //        sending data to link

        model.addAttribute("name", "Mr.Chirag Bhisikar");
        model.addAttribute("youtubeChannel", "Chirag Bhisikar");
        model.addAttribute("githubRepo", "https://github.com/chiragbhisikar");
        return "home";
    }
}
