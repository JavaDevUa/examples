package head.security;

import head.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class CustomUserDetails implements UserDetailsService {

    @Autowired
    private AppUserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var res = repository.findByPersonName(username);
        if (res == null)
        {
            throw new RuntimeException("dsf");
        }

//        new User(res.getUsername(), res.getPassword(), );
        return null;
    }
}
