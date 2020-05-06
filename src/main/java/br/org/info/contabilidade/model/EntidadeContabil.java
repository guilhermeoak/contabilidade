package br.org.info.contabilidade.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class EntidadeContabil {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nomeFantasia;
	private String razaoSocial;

	@Enumerated(EnumType.STRING)
	private TipoPessoa tipoPessoa;

	@OneToMany
	private List<BalancoPatrimonial> balancoPatrimonial;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public List<BalancoPatrimonial> getBalancoPatrimonial() {
		return balancoPatrimonial;
	}

	public void setBalancoPatrimonial(List<BalancoPatrimonial> balancoPatrimonial) {
		this.balancoPatrimonial = balancoPatrimonial;
	}

}
