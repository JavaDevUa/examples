package head.util;

import head.domain.HeadRole;
import head.domain.HeadUser;
import head.services.HeadService;
import head.util.spec.SpecialAuthority;
import head.util.spec.SpecialAuthorityRepo;
import head.util.spec.SpecialUsername;
import head.util.spec.SpecialRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;

import static head.util.RoleCon.*;
import static head.util.RoleCon.ERICSSON;

@Component
public class Abc {

    private HeadService appService;

    Abc (HeadService appService)
    {
        this.appService = appService;
    }

    @EventListener
    public void abc(ApplicationStartedEvent e)
    {
        var roleAdm = appService.saveRole(new HeadRole(ADMIN));
        var roleSuperAdm = appService.saveRole(new HeadRole(SUPER_ADMIN));
        var roleEric = appService.saveRole(new HeadRole(ERICSSON));

        var u1 = new HeadUser("John Travolta", "john", "1234", new HashSet<>());
        var u2 = new HeadUser("Will Smith", "will", "1234", new HashSet<>());
        var u3 = new HeadUser("Jim Carry", "jim", "1234", new HashSet<>());

        appService.saveUser(u1);
        appService.saveUser(u2);
        appService.saveUser(u3);


        u1.getRoles().add(roleAdm);
        u2.getRoles().addAll(List.of(roleAdm, roleSuperAdm));
        u3.getRoles().addAll(List.of(roleAdm, roleSuperAdm, roleEric));


        appService.saveUser(u1);
        appService.saveUser(u2);
        appService.saveUser(u3);

    }

    @EventListener
    public void def(ApplicationStartedEvent event)
    {
//        var a = new SpecialUsername("vitya", "11", 1);
//        var aPas = "{bcrypt}$2a$10$QIL8HCW5.b44OVU76DCEzeEssLcQ3lGJyQLOmDj/tStiWO6zczc6G";
        var aPas = "$2a$10$QIL8HCW5.b44OVU76DCEzeEssLcQ3lGJyQLOmDj/tStiWO6zczc6G";

        var a = new SpecialUsername("vitya", aPas, 1);
        var ar = repo.saveAndFlush(a);

        var au = new SpecialAuthority("vitya", "admin");
        authorityRepo.saveAndFlush(au);

        var pef = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        var ss = pef.encode("11");


        var users = List.of(
                new SpecialUsername("jim", aPas, 1),
                new SpecialUsername("arnold", aPas, 1),
                new SpecialUsername("john", aPas, 1)
        );

        var auth = List.of(
                new SpecialAuthority("jim", "admin"),

                new SpecialAuthority("arnold", "admin"),
                new SpecialAuthority("arnold", "sadmin"),


                new SpecialAuthority("john", "admin"),
                new SpecialAuthority("john", "sadmin"),
                new SpecialAuthority("john", "ericsson")
        );

        repo.saveAllAndFlush(users);
        authorityRepo.saveAllAndFlush(auth);
    }

    @Autowired SpecialRepo repo;
    @Autowired
    SpecialAuthorityRepo authorityRepo;

    @Bean
    PasswordEncoder passwordEncoder()
    {
        return new BCryptPasswordEncoder();
    }


}
