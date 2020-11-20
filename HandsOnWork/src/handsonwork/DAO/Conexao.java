package handsonwork.DAO;

import java.sql.DriverManager;
import java.sql.Connection;

public class Conexao {
    private Connection con; 


     //*CONEXAO COM O BANCO DE DADOS MYSQL     
public Connection getConexao(){
     try{
         String driver="com.mysql.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/armazenagem?zeroDateTimeBehavior=convertToNull";
        Class.forName(driver);
        con = DriverManager.getConnection(url, "root", "");
       
     }catch (Exception erro) {
         throw new RuntimeException("Erro 1: "+erro);
     }return con;
     }
}

    

        
        



