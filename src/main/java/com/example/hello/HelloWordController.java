package com.example.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller

public class HelloWordController {
    @GetMapping("/welcome")
    public String hello(Model model){
    model.addAttribute("message", "helloworld");
        return"helloworld";
    }
        @GetMapping("/style")
        public String style(){
            return"add-html-css-js-demo";
        } 
}
