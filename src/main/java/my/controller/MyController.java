package my.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/my")
    public String helloWorld(Model model) {
        model.addAttribute("message", "Hello World!");
        return "my";
    }
}