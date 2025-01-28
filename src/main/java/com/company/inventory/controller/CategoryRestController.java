package com.company.inventory.controller;

import com.company.inventory.response.CategoryResponseRest;
import com.company.inventory.services.ICategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CategoryRestController {
    private static final Logger logger = LoggerFactory.getLogger(CategoryRestController.class);

    @Autowired
    private ICategoryService service;


    @GetMapping("/categories")
    public ResponseEntity<CategoryResponseRest> searchCagories(){

        logger.info("estoy en categories");
        ResponseEntity<CategoryResponseRest> response =  service.search();
        return response;
    }
}
