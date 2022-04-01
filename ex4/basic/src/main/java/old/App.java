package old;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@SpringBootApplication
@RestController
public class App {

    public static void main(String[] args) throws IOException {
//        SpringApplication.run(App.class);

        //delete all files with extensino 'srt' in subdirs
        var s = "/home/pros/Playground/25/valid";
        var dir = Paths.get(s);
        new App().del(dir);
    }

    void del(Path path) throws IOException {

        Files.list(path).forEach(p -> {
            try {
                del(p);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        Files.list(path).forEach(p ->{
            var isFile = p.toFile().isFile();
            if (isFile)
            {
                var file = p.toFile();
                var name = file.getName();
                var lindex = name.lastIndexOf(".");
                var ext = name.substring(lindex + 1);
                if (ext.equals("srt"))
                {
                    file.delete();
                }

            }
        });
    }

}
