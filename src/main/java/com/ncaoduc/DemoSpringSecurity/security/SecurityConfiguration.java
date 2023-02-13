package com.ncaoduc.DemoSpringSecurity.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.sql.DataSource;


@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        final String sqlUserName = "SELECT username, password, role FROM users WHERE username=?;";
        final String sqlAuthorities = "SELECT username, password, role FROM users WHERE username=?;";

        auth.jdbcAuthentication().dataSource(dataSource).usersByUsernameQuery(sqlUserName)
                .authoritiesByUsernameQuery(sqlAuthorities).passwordEncoder(new BCryptPasswordEncoder());
    }

//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http// ,
//                .authorizeRequests()// ,
//                .antMatchers( "/home").permitAll()
//                .antMatchers("/index.html").permitAll()
//                .antMatchers("/admin/**").hasRole("ADMIN")
//                .antMatchers("/member/**").hasAnyRole("MEMBER", "ADMIN")
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .loginProcessingUrl("/j_spring_security_check")
//                .loginProcessingUrl("/signin")
//                .defaultSuccessUrl("/admin")
//                .failureUrl("/login?error")
//                .usernameParameter("txtUsername")
//                .passwordParameter("txtPassword")
//                 .and()
//                .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login")
//                .and()
//                .rememberMe().tokenValiditySeconds(2592000).key("mySecret!").rememberMeParameter("checkRememberMe");
//
//        return http.build();
//    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers( "/home").permitAll()
                .antMatchers("/index.html").permitAll()
                .antMatchers("/admin/**").hasRole("ADMIN")
                .antMatchers("/member/**").hasAnyRole("MEMBER", "ADMIN")
                .and()
                .formLogin().loginPage("/login").permitAll()
                .loginProcessingUrl("/signin")
                .usernameParameter("txtUsername")
                .passwordParameter("txtPassword")
                .and()
                .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login")
                .and()
                .rememberMe().tokenValiditySeconds(2592000).key("mySecret!").rememberMeParameter("checkRememberMe");
    }

//    @Bean
//    DaoAuthenticationProvider authenticationProvider(){
//        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
//        daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
//        daoAuthenticationProvider.setUserDetailsService((UserDetailsService) this.userService);
//
//        return daoAuthenticationProvider;
//    }
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) {
//        auth.authenticationProvider(authenticationProvider());
//    }


//    @Bean
//    PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }

//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//
//        List<User> users = userService.getUser();
//        GrantedAuthority authority;
//
//        for (User user : users){
//            authority = new SimpleGrantedAuthority(user.getRole());
//            auth.inMemoryAuthentication()
//                    .withUser(user.getUsername()).password(user.getPassword())
//                    .authorities(authority);
//
//        }
//        super.configure(auth);
//    }
}
