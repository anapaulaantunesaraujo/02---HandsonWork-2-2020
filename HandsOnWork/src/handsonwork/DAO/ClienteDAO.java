
package handsonwork.DAO;
import handsonwork.model.ClienteModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDAO {

    private Connection con; 
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private final ArrayList<ClienteModel> lista = new ArrayList<>();

    
     //*CONECTANDO CLASSE COM O BANCO DE DADOS    
    public ClienteDAO(){
        con = new Conexao().getConexao();
    }
 
     //*QUERY PARA INSERIR CLIENTE     
    public void inserir (ClienteModel i){
        String sql = "Insert into pessoa (nome_pessoa, cnpjcpf_pessoa, data_inicio, ehfuncionario, ehCliente,telefone_pessoa,email_pessoa) values (?,?,?,?,?,?,?)";
    try{
        stmt = con.prepareStatement(sql);
        stmt.setString(1, i.getNomepessoa());
        stmt.setString(2, i.getCnpj());
        stmt.setString(3, i.getDatainicio());
        stmt.setString(4, i.getEhfuncionario());
        stmt.setString(5, i.getEhcliente());
        stmt.setString(6, i.getTelefonepessoa());
        stmt.setString(7, i.getEmailpessoa());
        stmt.execute();
        stmt.close();     
        }catch (SQLException erro) {
         throw new RuntimeException("Erro 2: " +erro);
     }       
    }
    
     //*QUERY PARA ALTERAR CLIENTE     
    public void alterar (ClienteModel a){
        String sql = "update pessoa set nome_pessoa = ? , cnpjcpf_pessoa = ?, data_inicio = ?, ehfuncionario = ?, ehCliente = ?, telefone_pessoa = ?,email_pessoa = ? where id_pessoa = ?";
    try{
        stmt = con.prepareStatement(sql);
        stmt.setString(1, a.getNomepessoa());
        stmt.setString(2, a.getCnpj());
        stmt.setString(3, a.getDatainicio());
        stmt.setString(4, a.getEhfuncionario());
        stmt.setString(5, a.getEhcliente());
        stmt.setString(6, a.getTelefonepessoa());
        stmt.setString(7, a.getEmailpessoa());
        stmt.setInt(8,a.getIdpessoa());
        stmt.execute();
        stmt.close();
        }catch (SQLException erro) {
         throw new RuntimeException("Erro 3: "+erro);
     }    
    }
    
     //*QUERY PARA EXCLUIR CLIENTE
    public void excluir (int valor){
        String sql = "delete from pessoa where id_pessoa =" + valor;
    try{
        st = con.createStatement();
        st.execute(sql);
        st.close();
        }catch (SQLException erro) {
         throw new RuntimeException("Erro 4: "+erro);
     }
    }

     //*QUERY PARA LISTAR TODOS OS CLIENTES    
    public ArrayList<ClienteModel> Listartodos(){
        String sql = "select id_pessoa, nome_pessoa,cnpjcpf_pessoa,data_inicio, ehfuncionario, ehcliente,telefone_pessoa, email_pessoa from pessoa";
       try{
        st = con.createStatement();
        rs = st.executeQuery(sql);
        while(rs.next()){
            ClienteModel c = new ClienteModel();         
            c.setCnpj(rs.getString("cnpjcpf_pessoa"));
            c.setDatainicio(rs.getString("data_inicio"));
            c.setIdpessoa(rs.getInt("id_pessoa"));
            c.setNomepessoa(rs.getString("nome_pessoa"));
            c.setTelefonepessoa(rs.getString("telefone_pessoa"));
            c.setEmailpessoa(rs.getString("email_pessoa"));
            c.setEhfuncionario(rs.getString("ehfuncionario"));
            c.setEhcliente(rs.getString("ehcliente"));                 
            lista.add(c);         
        }
        st.execute(sql);
        st.close();
        }catch (SQLException erro) {
         throw new RuntimeException("Erro 5: "+erro); 
    }
    return lista;
    }   
}
