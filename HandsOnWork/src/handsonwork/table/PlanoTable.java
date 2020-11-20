
package handsonwork.table;
import handsonwork.model.PlanoModel;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class PlanoTable extends AbstractTableModel{
    public static final int COL_ID_PLANO = 0;
    public static final int COL_NOME_PLANO = 1;
    
    public ArrayList<PlanoModel> lista;

    public PlanoTable(ArrayList<PlanoModel>l) {
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
        PlanoModel c = lista.get(linhas);
         if(colunas == COL_ID_PLANO)return c.getIdplano();
         if(colunas == COL_NOME_PLANO)return c.getNomeplano();
    return "";
    }
    
    @Override
    public String getColumnName(int colunas){
         if(colunas == COL_ID_PLANO)return "ID";
         if(colunas == COL_NOME_PLANO)return "NOME";

    return "";
    }   

}
