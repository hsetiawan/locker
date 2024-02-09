package com.project.locker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/v1/order")
public class LockerOrderController extends BaseController{

    @GetMapping("")
    public ResponseEntity<?> getAll(){
        return ok("success");
    }
}
