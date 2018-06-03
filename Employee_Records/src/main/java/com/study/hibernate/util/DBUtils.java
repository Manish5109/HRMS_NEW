package com.study.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

@Component
public class DBUtils {

	private static SessionFactory factory;

	public static SessionFactory getConnection() {
		if (factory == null) {
			Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
			factory = cfg.buildSessionFactory();
		}
		return factory;
	}

	
}
