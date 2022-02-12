package com.example.javabrains1ratingsdataservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.javabrains1ratingsdataservice.model.Rating;

public interface RatingRepository extends JpaRepository<Rating, Integer> {

}
