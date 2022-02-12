package com.example.javabrains1ratingsdataservice.controller;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.javabrains1ratingsdataservice.dao.RatingRepository;
import com.example.javabrains1ratingsdataservice.model.Rating;
import com.example.javabrains1ratingsdataservice.model.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsController {

	@Autowired
	private RatingRepository repo;

	@PostMapping("/user/save")
	public String saveRating(@RequestBody Rating rating) {
		repo.save(rating);
		return "Rating saved";
	}
	
	@RequestMapping("/user/getall")
	public UserRating getAll() {
		return new UserRating("null",repo.findAll());
	}
	
	@RequestMapping("/user/{userId}")
	public UserRating findByUserId(@PathVariable("userId") String userId) {
		return new UserRating(userId,repo.findByUserId(userId));
	}
}

