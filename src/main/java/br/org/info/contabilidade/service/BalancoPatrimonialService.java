package br.org.info.contabilidade.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.ws.rs.WebApplicationException;

import br.org.info.contabilidade.model.BalancoPatrimonial;
import br.org.info.contabilidade.util.Conexao;

public class BalancoPatrimonialService {

	EntityManager conexaoEM = new Conexao().getEntityManager();

	public List<BalancoPatrimonial> listarBalancos() {
		try {
			String query = "select * from BalancoPatrimonial";
			List<BalancoPatrimonial> balancosPatrimoniais = conexaoEM.createNativeQuery(query, BalancoPatrimonial.class)
					.getResultList();
			return balancosPatrimoniais;
		} catch (Exception e) {
			throw new WebApplicationException(500);
		}

	}
}
