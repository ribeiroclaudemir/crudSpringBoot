package br.com.biondo.enviosms;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/oi")
    public String hello() {
        return "Misericórdia!";
    }
}
