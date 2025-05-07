package com.example.demo.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class DemoController1 {

    @RequestMapping("/abc")
    public String getName(@RequestParam("un") String un) {
        return un;
    }
    
    @PostMapping("/users")
    public String getId(@RequestBody String name)
    {
    	return name;
    }
    @RequestMapping("/Id")
    public String getById(@RequestParam(required = false) String id) {
        List<String> al = new ArrayList<>();
        al.add("1");
        al.add("2");
        al.add("3");
        al.add("4");
        al.add("5");
        al.add("6");
        al.add("7");
        al.add("8");
        al.add("9");
        al.add("10");

        if (id != null) {
            for (String s : al) {
                if (s.equals(id)) {
                    return s;
                }
            }
            return "";
        }

        return al.toString();
    }
}