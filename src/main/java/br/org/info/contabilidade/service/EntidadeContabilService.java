package br.org.info.contabilidade.service;

import java.util.List;

import javax.persistence.EntityManager;

import br.org.info.contabilidade.model.EntidadeContabil;
import br.org.info.contabilidade.util.Conexao;

import javax.ws.rs.WebApplicationException;

public class EntidadeContabilService {

	EntityManager conexaoEM = new Conexao().getEntityManager();

	public List<EntidadeContabil> listarEmpresas() {
		try {
			String query = "select * from EntidadeContabil";
			List<EntidadeContabil> entidadesContabil = conexaoEM.createNativeQuery(query, EntidadeContabil.class)
					.getResultList();
			return entidadesContabil;
		} catch (Exception e) {
			throw new WebApplicationException(500);
		}
	}

}
