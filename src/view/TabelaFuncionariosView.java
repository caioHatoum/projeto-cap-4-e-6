package view;

import java.util.List;

import controler.CadastroFuncionarioDao;
import model.CadastroFuncionario;

public class TabelaFuncionariosView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CadastroFuncionarioDao dao = new CadastroFuncionarioDao();
		List<CadastroFuncionario> cadastrosdefuncionario = dao.getListaDeFuncionario();
		
		for(CadastroFuncionario cadastro : cadastrosdefuncionario) {
			System.out.println("Nome..."+cadastro.getNome());
			System.out.println("Sobrenome... "+cadastro.getSobrenome());
			System.out.println("Endereço... "+cadastro.getCep()+" ,"+cadastro.getCidade()+"-"+cadastro.getEstado()+" ,Rua "+cadastro.getRua());
			System.out.println("Telefone... "+cadastro.getTelpessoal());
			System.out.println("ID do funcionario... "+cadastro.getId());
			System.out.println("Email... "+cadastro.getEmail());
			System.out.println("Login..."+cadastro.getLogin());
			System.out.println("Senha..."+cadastro.getSenha());
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			
			System.out.println("=============================================================================================");
		}

	}

}
//tela de exibição do cadastro de funcionarios