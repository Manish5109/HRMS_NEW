package com.study.service.interview;

import java.util.Comparator;

public class PersonSalaryCompartor implements Comparator<Person> {

	public int compare(Person p1, Person p2) {

		if (p1.getSalary() == p2.getSalary()) {
			return p1.getAge() > p2.getAge() ? 1 : -1;
		}

		return p1.getSalary() > p2.getSalary() ? 1 : -1;
	}

}
