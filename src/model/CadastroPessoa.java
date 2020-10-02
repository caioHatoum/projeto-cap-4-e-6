package model;

public class CadastroPessoa {
	
	protected int id;
	private int telpessoal,telcomercial,cep;
	private String nome,sobrenome,rua,bairro,cidade,estado,email;
	
	

	public CadastroPessoa(int telpessoal, int cep, String nome, String sobrenome, String rua,
			String bairro, String cidade, String estado, String email) {
		super();
		this.telpessoal = telpessoal;
		this.cep = cep;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.email = email;
	}
	

	public CadastroPessoa() {
		super();
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		
		this.id = id;
	}

	public int getTelpessoal() {
		return telpessoal;
	}

	public void setTelpessoal(int telpessoal) {
		this.telpessoal = telpessoal;
	}

	public int getTelcomercial() {
		return telcomercial;
	}

	public void setTelcomercial(int telcomercial) {
		this.telcomercial = telcomercial;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
