package com.programmingfree.springservice.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;



//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
//@CrossOrigin(origins = "http://localhost:1080")
@RestController
@RequestMapping("/user")
public class UserController {

    private final Map<String, List<String>> userDb = new HashMap<>();

    public UserController() {
    	System.out.println("nonn");
        userDb.put("ravi", Arrays.asList("user"));
        userDb.put("kiran", Arrays.asList("user", "admin"));
        userDb.put("sathish", Arrays.asList("user", "manager", "owner"));
    }

    
    @RequestMapping(value = "/*", method = RequestMethod.POST)
    public LoginResponse login(@RequestParam final String loginname)
        throws ServletException {
        if (loginname == null || !userDb.containsKey(loginname)) {
            throw new ServletException("Invalid login");
        }
        return new LoginResponse(Jwts.builder().setSubject(loginname)
            .claim("roles", userDb.get(loginname)).setIssuedAt(new Date())
            .signWith(SignatureAlgorithm.HS256, "secretkey").compact());
    }
    
    
    @RequestMapping(value = "/dicv/login", method = RequestMethod.POST,consumes = {"application/xml", "application/json"})
    public LoginResponse login(@RequestBody final Login login)
        throws ServletException {
        if (login.getName() == null || !userDb.containsKey(login.getName())) {
            throw new ServletException("Invalid login");
        }
        return new LoginResponse(Jwts.builder().setSubject(login.getName())
            .claim("roles", userDb.get(login.getName())).setIssuedAt(new Date())
            .signWith(SignatureAlgorithm.HS256, "secretkey").compact());
    }

    @SuppressWarnings("unused")
    private static class UserLogin {
        public String name;
        public String password;
    }

    @SuppressWarnings("unused")
    private static class LoginResponse {
        public String token;

        public LoginResponse(final String token) {
            this.token = token;
        }
    }
}
