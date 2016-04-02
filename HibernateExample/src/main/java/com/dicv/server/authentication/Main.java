package com.dicv.server.authentication;

import javax.persistence.EntityManager;

import com.dicv.server.authentication.model.Address;
import com.dicv.server.authentication.util.PersistenceManager;

public class Main {
	  public static void main(String[] args) {
	    Address address = new Address();
	    address.setCity("Dhaka")
	        .setCountry("Bangladesh")
	        .setPostcode("1000")
	        .setStreet("Poribagh");
	    EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
	    em.getTransaction()
	        .begin();
	    em.persist(address);
	    em.getTransaction()
	        .commit();
	    em.close();
	    PersistenceManager.INSTANCE.close();
	  }
	}
