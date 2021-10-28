package com.xworkz.dp.dto;

public class CraneDTO {
	private String name;
	private String color;
	private float weight;
	private float height;
	private float size;
	private String neckType;
	private String ScientificName;
	// public ParkDTO park;

	public CraneDTO() {
		System.out.println("invoked no args constructor");
	}

	public CraneDTO(String name, String color, float weight, float height, float size, String neckType,
			String scientificName) {
		super();
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.height = height;
		this.size = size;
		this.neckType = neckType;
		ScientificName = scientificName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public String getNeckType() {
		return neckType;
	}

	public void setNeckType(String neckType) {
		this.neckType = neckType;
	}

	public String getScientificName() {
		return ScientificName;
	}

	public void setScientificName(String scientificName) {
		ScientificName = scientificName;
	}

	public class ParkDTO {
		private String parkName;
		private String parkLocation;
		private float parkInAcres;
		private int noOfTreesInPark;
		private boolean runningAllowance;
		private float openTime;
		private float closingTime;

		public ParkDTO() {
			System.out.println("invoked no-args constructor");
		}

		public ParkDTO(String parkName, String parkLocation, float parkInAcres, int noOfTreesInPark,
				boolean runningAllowance, float openTime, float closingTime) {
			super();
			this.parkName = parkName;
			this.parkLocation = parkLocation;
			this.parkInAcres = parkInAcres;
			this.noOfTreesInPark = noOfTreesInPark;
			this.runningAllowance = runningAllowance;
			this.openTime = openTime;
			this.closingTime = closingTime;
		}

		public String getParkName() {
			return parkName;
		}

		public void setParkName(String parkName) {
			this.parkName = parkName;
		}

		public String getParkLocation() {
			return parkLocation;
		}

		public void setParkLocation(String parkLocation) {
			this.parkLocation = parkLocation;
		}

		public float getParkInAcres() {
			return parkInAcres;
		}

		public void setParkInAcres(float parkInAcres) {
			this.parkInAcres = parkInAcres;
		}

		public int getNoOfTreesInPark() {
			return noOfTreesInPark;
		}

		public void setNoOfTreesInPark(int noOfTreesInPark) {
			this.noOfTreesInPark = noOfTreesInPark;
		}

		public boolean isRunningAllowance() {
			return runningAllowance;
		}

		public void setRunningAllowance(boolean runningAllowance) {
			this.runningAllowance = runningAllowance;
		}

		public float getOpenTime() {
			return openTime;
		}

		public void setOpenTime(float openTime) {
			this.openTime = openTime;
		}

		public float getClosingTime() {
			return closingTime;
		}

		public void setClosingTime(float closingTime) {
			this.closingTime = closingTime;
		}

	}

	public class BusDriver {
		private String name;
		private int age;
		private float salary;
		private String jobType;
		private float jobTimings;
		private String location;

		public BusDriver() {
			System.out.println("invoked no args constructor");
		}

		public BusDriver(String name, int age, float salary, String jobType, float jobTimings, String location) {
			super();
			this.name = name;
			this.age = age;
			this.salary = salary;
			this.jobType = jobType;
			this.jobTimings = jobTimings;
			this.location = location;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public float getSalary() {
			return salary;
		}

		public void setSalary(float salary) {
			this.salary = salary;
		}

		public String getJobType() {
			return jobType;
		}

		public void setJobType(String jobType) {
			this.jobType = jobType;
		}

		public float getJobTimings() {
			return jobTimings;
		}

		public void setJobTimings(float jobTimings) {
			this.jobTimings = jobTimings;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

	}

}
