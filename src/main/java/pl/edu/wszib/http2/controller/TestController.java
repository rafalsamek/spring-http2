package pl.edu.wszib.http2.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public String test(Model model) {
        model.addAttribute("name", "Rafał");
        model.addAttribute("show", true);
        return "test";
    }
}
