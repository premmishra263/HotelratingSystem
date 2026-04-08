package com.lcwd.hotel.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestControllerAdvice
public class GlobalExceptionhandler {

    public ResponseEntity<Map<String, Objects>> notFoundHandler(ResourceException ex) {
        Map map = new HashMap();
        map.put("message", ex.getMessage());
        map.put("success", false);
        map.put("status", HttpStatus.NOT_FOUND);
        ResponseEntity<Map<String, Objects>> res = ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(map);
        return res;
    }
}
