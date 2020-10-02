package controler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.CadastroFuncionario;
import model.ConnectionFactory;

public class CadastroFuncionarioDao {
	private Connection con;
	
	public CadastroFuncionarioDao() {
		this.con = new ConnectionFactory().getDbCon();
	}
	public void cadastraFuncionario(CadastroFuncionario cadastro) {
		String sql = " insert into cadastrofuncionario(nome,sobrenome,rua,bairro,cidade,estado,email,telpessoal,telcomercial,cep) values(?,?,?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, cadastro.getNome());
			stmt.setString(2, cadastro.getSobrenome());
			stmt.setString(3, cadastro.getRua());
			stmt.setString(4, cadastro.getBairro());
			stmt.setString(5, cadastro.getCidade());
			stmt.setString(6, cadastro.getEstado());
			stmt.setString(7, cadastro.getEmail());
			stmt.setInt(8, cadastro.getTelpessoal());
			stmt.setInt(9, cadastro.getTelcomercial());
			stmt.setInt(10, cadastro.getCep());
			
			stmt.execute();
			stmt.close();
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	public List<CadastroFuncionario> getListaDeFuncionario(){
		try {
			List<CadastroFuncionario> cadastrosdefuncionario = new ArrayList<CadastroFuncionario>();
			PreparedStatement stmt = this.con.prepareStatement("select * from cadastrofuncionario");
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				CadastroFuncionario cadastro = new CadastroFuncionario(rs.getInt("telcomercial"),
																		rs.getInt("cep"),
																		rs.getString("nome"),
																		rs.getString("sobrenome"),
																		rs.getString("rua"),
																		rs.getString("bairro"),
																		rs.getString("cidade"),
																		rs.getString("estado"),
																		rs.getString("email"));
				cadastrosdefuncionario.add(cadastro);
			}
			rs.close();
			stmt.close();
			return cadastrosdefuncionario;
		}catch (SQLException e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
	}
	
	}

