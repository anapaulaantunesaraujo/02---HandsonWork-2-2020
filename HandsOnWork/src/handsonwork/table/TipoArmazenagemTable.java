
package handsonwork.table;

import handsonwork.model.TipoArmazenagemModel;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TipoArmazenagemTable extends AbstractTableModel{
   public static final int COL_ID_TIPO_ARMAZENAGEM = 0;
    public static final int COL_NOME_TIPO_ARMAZENAGEM = 1;
    
    public ArrayList<TipoArmazenagemModel> lista;

    public TipoArmazenagemTable(ArrayList<TipoArmazenagemModel>l) {
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
        TipoArmazenagemModel c = lista.get(linhas);
         if(colunas == COL_ID_TIPO_ARMAZENAGEM)return c.getIdtipoarmazenagem();
         if(colunas == COL_NOME_TIPO_ARMAZENAGEM)return c.getNometipoarmazenagem();
    return "";
    }
    
    @Override
    public String getColumnName(int colunas){
         if(colunas == COL_ID_TIPO_ARMAZENAGEM)return "ID";
         if(colunas == COL_NOME_TIPO_ARMAZENAGEM)return "NOME";

    return "";
    }   
}
