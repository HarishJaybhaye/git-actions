package com.lcwd.rating.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.rating.entity.Rating;
import com.lcwd.rating.repository.RatingRepository;
import com.lcwd.rating.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingRepository ratingRepo;

	@Override
	public Rating create(Rating rating) throws Exception {
		String randomUserId = UUID.randomUUID().toString();
		rating.setRatingId(randomUserId);
		return ratingRepo.save(rating);
	}

	@Override
	public List<Rating> getAll() throws Exception {
		return ratingRepo.findAll();
	}

	@Override
	public List<Rating> getRatingsByUserId(String userId) throws Exception {
		return ratingRepo.findByUserId(userId);
	}

	@Override
	public List<Rating> getRatingsByHotelId(String hotelId) throws Exception {
		return ratingRepo.findByHotelId(hotelId);
	}

}
