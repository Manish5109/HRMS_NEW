package com.study.service.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();

		persons.add(new Person("awanish", 12, 100));
		persons.add(new Person("manish", 11, 300));
		persons.add(new Person("mantu", 15, 100));
		persons.add(new Person("dhi", 2, 122));

		Collections.sort(persons, new PersonSalaryCompartor());

		System.out.println(persons);
	}

}
