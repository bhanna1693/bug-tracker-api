package com.bhanna.bugtracker.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    private LoginService loginService;

    @PostMapping("/login")
    public String handleLogin(@RequestParam String username, @RequestParam String password) {
        if (loginService.authenticate(username, password)) {
            return "redirect:/";
        }

        return "login";
    }
}
