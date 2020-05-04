package br.org.info.service;

import java.util.List;

import javax.persistence.EntityManager;

import br.org.info.model.EntidadeContabil;
import br.org.info.util.Conexao;
import jakarta.ws.rs.WebApplicationException;

public class EntidadeContabilService {

	EntityManager conexaoEM = new Conexao().getEntityManager();

	public List<EntidadeContabil> listarEmpresas() {
		try {
			String query = "from EntidadeContabil";
			List<EntidadeContabil> entidadesContabil = conexaoEM.createNativeQuery(query, EntidadeContabil.class)
					.getResultList();
			return entidadesContabil;
		} catch (Exception e) {
			throw new WebApplicationException(500);
		}
	}

}
