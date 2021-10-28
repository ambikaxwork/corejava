package com.xworkz.dp.dao;

import com.xworkz.dp.dto.IplDTo;
import com.xworkz.dp.dto.MovieDTO;

public class MovieDAO {
	private MovieDTO[] movieDTOs = new MovieDTO[191];
	private int count = 0;

	public void save(MovieDTO dto) {
		System.out.println("invoked MovieDTO from save method");
		if (dto != null && count < movieDTOs.length) {
			this.movieDTOs[count++] = dto;
			System.out.println("movie is:".concat(dto.getName()));
		} else {
			System.err.println("either container is full or you are passing value is null");
		}
	}

	public void save(MovieDTO dto, int index) {
		System.out.println("invoked save :".concat(dto.getName()));
		if (index >= 0 && index < movieDTOs.length && dto != null) {
			this.movieDTOs[index] = dto;
			System.out.println("index at MovieDTO:".concat(String.valueOf(index)));
		} else {
			System.err.println("index is invalid");
		}
	}

	public int indexOccupied() {
		System.out.println("indexOccupied:".concat(String.valueOf(count)));
		return count;

	}

	public boolean matchByName(String Name) {
		System.out.println("invoked matchByName:");
		System.out.println("team name passed: ".concat(Name));
		for (int i = 0; i < movieDTOs.length; i++) {
			MovieDTO ref = this.movieDTOs[i];
			if (ref != null) {
				System.out.println("ref index is not null:".concat(String.valueOf(i)));
				String tempName = ref.getName();
				System.out.println("matching:".concat(tempName));
				if (Name.equals(tempName)) {
					System.out.println("movie  found");
					return true;
				}
				System.out.println("movie not found");
			}
		}
		return false;

	}

}
