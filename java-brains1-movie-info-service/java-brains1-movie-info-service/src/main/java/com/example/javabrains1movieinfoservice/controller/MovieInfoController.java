package com.example.javabrains1movieinfoservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.javabrains1movieinfoservice.model.Movie;

@RestController
@RequestMapping("/movies")
public class MovieInfoController {
	
		@RequestMapping("/{movieId}")
		public Movie getCatalog(@PathVariable("movieId") String movieId){

			return new Movie(movieId, "Test Name", "movie Desc");
		}
	
}
