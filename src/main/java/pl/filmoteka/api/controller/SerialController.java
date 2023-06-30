package pl.filmoteka.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SerialController {
    public static final String SERIAL_PAGE = "/serials";

    @GetMapping(value = SERIAL_PAGE)
    public String serialPage() {
        return "serials";
    }
}
