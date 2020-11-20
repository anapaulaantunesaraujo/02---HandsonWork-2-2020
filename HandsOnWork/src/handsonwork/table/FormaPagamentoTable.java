
package handsonwork.table;
import handsonwork.model.FormaPagamentoModel;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class FormaPagamentoTable extends AbstractTableModel{
    
    public static final int COL_ID_FORMA_PAGAMENTO = 0;
    public static final int COL_NOME_FORMA_PAGAMENTO = 1;

    public ArrayList<FormaPagamentoModel> lista;

    public FormaPagamentoTable(ArrayList<FormaPagamentoModel>l) {
      lista = new ArrayList<>(l);  
    }

    @Override
    public int getRowCount() {
        return lista.size(); 
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        FormaPagamentoModel c = lista.get(linhas);
         if(colunas == COL_ID_FORMA_PAGAMENTO)return c.getIdformapagamento();
         if(colunas == COL_NOME_FORMA_PAGAMENTO)return c.getNomeformapagamento();
    return "";
    }
    
    @Override
    public String getColumnName(int colunas){
         if(colunas == COL_ID_FORMA_PAGAMENTO)return "ID";
         if(colunas == COL_NOME_FORMA_PAGAMENTO)return "NOME";

    return "";
    }   
}
