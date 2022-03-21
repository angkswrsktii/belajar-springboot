package belajar.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/belajar/java")

public class WelcomeController {
    @GetMapping
    public String welcomeJava() {
        return "Hello Gais";
    }
}
