package com.js.otob;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InserPersonPan {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("suhel");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person p = new Person();
		p.setName("suhel");
		p.setEmail("suhel@gmail.com");
		p.setPhone(1234567890);
		
		Pan pan = new Pan();
		pan.setPan_no("WRTYU1234PN");
		pan.setAddress("Mysore");
		
		p.setPan(pan);
		pan.setPerson(p);
		
		
		et.begin();
		em.persist(p);
		em.persist(pan);
		et.commit();
		System.out.println("Done");
		
		
		
	}

}
