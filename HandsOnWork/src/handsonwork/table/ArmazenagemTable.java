package handsonwork.table;
import handsonwork.model.ArmazenagemModel;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ArmazenagemTable extends AbstractTableModel{
    public static final int COL_ID_PEDIDO = 0;
    public static final int COL_NOME_CLIENTE = 1;
    public static final int COL_FORMA_PAGAMENTO = 2;
    public static final int COL_PLANO = 3;
    public static final int COL_TIPO_ARMAZENAGEM = 4;
    public ArrayList<ArmazenagemModel> lista;
    
    public ArmazenagemTable(ArrayList<ArmazenagemModel>l) {
      lista = new ArrayList<>(l);  
    }

    @Override
    public int getRowCount() {
        return lista.size(); 
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
       ArmazenagemModel c = lista.get(linhas);
         if(colunas == COL_ID_PEDIDO) return c.getIdarmazenagem();
         if(colunas == COL_NOME_CLIENTE)return c.getNomecliente();
         if(colunas == COL_FORMA_PAGAMENTO)return c.getNomeformapagamento();
         if(colunas == COL_PLANO)return c.getNomeplano();
         if(colunas == COL_TIPO_ARMAZENAGEM)return c.getNometipoarmazenagem();

    return "";
    }

        @Override
    public String getColumnName(int colunas){
         if(colunas == COL_ID_PEDIDO)return "ID";
         if(colunas == COL_NOME_CLIENTE)return "CLIENTE";
         if(colunas == COL_FORMA_PAGAMENTO)return "FORMA DE PAGAMENTO";
         if(colunas == COL_PLANO)return "PLANO DE PAGAMENTO";
         if(colunas == COL_TIPO_ARMAZENAGEM)return "TIPO DE ARMAZENAGEM";
    return "";
    } 
}
