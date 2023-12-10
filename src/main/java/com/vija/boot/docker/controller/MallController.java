package com.vija.boot.docker.controller;


import com.vija.boot.docker.model.Stores;
import com.vija.boot.docker.service.MallService;
import org.apache.catalina.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mall")
public class MallController {


    @Autowired
    private MallService mallService;

@GetMapping("/getStores")
public List<Stores> getStores(){

    return mallService.getMallStores();
}
}
