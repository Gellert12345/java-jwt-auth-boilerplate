package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // handle incoming input from users
public class ContentController {
    @GetMapping("/login") // login.html
    public String login() {
        return "login";
    }

    @GetMapping("/req/signup") // req mert adatokat kérek a frontedntől a backendbe (getmapping => figyeld és
                               // hallgassd ez. aporotot)
    public String signup() {
        return "signup";
    }
}
