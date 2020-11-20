
package handsonwork.DAO;

import handsonwork.model.PessoaModel;
import handsonwork.model.PlanoModel;
import handsonwork.model.TabelaPrecoModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class TabelaPrecoDAO {
    private Connection con; 
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private final ArrayList<TabelaPrecoModel> lista = new ArrayList<>();
    
     //*CONECTANDO CLASSE COM O BANCO DE DADOS  
        public TabelaPrecoDAO(){
        con = new Conexao().getConexao();
    }
        
     //*QUERY PARA INSERIR TABELA DE PRECO        
    public void inserir (TabelaPrecoModel i){
        String sql = "Insert into tabelapreco (nome_tabelapreco,id_plano,id_pessoa,valor_servico) values (?,?,?,?)";
    try{
        stmt = con.prepareStatement(sql);
        stmt.setString(1, i.getNometabelapreco());
        stmt.setInt(2, i.getPlano().getIdplano());
        stmt.setInt(3, i.getPessoa().getIdpessoa());
        stmt.setFloat(4, i.getValor());
        stmt.execute();
        stmt.close();       
        }catch (SQLException erro) {
         throw new RuntimeException("Erro 29: "+erro);
     }
    } 
    
     //*QUERY PARA ALTERAR TABELA DE PRECO     
    public void alterar (TabelaPrecoModel a){
        String sql = "update tabelapreco set nome_tabelapreco = ?, id_plano = ?, id_pessoa = ?, valor_servico = ?  where id_tabelapreco = ? ";
    try{
        stmt = con.prepareStatement(sql);
        stmt.setString(1, a.getNometabelapreco());
        stmt.setInt(2, a.getPlano().getIdplano());
        stmt.setInt(3, a.getPessoa().getIdpessoa());
        stmt.setFloat(4, a.getValor());
        stmt.setInt(5, a.getIdtabelapreco());
        stmt.execute();
        stmt.close();
        }catch (SQLException erro) {
         throw new RuntimeException("Erro 30: "+erro);
        }
    }
    
     //*QUERY PARA EXCLUIR TABELA DE PRECO      
    public void excluir (int valor){
        String sql = "delete from tabelapreco where id_tabelapreco =" + valor;
    try{
        st = con.createStatement();
        st.execute(sql);
        st.close();
        }catch (SQLException erro) {
         throw new RuntimeException("Erro 31: "+erro);
     }
    }
    
     //*QUERY PARA LISTAR TODAS AS TABELAS DE PRECO       
    public ArrayList<TabelaPrecoModel> Listartodos(){
        String sql = "select id_tabelapreco, nome_tabelapreco,id_plano,id_pessoa,valor_servico from tabelapreco";
       try{
        st = con.createStatement();
        rs = st.executeQuery(sql);
        while(rs.next()){
            TabelaPrecoModel c = new TabelaPrecoModel();
            c.setIdtabelapreco(rs.getInt("id_tabelapreco"));
            c.setNometabelapreco(rs.getString("nome_tabelapreco"));
            c.setPlano((PlanoModel) rs.getObject("id_plano"));
            c.setPessoa((PessoaModel) rs.getObject("id_pessoa"));
            c.setValor(rs.getFloat("valor_servico"));
            lista.add(c);         
        }
        st.execute(sql);
        st.close();
        }catch (SQLException erro) {
         throw new RuntimeException("Erro 32: "+erro); 
    }
    return lista;
    }     
}
