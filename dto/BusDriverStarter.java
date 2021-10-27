package com.xworkz.dp.dto;

import com.xworkz.dp.dto.CraneDTO.BusDriver;

public class BusDriverStarter {

	public static void main(String[] args) {
		CraneDTO crane = new CraneDTO();
		BusDriver driver = crane.new BusDriver();
		driver.setAge(22);
		driver.setJobTimings(8.30f);
		driver.setJobType("govt");
		driver.setLocation("banglore");
		driver.setName("anu");
		driver.setSalary(25000.0f);

		BusDriver driver1 = crane.new BusDriver("pooja", 21, 10.30f, "govt", 30000.0f, "shimoga");
		BusDriver driver2 = crane.new BusDriver("pooja", 33, 9.30f, "govt", 30000.0f, "shimoga");

		// grouping

		BusDriver[] drive = new BusDriver[5];
		drive[0] = driver;
		drive[1] = driver1;
		drive[4] = driver2;
		for (int i = 0; i < drive.length; i++) {
			BusDriver ref = drive[i];
			if (ref != null) {
				System.out.println(ref.getAge());
				System.out.println(ref.getJobTimings());
				System.out.println(ref.getJobType());
				System.out.println(ref.getLocation());
				System.out.println(ref.getName());
				System.out.println(ref.getSalary());
			} else {
				System.err.println("index is pointing to null:".concat(String.valueOf(i)));
			}
		}

	}

}
