package com.xworkz.dp.dto;

import com.xworkz.dp.constants.Genre;

public class WebSeriesDTO {
	private String name;
	private String cast;
	private Genre genre;
	private int noOfCharacters;
	private float ratings;
	private int totalSeason;
	private int currentSeason;

	public WebSeriesDTO() {
		System.out.println("invoked no args constructor");
	}

	public WebSeriesDTO(String name, String cast, Genre genre, int noOfCharacters, float ratings, int totalSeason,
			int currentSeason) {
		super();
		this.name = name;
		this.cast = cast;
		this.genre = genre;
		this.noOfCharacters = noOfCharacters;
		this.ratings = ratings;
		this.totalSeason = totalSeason;
		this.currentSeason = currentSeason;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCast() {
		return cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public int getNoOfCharacters() {
		return noOfCharacters;
	}

	public void setNoOfCharacters(int noOfCharacters) {
		this.noOfCharacters = noOfCharacters;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public int getTotalSeason() {
		return totalSeason;
	}

	public void setTotalSeason(int totalSeason) {
		this.totalSeason = totalSeason;
	}

	public int getCurrentSeason() {
		return currentSeason;
	}

	public void setCurrentSeason(int currentSeason) {
		this.currentSeason = currentSeason;
	}

}
