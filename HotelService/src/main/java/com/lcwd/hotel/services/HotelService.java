package com.lcwd.hotel.services;

import com.lcwd.hotel.entities.Hotel;

import java.util.List;

public interface HotelService {

    //Create

    Hotel create(Hotel hotel);

    //getAll
    List<Hotel> getAllHotel();

    //getSingle
    Hotel getHotel(String id);


    //deleteHotelById
    void deleteHotel(String id);
}
