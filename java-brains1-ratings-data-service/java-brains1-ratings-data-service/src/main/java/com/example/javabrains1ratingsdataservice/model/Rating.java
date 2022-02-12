package com.example.javabrains1ratingsdataservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rating {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	private int id;
	@Column(name="USER_ID", nullable = false)
	private String userId;
	@Column(name="MOVIE_ID", nullable = false)
    private int movieId;
	@Column(name="RATING", nullable = false)
    private int rating;
    
}
