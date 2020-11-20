
package handsonwork.DAO;
import handsonwork.model.PlanoModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PlanoDAO {

    private Connection con; 
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private final ArrayList<PlanoModel> lista = new ArrayList<>();
     
     //*CONECTANDO CLASSE COM O BANCO DE DADOS     
    public PlanoDAO(){
        con = new Conexao().getConexao();
    }
    
     //*QUERY PARA INSERIR PLANO    
        public void inserir (PlanoModel i){
        String sql = "Insert into plano (nome_plano) values (?)";
    try{
        stmt = con.prepareStatement(sql);
        stmt.setString(1, i.getNomeplano());
        stmt.execute();
        stmt.close();
                
        }catch (SQLException erro) {
         throw new RuntimeException("Erro 14: "+erro);
     } 
    }      
        
      //*QUERY PARA ALTERAR PLANO      
    public void alterar (PlanoModel a){
        String sql = "update plano set nome_plano = ? where id_plano = ?";
    try{
        stmt = con.prepareStatement(sql);
        stmt.setString(1, a.getNomeplano());
        stmt.setInt(2, a.getIdplano());
        stmt.execute();
        stmt.close();
        }catch (SQLException erro) {
         throw new RuntimeException("Erro 15: "+erro);
     }
    }
    
      //*QUERY PARA EXCLUIR PLANO    
    public void excluir (int valor){
        String sql = "delete from plano where id_plano =" + valor;
    try{
        st = con.createStatement();
        st.execute(sql);
        st.close();
        }catch (SQLException erro) {
         throw new RuntimeException("Erro 16: "+erro);
     }
    }
    
      //*QUERY PARA LISTAR TODOS OS PLANOS     
    public ArrayList<PlanoModel> Listartodos(){
        String sql = "select id_plano, nome_plano from plano";
       try{
        st = con.createStatement();
        rs = st.executeQuery(sql);
        while(rs.next()){
            PlanoModel c = new PlanoModel();
            c.setIdplano(rs.getInt("id_plano"));
            c.setNomeplano(rs.getString("nome_plano"));
            lista.add(c);
        }
        st.execute(sql);
        st.close();
        }catch (SQLException erro) {
         throw new RuntimeException("Erro 17: "+erro); 
    }
    return lista;
    }   
    
}
