package com.example.javabrains1ratingsdataservice.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.javabrains1ratingsdataservice.dao.RatingRepository;
import com.example.javabrains1ratingsdataservice.model.Rating;
import com.example.javabrains1ratingsdataservice.model.UserRating;

public class UserRatingController {
	
//	@Autowired
//	private UserRatingRepository ratingRepository;

//	@RequestMapping("/user/{username}")
//	public UserRating getMovieRating(@PathVariable("username") String username) {
//		List<Rating> ratings = Arrays.asList(
//				new Rating(1234,username, 4),
//				new Rating(1234,username, 5),
//				new Rating(2343,username, 9),
//				new Rating(3434,username, 10)
//				);
//		UserRating userRating = new UserRating(username, ratings);
//		return userRating;
//	}
	
//	@PostMapping("/user/save")
//	public String saveRating(@RequestBody UserRating userRating) {
//		ratingRepository.save(userRating);
//		return "Rating saved";
//	}
//	
//	@RequestMapping("/usernew/{username}")
//	public List<Rating> getAllForUser(@PathVariable("username") String username) {
//		return ratingRepository.findAll().stream()
//			    .filter(r -> r.getUsername().equals(username)).collect(Collectors.toList());
//	}
	


}
