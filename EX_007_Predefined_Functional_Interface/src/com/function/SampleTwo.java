package com.function;

import java.util.ArrayList;
import java.util.function.Function;

import com.pojo.Employee;

public class SampleTwo {

	public static void main(String[] args) {

		Function<Employee, Employee> f = i -> {
			if (i.getSalary() > 1000)
				return i;
			else
				return null;
		};

		ArrayList<Employee> empList = new ArrayList<>();

		empList.add(new Employee("XX", 1234));
		empList.add(new Employee("suyt", 98));
		empList.add(new Employee("XXYY", 2478));
		empList.add(new Employee("ioo", 345));

		System.out.println("Employee Salary Range should be greater than 1000 : ");
		for (Employee e : empList) {
			System.out.println(f.apply(e));
		}
	}

}
