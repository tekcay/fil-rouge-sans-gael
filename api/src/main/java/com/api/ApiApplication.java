package com.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("fil-rouge");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();

		em.close();
		emf.close();
	}

}
