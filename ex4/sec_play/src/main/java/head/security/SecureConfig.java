package head.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecureConfig extends WebSecurityConfigurerAdapter {


    @Autowired
    private DataSource dataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        super.configure(auth);


//        super.configure(auth);

//        auth.authenticationProvider(new CustomAuthProvider())
//                .jdbcAuthentication()
//                .dataSource(dataSource);
//                .usersByUsernameQuery("select ")
//                .withDefaultSchema()
//                .


//        auth.userDetailsService()

//        InMemoryUserDetailsManager userDetailsService = new InMemoryUserDetailsManager();
//        userDetailsService.setAuthenticationManager();
//        auth.userDetailsService(userDetailsService);
        auth.jdbcAuthentication()
                .dataSource(dataSource);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests().antMatchers("/**").hasAnyRole();
//        http.httpBasic();
//        http.antMatcher("/**").authorizeRequests()
//        super.configure(http);

//        http.authorizeRequests().anyRequest().permitAll();




//        http.authorizeRequests().anyRequest().authenticated();


//        http.httpBasic();
//        http.formLogin();


        http.authorizeRequests().antMatchers("/adm/**").hasAuthority("admin");


//        http.authorizeRequests().antMatchers("/adm/**")
//        http.authorizeRequests().


    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring()
                .antMatchers("/h2/**");
    }
}
