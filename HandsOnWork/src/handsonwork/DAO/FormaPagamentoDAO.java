package handsonwork.DAO;

import handsonwork.model.FormaPagamentoModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class FormaPagamentoDAO{
    
    private Connection con; 
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private final ArrayList<FormaPagamentoModel> lista = new ArrayList<>();
    
     //*CONECTANDO CLASSE COM O BANCO DE DADOS  
        public FormaPagamentoDAO(){
        con = new Conexao().getConexao();
    }
 
     //*QUERY PARA INSERIR FORMA DE PAGAMENTO         
    public void inserir (FormaPagamentoModel i){
        String sql = "Insert into formapagamento (nome_formapagamento) values (?)";
    try{
        stmt = con.prepareStatement(sql);
        stmt.setString(1, i.getNomeformapagamento());
        stmt.execute();
        stmt.close();
                
        }catch (SQLException erro) {
         throw new RuntimeException("Erro 10: "+erro);
     }
    }
    
    
     //*QUERY PARA ALTERAR FORMA DE PAGAMENTO     
    public void alterar (FormaPagamentoModel a){
        String sql = "update formapagamento set nome_formapagamento = ? where id_formapagamento = ? ";
    try{
        stmt = con.prepareStatement(sql);
        stmt.setString(1, a.getNomeformapagamento());
        stmt.setInt(2, a.getIdformapagamento());
        stmt.execute();
        stmt.close();
        }catch (SQLException erro) {
         throw new RuntimeException("Erro 11: "+erro);
        }
    }
    
     //*QUERY PARA EXCLUIR FORMA DE PAGAMENTO      
    public void excluir (int valor){
        String sql = "delete from formapagamento where id_formapagamento =" + valor;
    try{
        st = con.createStatement();
        st.execute(sql);
        st.close();
        }catch (SQLException erro) {
         throw new RuntimeException("Erro 12: "+erro);
     }
    }
    
     //*QUERY PARA LISTAR TODAS AS FORMA DE PAGAMENTO      
    public ArrayList<FormaPagamentoModel> Listartodos(){
        String sql = "select id_formapagamento, nome_formapagamento from formapagamento";
       try{
        st = con.createStatement();
        rs = st.executeQuery(sql);
        while(rs.next()){
            FormaPagamentoModel c = new FormaPagamentoModel();
            c.setIdformapagamento(rs.getInt("id_formapagamento"));
            c.setNomeformapagamento(rs.getString("nome_formapagamento"));
            lista.add(c);         
        }
        st.execute(sql);
        st.close();
        }catch (SQLException erro) {
         throw new RuntimeException("Erro 13: "+erro); 
    }
    return lista;
    }     
}
