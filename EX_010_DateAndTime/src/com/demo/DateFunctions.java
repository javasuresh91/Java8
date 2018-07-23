package com.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.util.function.Consumer;
import java.util.function.Function;

public class DateFunctions {

	public static void main(String[] args) {

		/**
		 * Current System Date and Time implementation
		 */
		LocalDate date = LocalDate.now();
		Consumer<LocalDate> c = d -> System.out.println("Local Date : " + d);
		c.accept(date);

		LocalTime time = LocalTime.now();
		Consumer<LocalTime> t = d -> System.out.println("Local Time : " + d);
		t.accept(time);

		LocalDate data = LocalDate.now();
		System.out.println("Date of the Day : " + data.getDayOfMonth());
		System.out.println("Month of the Day : " + data.getMonthValue());
		System.out.println("Year of the Daya : " + data.getYear());
		System.out.printf("%d-%d-%d", data.getDayOfMonth(), data.getMonthValue(), data.getYear());

		LocalTime time1 = LocalTime.now();
		Function<LocalTime, Integer> hours = t1 -> t1.getHour();
		Function<LocalTime, Integer> minutes = t1 -> t1.getMinute();
		Function<LocalTime, Integer> seconds = t1 -> t1.getSecond();
		Function<LocalTime, Integer> nano = t1 -> t1.getNano();
		System.out.println("");
		System.out.printf("%d:%d:%d:%d", hours.apply(time1), minutes.apply(time1), seconds.apply(time1),
				nano.apply(time1));
		System.out.println("");

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Date and Time : " + dateTime);

		/**
		 * Particular Date and time
		 */
		System.out.println("");
		LocalDateTime ownDate = LocalDateTime.of(1991, Month.MAY, 23, 11, 50);
		System.out.println(ownDate);
		System.out.println("After six Month : " + ownDate.plusMonths(6));
		System.out.println("Before five Days :" + ownDate.minusDays(5));

		/**
		 * Date and Time Difference
		 */
		System.out.println("");
		LocalDate bdayDate = LocalDate.of(1991, 10, 23);
		LocalDate today = LocalDate.now();
		Period p = Period.between(bdayDate, today);
		System.out.printf("Your age is %d year %d months %d Days", p.getYears(), p.getMonths(), p.getDays());
		System.out.println("");

		/**
		 * Year
		 */

		Year y = Year.of(2019);
		if (y.isLeap()) {
			System.out.printf("%d is a Leap Year", y.getValue());
		} else {
			System.out.printf("%d is not a Leap Year", y.getValue());
		}

	}

}
