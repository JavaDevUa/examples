package head.security;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

public class CustomAuthProvider implements AuthenticationProvider {
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//        authentication.getName();
//        authentication.getPrincipal();
//        authentication.getCredentials().toString();
//

        System.out.println(authentication.getName());
        System.out.println(authentication.getPrincipal());
        System.out.println(authentication.getCredentials());
        return null;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(CustomAuthToken.class);
//        return false;
    }
}
