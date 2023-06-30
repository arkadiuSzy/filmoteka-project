package pl.filmoteka.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private static final String HOME = "/";

    @GetMapping(value = HOME)
    public String homePage() {
        return "index";
    }

}

