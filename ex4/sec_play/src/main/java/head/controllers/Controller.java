package head.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @PostMapping("/login")
    public String login()
    {
        return "";
    }

    @GetMapping("/ericsson")
    public String ericsson()
    {
        return "ericson page";
    }

    @GetMapping("/superadm")
    public String superadm()
    {
        return "super admin dashboard";
    }

    @GetMapping("/adm")
    public String adm()
    {
        return "admin dashboard";
    }

    @GetMapping("/metrics")
    public String metrics()
    {
        return "metrics res";
    }

}
