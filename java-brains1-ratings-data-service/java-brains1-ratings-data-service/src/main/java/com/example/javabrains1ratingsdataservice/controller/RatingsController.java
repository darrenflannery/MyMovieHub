package com.example.javabrains1ratingsdataservice.controller;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.javabrains1ratingsdataservice.model.Rating;
import com.example.javabrains1ratingsdataservice.model.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsController {
	
		@RequestMapping("/user/{userId}")
		public UserRating getMovieRating(@PathVariable("userId") String userId) {
			List<Rating> ratings = Arrays.asList(
					new Rating("1234", 4),
					new Rating("1535", 5),
					new Rating("1436", 9),
					new Rating("147", 10)
					);
			UserRating userRating = new UserRating(userId, ratings);
			return userRating;
		}
}

