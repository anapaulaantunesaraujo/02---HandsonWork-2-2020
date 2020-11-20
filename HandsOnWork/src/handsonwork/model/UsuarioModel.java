
package handsonwork.model;

public class UsuarioModel {
    private int idusuario;
    private PessoaModel funcionario;
    private PerfilModel perfil;

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public PessoaModel getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(PessoaModel funcionario) {
        this.funcionario = funcionario;
    }

    public PerfilModel getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilModel perfil) {
        this.perfil = perfil;
    }
   
}
