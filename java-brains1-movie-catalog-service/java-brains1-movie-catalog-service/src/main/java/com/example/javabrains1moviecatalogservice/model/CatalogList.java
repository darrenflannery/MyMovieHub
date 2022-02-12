package com.example.javabrains1moviecatalogservice.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CatalogList {
	
	private List<CataglogItem> CatalogItem;

}
