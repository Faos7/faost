package com.faost.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by faos7 on 14.06.17.
 */
@RestController
public class UserRestController {
    @RequestMapping("/user")
    public Principal user (Principal user){
        return user;
    }
}
