package br.org.info.contabilidade.teste;

import javax.persistence.EntityManager;

import br.org.info.contabilidade.model.EntidadeContabil;
import br.org.info.contabilidade.model.TipoPessoa;
import br.org.info.contabilidade.util.Conexao;

public class TesteEntidade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager conexao = new Conexao().getEntityManager();
		
		EntidadeContabil etd1 = new EntidadeContabil();
		etd1.setNomeFantasia("Papelaria do Sertão");
		etd1.setRazaoSocial("PdS Ltda.");
		etd1.setTipoPessoa(TipoPessoa.JURIDICA);
		

	}

}
