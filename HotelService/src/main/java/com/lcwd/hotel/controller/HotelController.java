package com.lcwd.hotel.controller;

import java.util.*;
import com.lcwd.hotel.entities.Hotel;
import com.lcwd.hotel.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping("/createHotel")
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
        ResponseEntity<Hotel> hotel1 = ResponseEntity.status(HttpStatus.CREATED)
                .body(hotelService.create(hotel));
        return hotel1;
    }

    @GetMapping("/getById/{hotelId}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable String hotelId){
        ResponseEntity<Hotel> hotel1 = ResponseEntity.status(HttpStatus.OK)
                .body(hotelService.getHotel(hotelId));
        return hotel1;
    }


    @GetMapping("/getAllHotels")
    public ResponseEntity<List<Hotel>> getAllHotels(){
        ResponseEntity<List<Hotel>> hotel = ResponseEntity.status(HttpStatus.OK)
                .body(hotelService.getAllHotel());
        return hotel;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteHotel(@PathVariable String id){
        hotelService.deleteHotel(id);
    }
}
