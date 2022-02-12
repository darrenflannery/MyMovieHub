package com.example.javabrains1moviecatalogservice.model;

import java.util.List;

public class CatalogList {
	
	private List<CataglogItem> CatalogItem;
	
	public CatalogList() {
	}

	public CatalogList(List<CataglogItem> catalogItem) {
		super();
		CatalogItem = catalogItem;
	}

	public List<CataglogItem> getCatalogItem() {
		return CatalogItem;
	}

	public void setCatalogItem(List<CataglogItem> catalogItem) {
		CatalogItem = catalogItem;
	}
}
