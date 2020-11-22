package handsonwork.DAO;
import handsonwork.model.FuncionarioModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class FuncionarioDAO {
    private Connection con; 
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private final ArrayList<FuncionarioModel> lista = new ArrayList<>();
    
    //*CONECTANDO CLASSE COM O BANCO DE DADOS    
    public FuncionarioDAO(){
        con = new Conexao().getConexao();
    }
    
     //*QUERY PARA INSERIR FUNCIONARIO     
    public void inserir (FuncionarioModel i){
        String sql = "Insert into pessoa (nome_pessoa, cnpjcpf_pessoa, data_inicio, ehfuncionario, ehCliente,telefone_pessoa,email_pessoa) values (?,?,?,?,?,?,?)";
    try{
        stmt = con.prepareStatement(sql);
        stmt.setString(1, i.getNomepessoa());
        stmt.setString(2, i.getCpf());
        stmt.setString(3, i.getDatanascimento());
        stmt.setString(4, i.getEhfuncionario());
        stmt.setString(5, i.getEhcliente());
        stmt.setString(6, i.getTelefonepessoa());
        stmt.setString(7, i.getEmailpessoa());
        stmt.execute();
        stmt.close();     
        }catch (SQLException erro) {
         throw new RuntimeException("Erro 22: " +erro);
     }       
    }
    
     //*QUERY PARA ALTERAR FUNCIONARIO    
    public void alterar (FuncionarioModel a){
        String sql = "update pessoa set nome_pessoa = ? , cnpjcpf_pessoa = ?, data_inicio = ?, ehfuncionario = ?, ehCliente = ?, telefone_pessoa = ?,email_pessoa = ? where id_pessoa = ?";
    try{
        stmt = con.prepareStatement(sql);
        stmt.setString(1, a.getNomepessoa());
        stmt.setString(2, a.getCpf());
        stmt.setString(3, a.getDatanascimento());
        stmt.setString(4, a.getEhfuncionario());
        stmt.setString(5, a.getEhcliente());
        stmt.setString(6, a.getTelefonepessoa());
        stmt.setString(7, a.getEmailpessoa());
        stmt.setInt(8,a.getIdpessoa());
        stmt.execute();
        stmt.close();
        }catch (SQLException erro) {
         throw new RuntimeException("Erro 23: "+erro);
     }    
    }
    
     //*QUERY PARA EXCLUIR FUNCIONARIO
    public void excluir (int valor){
        String sql = "delete from pessoa where id_pessoa =" + valor;
    try{
        st = con.createStatement();
        st.execute(sql);
        st.close();
        }catch (SQLException erro) {
         throw new RuntimeException("Erro 24: "+erro);
     }
    }
    
     //*QUERY PARA LISTAR TODOS OS FUNCIONARIOS    
    public ArrayList<FuncionarioModel> Listartodos(){
        String sql = "select id_pessoa, nome_pessoa,cnpjcpf_pessoa,data_inicio, ehfuncionario, ehcliente,telefone_pessoa, email_pessoa from pessoa";
       try{
        st = con.createStatement();
        rs = st.executeQuery(sql);
        while(rs.next()){
            FuncionarioModel c = new FuncionarioModel();         
            c.setCpf(rs.getString("cnpjcpf_pessoa"));
            c.setDatanascimento(rs.getString("data_inicio"));
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
         throw new RuntimeException("Erro 25: "+erro); 
    }
    return lista;
    }   
}
