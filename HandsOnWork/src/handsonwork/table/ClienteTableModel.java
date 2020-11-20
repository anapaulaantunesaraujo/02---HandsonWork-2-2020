
package handsonwork.table;
import handsonwork.model.ClienteModel;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ClienteTableModel extends AbstractTableModel{

    public static final int COL_ID_CLIENTE = 0;
    public static final int COL_NOME_CLIENTE = 1;
    public static final int COL_CNPJ_CLIENTE = 2;
    public static final int COL_DATA_CLIENTE = 3;
    public static final int COL_EHFUNCIONARIO_CLIENTE = 4;
    public static final int COL_EHCLIENTE_CLIENTE = 5;
    public static final int COL_TELEFONE_CLIENTE = 6;
    public static final int COL_EMAIL_CLIENTE = 7;
    public ArrayList<ClienteModel> lista;

    public ClienteTableModel(ArrayList<ClienteModel>l) {
      lista = new ArrayList<>(l);  
    }
    
    @Override
    public int getRowCount() {
      return lista.size();  
    }
    
    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
         ClienteModel c = lista.get(linhas);
         if(colunas == COL_ID_CLIENTE)return c.getIdpessoa();
         if(colunas == COL_NOME_CLIENTE)return c.getNomepessoa();
         if(colunas == COL_CNPJ_CLIENTE)return c.getCnpj();
         if(colunas == COL_DATA_CLIENTE)return c.getDatainicio();
         if(colunas == COL_EHFUNCIONARIO_CLIENTE)return c.getEhfuncionario();
         if(colunas == COL_EHCLIENTE_CLIENTE)return c.getEhcliente();
         if(colunas == COL_TELEFONE_CLIENTE)return c.getTelefonepessoa();
         if(colunas == COL_EMAIL_CLIENTE)return c.getEmailpessoa();
    return "";
    }
    
    @Override
    public String getColumnName(int colunas){
         if(colunas == COL_ID_CLIENTE)return "ID";
         if(colunas == COL_NOME_CLIENTE)return "NOME";
         if(colunas == COL_CNPJ_CLIENTE)return "CNPJ";
         if(colunas == COL_DATA_CLIENTE)return "DATA";
         if(colunas == COL_EHFUNCIONARIO_CLIENTE)return "EHFUNCIONARIO";
         if(colunas == COL_EHCLIENTE_CLIENTE)return "EHCLIENTE";
         if(colunas == COL_TELEFONE_CLIENTE)return "TELEFONE";
         if(colunas == COL_EMAIL_CLIENTE)return "EMAIL";
    return "";
    }
}
