package com.training.moviecatalogservice.model;

public class Movie {
	private String movieId;
	private String name;
	private String description;
	
	public Movie() {
		
	}
	

	public Movie(String movieId, String name) {
		
		this.movieId = movieId;
		this.name = name;
		this.description=description;
	}

	/**
	 * @return the movieId
	 */
	public String getMovieId() {
		return movieId;
	}
	/**
	 * @param movieId the movieId to set
	 */
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	

}
