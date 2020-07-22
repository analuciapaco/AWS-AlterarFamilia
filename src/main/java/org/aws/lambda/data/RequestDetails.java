package org.aws.lambda.data;

public class RequestDetails {
	private Long id;

	private long lider_de_rua_id;

	private String nome_do_representante_de_familia;

	private String logradouro;

	private Integer numero;

	private String complemento;

	private String ponto_de_referencia;

	private String telefone;

	private String data_nascimento;

	private String rg;

	private String cpf;

	private Integer numero_criancas;

	private Integer numero_adultos;

	private Integer numero_idosos;

	private Integer numero_habitantes_total;

	private String observacoes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getLider_de_rua_id() {
		return lider_de_rua_id;
	}

	public void setLider_de_rua_id(long lider_de_rua_id) {
		this.lider_de_rua_id = lider_de_rua_id;
	}

	public String getNome_do_representante_de_familia() {
		return nome_do_representante_de_familia;
	}

	public void setNome_do_representante_de_familia(String nome_do_representante_de_familia) {
		this.nome_do_representante_de_familia = nome_do_representante_de_familia;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getPonto_de_referencia() {
		return ponto_de_referencia;
	}

	public void setPonto_de_referencia(String ponto_de_referencia) {
		this.ponto_de_referencia = ponto_de_referencia;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getNumero_criancas() {
		return numero_criancas;
	}

	public void setNumero_criancas(Integer numero_criancas) {
		this.numero_criancas = numero_criancas;
	}

	public Integer getNumero_adultos() {
		return numero_adultos;
	}

	public void setNumero_adultos(Integer numero_adultos) {
		this.numero_adultos = numero_adultos;
	}

	public Integer getNumero_idosos() {
		return numero_idosos;
	}

	public void setNumero_idosos(Integer numero_idosos) {
		this.numero_idosos = numero_idosos;
	}

	public Integer getNumero_habitantes_total() {
		return numero_habitantes_total;
	}

	public void setNumero_habitantes_total(Integer numero_habitantes_total) {
		this.numero_habitantes_total = numero_habitantes_total;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

}
