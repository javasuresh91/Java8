package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.pojo.Employee;

public class EmployeeSortingImpl {

	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<>();
		l.add(new Employee(100, "Suresh"));
		l.add(new Employee(55, "xx"));
		l.add(new Employee(290, "uyt"));
		l.add(new Employee(640, "frt"));
		System.out.println("Insertion/Before Sorting : " + l);

		// Comparator<Employee> e = (o1, o2) -> o1.getEmpId() < o2.getEmpId() ? -1 :
		// o1.getEmpId() > o2.getEmpId() ? 1 : 0;
		Collections.sort(l, (o1, o2) -> o1.getEmpId() < o2.getEmpId() ? -1 : o1.getEmpId() > o2.getEmpId() ? 1 : 0);
		System.out.println("After Sorting by Lambda in Asc Order: " + l);
	}

}
