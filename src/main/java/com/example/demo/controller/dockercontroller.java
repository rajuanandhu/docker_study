package com.example.demo.controller;

import com.example.demo.entity.docker;
import com.example.demo.service.dockerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class dockercontroller {
    @Autowired
    private dockerservice dockerService;
    @GetMapping("/data")
    public List<docker>getData(){
        return dockerService.getAllData();

    }
    public  docker postData (@RequestBody docker dataRow){
        return dockerService.saveData(dataRow);

    }


}
