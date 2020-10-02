package model;

public class CadastroFuncionario extends CadastroPessoa {

	public CadastroFuncionario(int telpessoal,int cep,  String nome, String sobrenome, String rua,
			String bairro, String cidade, String estado, String email) {
		super(telpessoal, cep, nome, sobrenome, rua, bairro, cidade, estado, email);
		this.login =Integer.toString(telpessoal)+this.getNome();
		this.senha = this.login;
		// TODO Auto-generated constructor stub
	}
	

	


	public CadastroFuncionario() {
	
		// TODO Auto-generated constructor stub
		
	}





	protected String login,senha;


	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
