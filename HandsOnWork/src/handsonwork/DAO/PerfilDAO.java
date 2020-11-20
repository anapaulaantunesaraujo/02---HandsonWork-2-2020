package handsonwork.DAO;
import handsonwork.model.FormaPagamentoModel;
import handsonwork.model.PerfilModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PerfilDAO {
    private Connection con; 
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private final ArrayList<PerfilModel> lista = new ArrayList<>();
    
        //*CONECTANDO CLASSE COM O BANCO DE DADOS  
        public PerfilDAO(){
        con = new Conexao().getConexao();
    } 
    
     //*QUERY PARA INSERIR PERFIL         
    public void inserir (PerfilModel i){
        String sql = "Insert into perfil (nome_perfil) values (?)";
    try{
        stmt = con.prepareStatement(sql);
        stmt.setString(1, i.getNomeperfil());
        stmt.execute();
        stmt.close();
                
        }catch (SQLException erro) {
         throw new RuntimeException("Erro 26: "+erro);
     }
    } 
    
     //*QUERY PARA ALTERAR PERFIL     
    public void alterar (PerfilModel a){
        String sql = "update perfil set nome_perfil = ? where id_perfil = ? ";
    try{
        stmt = con.prepareStatement(sql);
        stmt.setString(1, a.getNomeperfil());
        stmt.setInt(2, a.getIdperfil());
        stmt.execute();
        stmt.close();
        }catch (SQLException erro) {
         throw new RuntimeException("Erro 27: "+erro);
        }
    }
    
     //*QUERY PARA EXCLUIR PERFIL      
    public void excluir (int valor){
        String sql = "delete from perfil where id_perfil =" + valor;
    try{
        st = con.createStatement();
        st.execute(sql);
        st.close();
        }catch (SQLException erro) {
         throw new RuntimeException("Erro 28: "+erro);
     }
    }

     //*QUERY PARA LISTAR TODAS OS PERFIS      
    public ArrayList<PerfilModel> Listartodos(){
        String sql = "select id_perfil, nome_perfil from perfil";
       try{
        st = con.createStatement();
        rs = st.executeQuery(sql);
        while(rs.next()){
            PerfilModel c = new PerfilModel();
            c.setIdperfil(rs.getInt("id_perfil"));
            c.setNomeperfil(rs.getString("nome_perfil"));
            lista.add(c);         
        }
        st.execute(sql);
        st.close();
        }catch (SQLException erro) {
         throw new RuntimeException("Erro 28: "+erro); 
    }
    return lista;
    }         
}
