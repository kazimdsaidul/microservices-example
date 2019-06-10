package com.example.GalleryService.entities;

import java.util.List;

public class Gallery {

	public int getId() {
		return id;
	}

	public List<Object> getImages() {
		return images;
	}

	private int id;
	private List<Object> images;

	public void setId(int id) {
		this.id = id;
		
		
	}

	public void setImages(List<Object> images) {
		this.images = images;
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
