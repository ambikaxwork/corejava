package com.xworkz.dp.dto;

public class TimerDTO {
	private boolean working;
	private float correctTime;
	private boolean digital;
	private String brand;
	private boolean bell;

	public TimerDTO() {
		System.out.println("invoked no-args constructor");
	}

	public TimerDTO(boolean working, float correctTime, boolean digital, String brand, boolean bell) {
		super();
		this.working = working;
		this.correctTime = correctTime;
		this.digital = digital;
		this.brand = brand;
		this.bell = bell;
	}

	public boolean isWorking() {
		return working;
	}

	public void setWorking(boolean working) {
		this.working = working;
	}

	public float getCorrectTime() {
		return correctTime;
	}

	public void setCorrectTime(float correctTime) {
		this.correctTime = correctTime;
	}

	public boolean isDigital() {
		return digital;
	}

	public void setDigital(boolean digital) {
		this.digital = digital;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public boolean isBell() {
		return bell;
	}

	public void setBell(boolean bell) {
		this.bell = bell;
	}

}
