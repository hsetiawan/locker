package com.project.locker.controller;


import com.project.locker.dto.request.LockerBoxDto;
import com.project.locker.service.LockerBoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/v1/locker")
public class LockerController extends BaseController {

    @Autowired
    LockerBoxService lockerBoxService;

    @PostMapping("")
    public ResponseEntity<?> create(@RequestBody LockerBoxDto lockerBoxDto) throws Exception{
        return ok(lockerBoxService.create(lockerBoxDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody LockerBoxDto lockerBoxDto) throws Exception{
        return ok();
    }
}
