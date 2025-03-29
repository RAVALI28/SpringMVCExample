package com.SpringMVCExample.springMVC.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

    @Controller
    public class HomeController {

        @GetMapping("/")
        public String homePage(Model model) {
            model.addAttribute("message", "Welcome to Spring MVC with Thymeleaf!");
            return "home";  // Returns home.html from templates folder
        }

        @GetMapping("/contact")
        public String contactForm() {
            return "contact"; // Returns contact.html
        }

        @PostMapping("/submitForm")
        public String submitForm(@RequestParam String name, @RequestParam String email, Model model) {
            model.addAttribute("name", name);
            model.addAttribute("email", email);
            return "success"; // Returns success.html with user data
        }
    }

