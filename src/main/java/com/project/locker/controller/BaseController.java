package com.project.locker.controller;

import com.project.locker.dto.CommonRs;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class BaseController {
    private static final String SUCCESS="success";

    public <T> ResponseEntity<CommonRs<T>> ok(T data) {
        return new ResponseEntity<>(new CommonRs<>(HttpStatus.OK.value(), SUCCESS, null, data), HttpStatus.OK);
    }
    
    public <T> ResponseEntity<CommonRs<T>> ok(T data, String msg) {
        return new ResponseEntity<>(new CommonRs<>(HttpStatus.OK.value(), msg, null, data), HttpStatus.OK);
    }
    
    public <T> ResponseEntity<CommonRs<T>> ok(T data, Long count) {
    	return new ResponseEntity<>(new CommonRs<>(HttpStatus.OK.value(), SUCCESS, count, data), HttpStatus.OK);
    }

    public <T> ResponseEntity<CommonRs<T>> ok() {
        return new ResponseEntity<>(new CommonRs<>(HttpStatus.OK.value(), SUCCESS), HttpStatus.OK);
    }

    public <T> ResponseEntity<CommonRs<T>> badRequest(T data) {
        return new ResponseEntity<>(new CommonRs<>(HttpStatus.BAD_REQUEST.value(), "bad request", null, data), HttpStatus.BAD_REQUEST);
    }
    
    public <T> ResponseEntity<CommonRs<T>> badRequest(String msg) {
        return new ResponseEntity<>(new CommonRs<>(HttpStatus.BAD_REQUEST.value(), msg), HttpStatus.BAD_REQUEST);
    }
    
    public <T> ResponseEntity<CommonRs<T>> created(T data) {
        return new ResponseEntity<>(new CommonRs<>(HttpStatus.CREATED.value(), SUCCESS, null, data), HttpStatus.CREATED);
    }
}
