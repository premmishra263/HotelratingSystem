package com.lcwd.hotel.services;

import com.lcwd.hotel.entities.Hotel;
import com.lcwd.hotel.exception.ResourceException;
import com.lcwd.hotel.repo.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService{

    @Autowired
    private HotelRepository hotelRepository;


    @Override
    public Hotel create(Hotel hotel) {
        String id = UUID.randomUUID().toString();
        hotel.setId(id);
        Hotel result = hotelRepository.save(hotel);
        return result;
    }

    @Override
    public List<Hotel> getAllHotel() {
        List<Hotel> result = hotelRepository.findAll();
        return result;
    }

    @Override
    public Hotel getHotel(String id) {
        if (id == null){
            throw new ResourceException("Resource not found");
        }
        id = id.trim();
        if(id.isEmpty()){
            throw new ResourceException("Hotel id cannot be emplty or blank");
        }
        Hotel result = hotelRepository.findById(id).orElseThrow(()->new ResourceException(("Hotel Not Found")));
        return result;
    }

    @Override
    public void deleteHotel(String id) {
        hotelRepository.deleteById(id);

        }


}
