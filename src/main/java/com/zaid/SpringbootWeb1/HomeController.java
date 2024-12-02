package com.zaid.SpringbootWeb1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        // This prints to std out, indicating this controller is being called correctly
        System.out.println("Home method called!");
        return "index.jsp";
    }
}
