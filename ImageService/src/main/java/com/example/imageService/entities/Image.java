package com.example.imageService.entities;

public class Image {

	private int id;
	private String title;
	private String url;

	public Image(int i, String title, String url) {
		this.id = i;
		this.title = title;
		this.url = url;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return title;
	}

	public void setName(String name) {
		this.title = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	

}
