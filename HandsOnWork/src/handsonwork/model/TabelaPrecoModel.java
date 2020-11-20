
package handsonwork.model;

public class TabelaPrecoModel {
        private int idtabelapreco;
        private String nometabelapreco;
        private PlanoModel plano;
        private PessoaModel pessoa;
        private float valor;

    /**
     * @return the idtabelapreco
     */
    public int getIdtabelapreco() {
        return idtabelapreco;
    }

    /**
     * @param idtabelapreco the idtabelapreco to set
     */
    public void setIdtabelapreco(int idtabelapreco) {
        this.idtabelapreco = idtabelapreco;
    }

    /**
     * @return the nometabelapreco
     */
    public String getNometabelapreco() {
        return nometabelapreco;
    }

    /**
     * @param nometabelapreco the nometabelapreco to set
     */
    public void setNometabelapreco(String nometabelapreco) {
        this.nometabelapreco = nometabelapreco;
    }

    /**
     * @return the plano
     */
    public PlanoModel getPlano() {
        return plano;
    }

    /**
     * @param plano the plano to set
     */
    public void setPlano(PlanoModel plano) {
        this.plano = plano;
    }

    /**
     * @return the pessoa
     */
    public PessoaModel getPessoa() {
        return pessoa;
    }

    /**
     * @param pessoa the pessoa to set
     */
    public void setPessoa(PessoaModel pessoa) {
        this.pessoa = pessoa;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }
}
