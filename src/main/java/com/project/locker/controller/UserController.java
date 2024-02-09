package com.project.locker.controller;

import com.project.locker.dto.request.UserRequestDto;
import com.project.locker.exception.APIException;
import com.project.locker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/v1/user")
public class UserController extends BaseController{

    @Autowired
    UserService userService;

    @GetMapping("")
    public ResponseEntity<?> getAll(){
        return ok(userService.getAll());
    }


    @PostMapping("")
    public ResponseEntity<?> create(@RequestBody UserRequestDto userRequestDto) throws Exception{
        return ok(userService.create(userRequestDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody UserRequestDto userRequestDto, @PathVariable Long id) throws Exception{
        return ok(userService.update(id, userRequestDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) throws Exception{
        return ok(userService.delete(id));
    }
}
