package br.org.info.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("contabilidade");
	EntityManager em = emf.createEntityManager();

	public EntityManager getEntityManager() {
		return em;
	}

}
