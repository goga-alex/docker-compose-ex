package com.geeksforgeeks.docker.controller;
 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@RequestMapping("api")
public class GFGController {
 
    @GetMapping("/get-project-name")
    public String getProjectName() {
        return "Geeks For Geeks Docker Compose Example";
    }
}