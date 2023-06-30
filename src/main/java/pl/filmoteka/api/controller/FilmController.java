package pl.filmoteka.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FilmController {
    public static final String FILM_PAGE = "/films";

    @GetMapping(value = FILM_PAGE)
    public String filmsPage() {
        return "films";
    }
}
