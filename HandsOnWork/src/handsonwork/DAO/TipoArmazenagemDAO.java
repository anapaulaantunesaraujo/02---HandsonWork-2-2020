
package handsonwork.DAO;
import handsonwork.model.TipoArmazenagemModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class TipoArmazenagemDAO extends Conexao{ 
    private Connection con; 
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private final ArrayList<TipoArmazenagemModel> lista = new ArrayList<>();
       
     //*CONECTANDO CLASSE COM O BANCO DE DADOS    
    public TipoArmazenagemDAO(){
        con = new Conexao().getConexao();
    }
   
         //*QUERY PARA INSERIR TIPO DE ARMAZENAGEM    
        public void inserir (TipoArmazenagemModel i){
        String sql = "Insert into tipoarmazenagem (nome_tipoarmazenagem) values (?)";
    try{
        stmt = con.prepareStatement(sql);
        stmt.setString(1, i.getNometipoarmazenagem());
        stmt.execute();
        stmt.close();               
        }catch (SQLException erro) {
         throw new RuntimeException("Erro 18: "+erro);
     } 
    }
        
         //*QUERY PARA ALTERAR TIPO DE ARMAZENAGEM      
        public void alterar (TipoArmazenagemModel a){
        String sql = "update tipoarmazenagem set nome_tipoarmazenagem = ? where id_tipoarmazenagem = ?";
    try{
        stmt = con.prepareStatement(sql);
        stmt.setString(1, a.getNometipoarmazenagem());
        stmt.setInt(2,a.getIdtipoarmazenagem());
        stmt.execute();
        stmt.close();
        }catch (SQLException erro) {
         throw new RuntimeException("Erro 19: "+erro);
     } 
    }
        
         //*QUERY PARA EXCLUIR TIPO DE ARMAZENAGEM  
        public void excluir (int valor){
        String sql = "delete from tipoarmazenagem where id_tipoarmazenagem =" + valor;
    try{
        st = con.createStatement();
        st.execute(sql);
        st.close();
        }catch (SQLException erro) {
         throw new RuntimeException("Erro 20: "+erro);
     }
    }
                
        //*QUERY PARA LISTAR TODOS OS TIPOS DE ARMAZENAGEM
        public ArrayList<TipoArmazenagemModel> Listartodos(){
        String sql = "select id_tipoarmazenagem, nome_tipoarmazenagem from tipoarmazenagem";
       try{
        st = con.createStatement();
        rs = st.executeQuery(sql);
        while(rs.next()){
            TipoArmazenagemModel c = new TipoArmazenagemModel();         
            c.setIdtipoarmazenagem(rs.getInt("id_tipoarmazenagem"));
            c.setNometipoarmazenagem(rs.getString("nome_tipoarmazenagem"));               
            lista.add(c);         
        }
        st.execute(sql);
        st.close();
        }catch (SQLException erro) {
         throw new RuntimeException("Erro 21: "+erro); 
    }
    return lista;
    }
} 
