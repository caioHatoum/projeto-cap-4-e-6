package controler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.CadastroInteressados;
import model.ConnectionFactory;

public class CadastroInteressadosDao {
private Connection con;
	
	public CadastroInteressadosDao() {
		this.con = new ConnectionFactory().getDbCon();
	}
	public void cadastraInteressados(CadastroInteressados cadastro) {
		String sql = " insert into cadastrointeressado(nome,sobrenome,rua,bairro,cidade,estado,email,telpessoal,telcomercial,cep,interessedoacoes,interesseacoes) values(?,?,?,?,?,?,?,?,?,?,?,?)";
		
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
			stmt.setBoolean(11, cadastro.isInteresse_doar());
			stmt.setBoolean(12, cadastro.isInteresse_acoes());			
			stmt.execute();
			stmt.close();
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	public List<CadastroInteressados> getListaDeInteressados(){
		try {
			List<CadastroInteressados> cadastrointeressados = new ArrayList<CadastroInteressados>();
			PreparedStatement stmt = this.con.prepareStatement("select * from cadastrointeressados");
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				CadastroInteressados cadastro = new CadastroInteressados(rs.getInt("telcomercial"),
																		rs.getInt("cep"),
																		rs.getString("nome"),
																		rs.getString("sobrenome"),
																		rs.getString("rua"),
																		rs.getString("bairro"),
																		rs.getString("cidade"),
																		rs.getString("estado"),
																		rs.getString("email"),
																		rs.getBoolean("interessedoacoes"),
																		rs.getBoolean("interesseacoes"));
				cadastrointeressados.add(cadastro);
			}
			rs.close();
			stmt.close();
			return cadastrointeressados;
		}catch (SQLException e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
	}
}
