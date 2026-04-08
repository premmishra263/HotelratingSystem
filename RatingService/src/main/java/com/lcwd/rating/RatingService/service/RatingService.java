package com.lcwd.rating.RatingService.service;

import com.lcwd.rating.RatingService.entity.Rating;

import java.util.List;

public interface RatingService {
    Rating create(Rating rating);

    List<Rating> getAll();

    List<Rating> getRatingByUserId(String userId);

    List<Rating> getRatingByHotelId(String hotelId);
}
