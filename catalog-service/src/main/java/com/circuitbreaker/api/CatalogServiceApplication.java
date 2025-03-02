package com.circuitbreaker.api;

import com.circuitbreaker.api.entity.Order;
import com.circuitbreaker.api.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication


public class CatalogServiceApplication {


    public static void main(String[] args) {
        SpringApplication.run(CatalogServiceApplication.class, args);
    }

}
