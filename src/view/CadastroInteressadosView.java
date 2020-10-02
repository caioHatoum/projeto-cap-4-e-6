package view;

import java.util.Scanner;

import controler.CadastroFuncionarioDao;
import model.CadastroFuncionario;
import model.CadastroInteressados;

public class CadastroInteressadosView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ent = new Scanner(System.in);
		String nome,sobrenome,bairro,cidade,estado,rua,email;
		int telpessoal,cep;
		boolean interessedoacao,interesseacao;
		
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
	
		System.out.println("Tem interesse em doar? 1-SIM 0-NÃO");
		interessedoacao = ent.nextBoolean();
	
		System.out.println("Tem interesse em participar de ações? 1-SIM 0-NÃO");
		interesseacao = ent.nextBoolean();
	
	
		System.out.println("Obrigado pelas informações prestadas "+nome+" e seja bem vindo(a) ao nosso sistema.");
		
		CadastroInteressados cadastro = new CadastroInteressados(telpessoal, cep, nome, sobrenome, rua, bairro, cidade, estado, email);	
		CadastroFuncionarioDao dao = new CadastroFuncionarioDao();
		dao.cadastraFuncionario(cadastro);
		System.out.println("gravado");
		
	}

}
