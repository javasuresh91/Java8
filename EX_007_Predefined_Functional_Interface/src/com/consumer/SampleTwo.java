package com.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

import com.pojo.Employee;

public class SampleTwo {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<>();

		empList.add(new Employee("XX", 1234));
		empList.add(new Employee("suyt", 98));
		empList.add(new Employee("XXYY", 2478));
		empList.add(new Employee("ioo", 345));

		Consumer<Employee> c = e -> {
			e.setEname(e.getEname() + " Consumer");
		};

		for (Employee e : empList) {
			c.accept(e);
			System.out.println(e.toString());
		}

	}

}
