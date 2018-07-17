package com.pojo;

public class Employee {

	private String ename;
	private Integer salary;

	/**
	 * @param ename
	 * @param salary
	 */
	public Employee(String ename, Integer salary) {
		this.ename = ename;
		this.salary = salary;
	}

	/**
	 * @return the ename
	 */
	public String getEname() {
		return ename;
	}

	/**
	 * @param ename
	 *            the ename to set
	 */
	public void setEname(String ename) {
		this.ename = ename;
	}

	/**
	 * @return the salary
	 */
	public Integer getSalary() {
		return salary;
	}

	/**
	 * @param salary
	 *            the salary to set
	 */
	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "[ename=" + ename + ", salary=" + salary + "]";
	}
	
	

}
