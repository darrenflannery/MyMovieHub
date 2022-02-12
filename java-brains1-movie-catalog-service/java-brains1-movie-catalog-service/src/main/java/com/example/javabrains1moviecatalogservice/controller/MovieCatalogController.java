package com.example.javabrains1moviecatalogservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.javabrains1moviecatalogservice.model.CataglogItem;
import com.example.javabrains1moviecatalogservice.model.CatalogList;
import com.example.javabrains1moviecatalogservice.model.Movie;
import com.example.javabrains1moviecatalogservice.model.UserRating;

@RestController
public class MovieCatalogController {
	
	@Autowired
	RestTemplate restTemplate;

	@RequestMapping("/{userId}")
	public CatalogList getCatalog(@PathVariable("userId") String userId){
		
		//get all rated movies ID's - This is the list we work from
		//We only show movies that are retrieved from this API
		UserRating userRating = restTemplate.getForObject("http://ratings-data-service/ratingsdata/user/" + userId, UserRating.class);
		
		
		List<CataglogItem> movies = new ArrayList<>();
		userRating.getRatings().stream()
		.forEach(rating -> 
		{
			//for each movie ID call movie info service and get details
			Movie movieInfo = restTemplate.getForObject("http://movie-info-service/movies/" + rating.getMovieId(), Movie.class);
			
			//Assign the movie details to the movie catalog object
			movies.add(new CataglogItem(movieInfo.getName(), movieInfo.getDesc(), rating.getRating()));
		});
		
		CatalogList catalogList = new CatalogList(movies);
		
		return catalogList;
	}
}
