package handsonwork.DAO;
import handsonwork.model.ArmazenagemModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ArmazenagemDAO{
    private Connection con; 
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private ArrayList<ArmazenagemModel> lista = new ArrayList<>();

    //*CONECTANDO CLASSE COM O BANCO DE DADOS 
    public ArmazenagemDAO() {
       con = new Conexao().getConexao();
    }
    
     //*QUERY PARA INSERIR ARMAZENAGEM 
      public void inserir (ArmazenagemModel i){
        String sql = "Insert into armazenagem (id_pessoa, id_formapagamento, id_plano, id_tipoarmazenagem) values (?,?,?,?)";
    try{
        stmt = con.prepareStatement(sql);
        stmt.setInt(1, i.getIdcliente());
        stmt.setInt(2, i.getIdformapagamento());
        stmt.setInt(3, i.getIdplano());
        stmt.setInt(4, i.getIdtipoarmazenagem());
        stmt.execute();
        stmt.close();
        
        
        }catch (SQLException erro) {
         throw new RuntimeException("Erro 6: "+erro);
     }
    }
    
     //*QUERY PARA ALTERAR ARMAZENAGEM       
    public void alterar (ArmazenagemModel a){
        String sql = "update armazenagem set id_pessoa = ? , id_formapagamento = ?, id_plano = ?, id_tipoarmazenagem = ? where id_pedido = ?";
    try{
        stmt = con.prepareStatement(sql);
        stmt.setInt(1, a.getIdcliente());
        stmt.setInt(2, a.getIdformapagamento());
        stmt.setInt(3, a.getIdplano());
        stmt.setInt(4, a.getIdtipoarmazenagem());
        stmt.setInt(5, a.getIdarmazenagem());
        stmt.execute();
        stmt.close();
        }catch (SQLException erro) {
         throw new RuntimeException("Erro 7: "+erro);
     }
    }
    
     //*QUERY PARA EXCLUIR ARMAZENAGEM     
    public void excluir (int valor){
        String sql = "delete from armazenagem where id_pedido =" + valor;
    try{
        st = con.createStatement();
        st.execute(sql);
        st.close();
        }catch (SQLException erro) {
         throw new RuntimeException("Erro 8: "+erro);
     }
    }
    
     //*QUERY PARA LISTAR TODAS AS ARMAZENAGEM     
    public ArrayList<ArmazenagemModel> Listartodos(){
        String sql = "select a.id_pedido, b.id_formapagamento, b.nome_formapagamento, c.nome_pessoa, c.id_pessoa,\n" +
"d.nome_plano, d.id_plano, e.nome_tipoarmazenagem, e.id_tipoarmazenagem\n" +
"from armazenagem a \n" +
"inner join formapagamento b on a.id_formapagamento = b.id_formapagamento\n" +
"inner join pessoa c on c.id_pessoa = a.id_pessoa\n" +
"inner join plano d on d.id_plano = a.id_plano\n" +
"inner join tipoarmazenagem e on e.id_tipoarmazenagem = a.id_tipoarmazenagem";
       try{
        st = con.createStatement();
        rs = st.executeQuery(sql);
        while(rs.next()){
            ArmazenagemModel a = new ArmazenagemModel();
            a.setIdarmazenagem(rs.getInt("id_pedido"));
            a.setNomecliente(rs.getString("nome_pessoa"));
            a.setNomeformapagamento(rs.getString("nome_formapagamento"));
            a.setNomeplano(rs.getString("nome_plano"));
            a.setNometipoarmazenagem(rs.getString("nome_tipoarmazenagem"));
            lista.add(a);         
        }
        st.execute(sql);
        st.close();
        }catch (SQLException erro) {
         throw new RuntimeException("Erro 9: "+erro); 
    }
    return lista;
    } 
 }
