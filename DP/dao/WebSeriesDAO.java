package com.xworkz.dp.dao;

import com.xworkz.dp.dto.WebSeriesDTO;

public class WebSeriesDAO {
	private int count = 0;
	WebSeriesDTO[] webSeriesDTOs = new WebSeriesDTO[5];

	public WebSeriesDAO() {
		System.out.println("invoked webseries from DAO");
	}

	public void add(WebSeriesDTO name) {
		System.out.println("webseries name:");
		if (this.count < this.webSeriesDTOs.length && name != null) {
			this.webSeriesDTOs[count++] = name;
			System.out.println("webseries name:".concat("got"));
		} else {
			System.err.println("either container is full or passed reference is null");
		}
	}

	public void delete(int munch) {
		if (munch >= 0 && munch < this.webSeriesDTOs.length) {
			System.out.println("invoked delete method");
			this.webSeriesDTOs[munch] = null;
			System.out.println("deleted index:".concat(String.valueOf(munch)));
		} else {
			System.err.println("index is invalid");
		}

	}

	public WebSeriesDTO[] getWebSeriesDTOs() {
		return webSeriesDTOs;
	}

	public void display() {
		System.out.println("names:");
		for (int coke = 0; coke < webSeriesDTOs.length; coke++) {
			WebSeriesDTO reference = webSeriesDTOs[coke];
			if (reference != null) {
				// System.out.println(reference);
				System.out.println(reference.getName());
				System.out.println(reference.getGenre());
				System.out.println(reference.getCast());
				System.out.println(reference.getRatings());
				System.out.println(reference.getNoOfCharacters());
				System.out.println(reference.getCurrentSeason());
			} else {
				System.err.println("reference is null at index ".concat(String.valueOf(coke)));
			}
		}
	}

	public void update(int crunch, WebSeriesDTO newname) {
		if (crunch >= 0 && crunch < this.webSeriesDTOs.length) {
			System.out.println("invoked newName");
			if (newname != null) {
				this.webSeriesDTOs[crunch] = newname;
				System.out.println("updated value:".concat(String.valueOf(crunch)));
			} else {
				System.err.println("can not update:");
			}
		}

	}
}
