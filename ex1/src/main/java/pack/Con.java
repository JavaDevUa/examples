package pack;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Con {
    @GetMapping("/")
    public String a()
    {
        return "Hi";
    }
}
