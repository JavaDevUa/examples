package pack;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pack.domain.AppUser;
import pack.domain.Role;
import pack.services.UserService;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

@SpringBootApplication
@RestController
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }

//    @GetMapping("/")
//    public String hello() throws IOException, InterruptedException {
//        HttpClient httpClient = HttpClient.newHttpClient();
//        HttpRequest httpRequest = HttpRequest.newBuilder(URI.create("http://localhost:8081/sup"))
//                .GET()
//                .build();
//
//        HttpResponse<String> res = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
//        return res.body();
//    }

    @GetMapping("/")
    public String hi()
    {
        return "abc";
    }

    @Bean
    CommandLineRunner run(UserService userService) {
        return args -> {
            userService.saveRole(new Role(null, "ROLE_USER"));
            userService.saveRole(new Role(null, "ROLE_MANAGER"));
            userService.saveRole(new Role(null, "ROLE_ADMIN"));
            userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

            userService.saveUser(new AppUser(null, "John Travolta", "john", "1234", new ArrayList<>()));
            userService.saveUser(new AppUser(null, "Will Smith", "will", "1234", new ArrayList<>()));
            userService.saveUser(new AppUser(null, "Jim Carry", "jim", "1234", new ArrayList<>()));
            userService.saveUser(new AppUser(null, "Arnold Shwarts", "arnold", "1234", new ArrayList<>()));

            userService.addRoleToUser("john", "ROLE_USER");
            userService.addRoleToUser("john", "ROLE_MANAGER");
            userService.addRoleToUser("will", "ROLE_MANAGER");
            userService.addRoleToUser("jim", "ROLE_ADMIN");
            userService.addRoleToUser("arnold", "ROLE_SUPER_ADMIN");
            userService.addRoleToUser("arnold", "ROLE_ADMIN");
            userService.addRoleToUser("arnold", "ROLE_USER");
        };

    }
}
