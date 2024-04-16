//package com.api.diary_api.common.security;
//
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api/v1/demo")
//public class KeycloakController {
//    @GetMapping("/hello")
//    @PreAuthorize("hasRole('client_user')")
//    public String hello(){
//        return "Hello from Spring boot & Keycloak";
//    }
//
//    @GetMapping("/hello-2")
//    @PreAuthorize("hasRole('client_admin')")
//    public String hello2(){
//        return "Hello from Spring boot & Keycloak - ADMIN";
//    }
//
//}
