package com.example.javabrains1ratingsdataservice.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.javabrains1ratingsdataservice.model.UserRating;

@RequestMapping("/rating")
public class UserRatingController {
	
//	@Autowired
//	private UserRatingRepository ratingRepository;
//
//	@PostMapping("/user/save")
//	public String saveRating(@RequestBody UserRating userRating) {
//		ratingRepository.save(userRating);
//		return "Rating saved";
//	}
//	
//	@RequestMapping("/user/{userId}")
//	public UserRating getAllForUser(@PathVariable("userId") int userId) {
//		return ratingRepository.getById(userId);
//	}

}
