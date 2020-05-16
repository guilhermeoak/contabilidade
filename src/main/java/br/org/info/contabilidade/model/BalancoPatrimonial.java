package br.org.info.contabilidade.model;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class BalancoPatrimonial {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private BigDecimal ativo;
	private BigDecimal ativoCirculante;

	private BigDecimal passivo;
	private BigDecimal passivoCirculante;

	private BigDecimal totalAtivo;
	private BigDecimal totalPassivo;

	private BigDecimal patrimonioLiquido;

	@Temporal(TemporalType.TIMESTAMP)
	private Calendar horaCadastro;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getAtivo() {
		return ativo;
	}

	public void setAtivo(BigDecimal ativo) {
		this.ativo = ativo;
	}

	public BigDecimal getAtivoCirculante() {
		return ativoCirculante;
	}

	public void setAtivoCirculante(BigDecimal ativoCirculante) {
		this.ativoCirculante = ativoCirculante;
	}

	public BigDecimal getPassivo() {
		return passivo;
	}

	public void setPassivo(BigDecimal passivo) {
		this.passivo = passivo;
	}

	public BigDecimal getPassivoCirculante() {
		return passivoCirculante;
	}

	public void setPassivoCirculante(BigDecimal passivoCirculante) {
		this.passivoCirculante = passivoCirculante;
	}

	public BigDecimal getTotalAtivo() {
		this.totalAtivo = this.ativo.add(this.ativoCirculante);
		return totalAtivo;
	}

	public void setTotalAtivo(BigDecimal totalAtivo) {
		this.totalAtivo = totalAtivo;
	}

	public BigDecimal getTotalPassivo() {
		return totalPassivo;
	}

	public void setTotalPassivo(BigDecimal totalPassivo) {
		this.totalPassivo = totalPassivo;
	}

	public BigDecimal getPatrimonioLiquido() {

		return patrimonioLiquido;
	}

	public void setPatrimonioLiquido(BigDecimal patrimonioLiquido) {
		this.patrimonioLiquido = patrimonioLiquido;
	}

	public BigDecimal calculaTotalAtivo() {
		this.totalAtivo = this.ativo.add(this.ativoCirculante);
		return this.totalAtivo;

	}

	public BigDecimal calculaTotalPassivo() {
		this.totalPassivo = this.passivo.add(this.passivoCirculante);
		return this.totalAtivo;

	}

	public BigDecimal calculaPatrimonioLiquido() {
		this.patrimonioLiquido = this.totalAtivo.subtract(this.totalPassivo);
		return this.patrimonioLiquido;
	}

	public Calendar getHoraCadastro() {
		return horaCadastro;
	}

	public void setHoraCadastro(Calendar horaCadastro) {
		this.horaCadastro = horaCadastro;
	}

}
