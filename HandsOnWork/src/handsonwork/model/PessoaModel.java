
package handsonwork.model;

public class PessoaModel {
    private int idpessoa;
    private String nomepessoa;
    private String telefonepessoa;
    private String emailpessoa;
    private String ehfuncionario;
    private String ehcliente;
   
    public String getEhfuncionario() {
        return ehfuncionario;
    }

    public void setEhfuncionario(String ehfuncionario) {
        this.ehfuncionario = ehfuncionario;
    }

    public String getEhcliente() {
        return ehcliente;
    }

    public void setEhcliente(String ehcliente) {
        this.ehcliente = ehcliente;
    }

    
    public int getIdpessoa() {
        return idpessoa;
    }

    public String getNomepessoa() {
        return nomepessoa;
    }

    public void setNomepessoa(String nomepessoa) {
        this.nomepessoa = nomepessoa;
    }

    public String getTelefonepessoa() {
        return telefonepessoa;
    }

    public void setTelefonepessoa(String telefonepessoa) {
        this.telefonepessoa = telefonepessoa;
    }

    public String getEmailpessoa() {
        return emailpessoa;
    }

    public void setEmailpessoa(String emailpessoa) {
        this.emailpessoa = emailpessoa;
    }          

    public void setIdpessoa(int idpessoa) {
        this.idpessoa = idpessoa;
    }
}
