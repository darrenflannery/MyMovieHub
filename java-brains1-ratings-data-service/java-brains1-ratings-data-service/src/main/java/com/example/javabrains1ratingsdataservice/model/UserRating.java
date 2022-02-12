package com.example.javabrains1ratingsdataservice.model;

import java.util.List;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRating {

	@Id
    private String userId;
    private List<Rating> ratings;

}
