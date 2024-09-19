package com.lcwd.rating.service;

import java.util.List;

import com.lcwd.rating.entity.Rating;

public interface RatingService {
	Rating create(Rating rating) throws Exception;

	List<Rating> getAll() throws Exception;

	List<Rating> getRatingsByUserId(String userId) throws Exception;

	List<Rating> getRatingsByHotelId(String hotelId) throws Exception;
}
