package com.js.otob;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class GetByPanId {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("suhel");
		EntityManager em = emf.createEntityManager();
		
		Pan pan = em.find(Pan.class, 2);
		
		if(pan!=null) {
			System.out.println("Pan Id = "+pan.getId());
			System.out.println("Pan No = "+pan.getPan_no());
			System.out.println("Pan Address = "+pan.getAddress());
			
			
			Person p = pan.getPerson();
			System.out.println("====");
			
			if(p !=null) {
				System.out.println("Person Id = "+p.getId());
				System.out.println("Person Name = "+p.getName());
				System.out.println("Person Email = "+p.getEmail());
				System.out.println("Person Phone = "+p.getPhone());
				
			}else {
				
				System.out.println("Person Has No Pan");
			}
		}else {
				System.out.println("No Person With Given Id");
			}
			
	}

}
