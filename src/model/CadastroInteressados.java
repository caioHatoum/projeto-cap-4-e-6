package model;

public class CadastroInteressados extends CadastroPessoa {

	public CadastroInteressados(int telpessoal, int cep, String nome, String sobrenome, String rua, String bairro,
			String cidade, String estado, String email, boolean interessedoacao, boolean b) {
		super(telpessoal, cep, nome, sobrenome, rua, bairro, cidade, estado, email);
		// TODO Auto-generated constructor stub
	}

	private boolean interesse_doar,interesse_acoes;

	public boolean isInteresse_doar() {
		return interesse_doar;
	}

	public void setInteresse_doar(boolean interesse_doar) {
		this.interesse_doar = interesse_doar;
	}

	public boolean isInteresse_acoes() {
		return interesse_acoes;
	}

	public void setInteresse_acoes(boolean interesse_acoes) {
		
		this.interesse_acoes = interesse_acoes;
	}
	
	
	
}
