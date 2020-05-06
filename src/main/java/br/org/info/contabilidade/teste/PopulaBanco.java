package br.org.info.contabilidade.teste;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;

import javax.persistence.EntityManager;

import br.org.info.contabilidade.model.*;
import br.org.info.contabilidade.util.Conexao;

public class PopulaBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManager conexaoEM = new Conexao().getEntityManager();

		EntidadeContabil entidade2 = new EntidadeContabil();
		entidade2.setNomeFantasia("Empresa de Teste 2");
		entidade2.setRazaoSocial("Empresa Teste 2 Lmtd");
		entidade2.setTipoPessoa(TipoPessoa.JURIDICA);
		

		BalancoPatrimonial balanco2 = new BalancoPatrimonial();
		balanco2.setAtivo(new BigDecimal("15.6"));
		balanco2.setAtivoCirculante(new BigDecimal("19.8"));
		balanco2.setPassivo(new BigDecimal("14.5"));
		balanco2.setPassivoCirculante(new BigDecimal("20.8"));
		balanco2.calculaTotalAtivo();
		balanco2.calculaTotalPassivo();
		balanco2.calculaPatrimonioLiquido();
		balanco2.setHoraCadastro(Calendar.getInstance());
		balanco2.setEntidadeContabil(entidade2);
		
		entidade2.setBalancoPatrimonial(Arrays.asList(balanco2));

		conexaoEM.getTransaction().begin();
		conexaoEM.persist(entidade2);
		conexaoEM.persist(balanco2);
		conexaoEM.getTransaction().commit();

	}

}
