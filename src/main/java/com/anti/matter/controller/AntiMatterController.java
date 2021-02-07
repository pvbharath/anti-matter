package com.anti.matter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("matter")
public class AntiMatterController {

    @GetMapping
    public String getMatter(){
        System.out.println("In Get");
        return "This is Anti-Matter Get";
    }

    @PostMapping
    public String createMatter(){
        System.out.println("In Create");
        return "This is Anti-Matter Post";
    }

    @PutMapping
    public String updateMatter(){
        System.out.println("In Update");
        return "This is Anti-Matter Put";
    }
}
