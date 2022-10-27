package com.example.springapp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.function.EntityResponse;

@Controller
public class TestController {

    @ResponseBody
    @RequestMapping
    public ResponseEntity
            <String> function(){
        return new ResponseEntity<>("hello from controllers", HttpStatus.OK);

    }
}
