package com.boot.oauth2.authorization.server.boot_oauth2_authorization_server.com.boot.oauth2.authorization.server.boot_oauth2_authorization_server;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@RestController
@EnableResourceServer
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
    //Method to check if the user has a valid token to access resource
    @RequestMapping("/validateUser")
    public Principal user(Principal principal) {
    	return principal;
    }
}
