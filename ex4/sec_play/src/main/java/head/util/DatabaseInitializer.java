package head.util;

import head.domain.HeadRole;
import head.domain.HeadUser;
import head.services.HeadService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static head.util.RoleCon.*;

@Component
@RequiredArgsConstructor
public class DatabaseInitializer implements CommandLineRunner {

//    @Autowired
//    private HeadService appService;
//
//    DatabaseInitializer (HeadService appService)
//    {
//        this.appService = appService;
//    }

    
    @Override
    public void run(String... args) {
//        System.out.println("Wait");
    }
}
