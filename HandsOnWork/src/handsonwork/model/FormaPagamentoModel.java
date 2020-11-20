
package handsonwork.model;

import java.util.ArrayList;

public class FormaPagamentoModel {
    private int idformapagamento;
    private String nomeformapagamento;
    ArrayList<FormaPagamentoModel> ListaFormaPagamentoModel;

       /*GETTERS E SETTERS*/    
    public int getIdformapagamento() {
        return idformapagamento;
    }
    /**
     * @param idformapagamento the idformapagamento to set
     */
    public void setIdformapagamento(int idformapagamento) {
        this.idformapagamento = idformapagamento;
    }
    /**
     * @return the nomeformapagamento
     */
    public String getNomeformapagamento() {
        return nomeformapagamento;
    }
    /**
     * @param nomeformapagamento the nomeformapagamento to set
     */
    public void setNomeformapagamento(String nomeformapagamento) {
        this.nomeformapagamento = nomeformapagamento;
    }   

    public ArrayList<FormaPagamentoModel> getListaFormaPagamentoModel() {
        return ListaFormaPagamentoModel;
    }

    public void setListaFormaPagamentoModel(ArrayList<FormaPagamentoModel> ListaFormaPagamentoModel) {
        this.ListaFormaPagamentoModel = ListaFormaPagamentoModel;
    }
    
}
