package pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

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
}
