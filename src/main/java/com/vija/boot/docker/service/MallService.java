package com.vija.boot.docker.service;

import com.vija.boot.docker.model.Stores;
import jdk.nashorn.internal.runtime.logging.Logger;
import org.apache.catalina.Store;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MallService {
    ArrayList<Stores> stores;
    public MallService() {
        this.stores= new ArrayList<Stores>(Arrays.asList(
                new Stores(1,"Zara"),
                new Stores(2,"Samsung")
        ));
    }

    @Bean
    public List<Stores> getMallStores() {

        return stores;

    }
}
