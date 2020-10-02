package view;

import java.util.Scanner;

import controler.CadastroFuncionarioDao;
import model.CadastroFuncionario;

public class CadastroFuncionarioView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		String nome,sobrenome,bairro,cidade,estado,rua,email;
		int telpessoal,cep;
		
		
			System.out.printf("Cadastro de novo funcionário.");
			
			
			System.out.println("Qual seu primeiro nome?");
				nome=ent.nextLine();
				
				
			System.out.println("Qual é seu sobrenome?");
				sobrenome = ent.nextLine();
				
			System.out.println("Qual é seu telefone pessoal?");
				telpessoal = ent.nextInt();
				
				
			System.out.println("Digite o cep");
				cep = ent.nextInt();
				
			System.out.println("Digite seu bairro");
			bairro = ent.nextLine();
			ent.nextLine();

				
			System.out.println("Digite sua cidade");
			cidade = ent.nextLine();

			System.out.println("Digite a sigla do seu estado");
			estado = ent.nextLine();

			System.out.println("Digite sua rua");
			rua = ent.nextLine();
				
			System.out.println("Digite seu e-mail");
			email = ent.nextLine();
			System.out.println("Obrigado pelas informações prestadas "+nome+" e seja bem vindo(a) ao nosso sistema.");
				
				
		CadastroFuncionario cadastro = new CadastroFuncionario(telpessoal, cep, nome, sobrenome, rua, bairro, cidade, estado, email);	
		CadastroFuncionarioDao dao = new CadastroFuncionarioDao();
		dao.cadastraFuncionario(cadastro);
		System.out.println("gravado");
	}

};
