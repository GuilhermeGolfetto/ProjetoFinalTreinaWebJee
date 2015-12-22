package br.com.treinaweb.jee.dao.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtils {

	public static EntityManager criarEntityManager(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ProjetoFinal");
		EntityManager em = factory.createEntityManager();
		return em;
	}
}
