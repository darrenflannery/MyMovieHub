package com.example.javabrains1moviecatalogservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rating {

	private int id;
	private String userId;
    private int movieId;
    private int rating;
    
}

