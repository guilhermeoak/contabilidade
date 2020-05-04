package br.org.info.teste;

import javax.persistence.EntityManager;

import br.org.info.model.EntidadeContabil;
import br.org.info.model.TipoPessoa;
import br.org.info.util.Conexao;

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
