package com.demo;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneImplementation {

	public static void main(String[] args) {

		ZoneId id = ZoneId.systemDefault();
		System.out.println("Current System Zone: " + id);

		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime dt = ZonedDateTime.now(la);
		System.out.println("Zonal Information : " + dt);

	}

}
