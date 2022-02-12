package com.example.javabrains1moviecatalogservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CataglogItem {
	
	 private String name;
	 private String desc;
	 private int rating;

}
