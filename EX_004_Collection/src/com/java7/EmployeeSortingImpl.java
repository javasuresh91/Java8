package com.java7;

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
		Collections.sort(l, new myEmployeeComparator());
		System.out.println("After Sorting by implementing Comparator in Asc Order: " + l);
	}

}

class myEmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmpId() < o2.getEmpId() ? -1 : o1.getEmpId() > o2.getEmpId() ? 1 : 0;
	}

}
