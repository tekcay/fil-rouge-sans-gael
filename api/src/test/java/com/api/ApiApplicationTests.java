package com.api;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@SpringBootTest
public class ApiApplicationTests {



	@Test
	public void contextLoads() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("fil-rouge");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();

	}

}
