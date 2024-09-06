package com.example.demo.service;

import com.example.demo.entity.docker;
import com.example.demo.repos.dockerrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class dockerservice {
    @Autowired
    private dockerrepo dockerRepo;

    public List<docker>getAllData(){
        return dockerRepo.findAll();
    }

    public docker saveData(docker data){
        return dockerRepo.save(data);
    }
}
