
package handsonwork.DAO;
import handsonwork.model.PerfilModel;
import handsonwork.model.PessoaModel;
import handsonwork.model.UsuarioModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UsuarioDAO {
    private Connection con; 
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private final ArrayList<UsuarioModel> lista = new ArrayList<>();
    
    //*CONECTANDO CLASSE COM O BANCO DE DADOS  
        public UsuarioDAO(){
        con = new Conexao().getConexao();
    }
        
     //*QUERY PARA INSERIR USUARIO        
    public void inserir (UsuarioModel i){
        String sql = "Insert into usuario (id_pessoa,	id_perfil) values (?,?)";
    try{
        stmt = con.prepareStatement(sql);
        stmt.setObject(1, i.getFuncionario().getIdpessoa());
        stmt.setObject(2, i.getPerfil().getIdperfil());
        stmt.execute();
        stmt.close();       
        }catch (SQLException erro) {
         throw new RuntimeException("Erro 33: "+erro);
     }
    }     

     //*QUERY PARA ALTERAR USUARIO      
    public void alterar (UsuarioModel a){
        String sql = "update usuario set id_pessoa = ?, id_perfil = ?  where id_usuario = ? ";
    try{
        stmt = con.prepareStatement(sql);
        stmt.setObject(1, a.getFuncionario().getIdpessoa());
        stmt.setObject(2, a.getPerfil().getIdperfil());
        stmt.setInt(3, a.getIdusuario());
        stmt.execute();
        stmt.close();
        }catch (SQLException erro) {
         throw new RuntimeException("Erro 34: "+erro);
        }
    }
     //*QUERY PARA EXCLUIR USUARIO      
    public void excluir (int valor){
        String sql = "delete from usuario where id_usuario =" + valor;
    try{
        st = con.createStatement();
        st.execute(sql);
        st.close();
        }catch (SQLException erro) {
         throw new RuntimeException("Erro 35: "+erro);
     }
    }
    
     //*QUERY PARA LISTAR TODAS OS USUARIOS      
    public ArrayList<UsuarioModel> Listartodos(){
        String sql = "select id_usuario, id_pessoa, id_perfil from usuario";
       try{
        st = con.createStatement();
        rs = st.executeQuery(sql);
        while(rs.next()){
            UsuarioModel c = new UsuarioModel();
            c.setIdusuario(rs.getInt("id_usuario"));
            c.setFuncionario((PessoaModel) rs.getObject("id_pessoa"));
            c.setPerfil((PerfilModel) rs.getObject("id_perfil"));
            lista.add(c);         
        }
        st.execute(sql);
        st.close();
        }catch (SQLException erro) {
         throw new RuntimeException("Erro 36: "+erro); 
    }
    return lista;
    }     
}
