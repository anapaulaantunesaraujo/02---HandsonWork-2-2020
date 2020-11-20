
package handsonwork.model;

import java.util.ArrayList;

public class ArmazenagemModel extends ClienteModel {
    private int idarmazenagem;
    private int idcliente;
    private String nomecliente;
    private String cnpjcliente;
    private String telefonecliente;
    private String emailcliente;
    private int idformapagamento;
    private String nomeformapagamento;
    private int idplano;
    private String nomeplano;
    private int idtipoarmazenagem;
    private String nometipoarmazenagem;
    
    ArrayList<ArmazenagemModel> ListaArmazenagem;
    

    //*GETTERS E SETTERS*/
    public int getIdarmazenagem() {
        return idarmazenagem;
    }

    public void setIdarmazenagem(int idarmazenagem) {
        this.idarmazenagem = idarmazenagem;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNomecliente() {
        return nomecliente;
    }

    public void setNomecliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }

    public String getCnpjcliente() {
        return cnpjcliente;
    }

    public void setCnpjcliente(String cnpjcliente) {
        this.cnpjcliente = cnpjcliente;
    }

    public String getTelefonecliente() {
        return telefonecliente;
    }

    public void setTelefonecliente(String telefonecliente) {
        this.telefonecliente = telefonecliente;
    }

    public String getEmailcliente() {
        return emailcliente;
    }

    public void setEmailcliente(String emailcliente) {
        this.emailcliente = emailcliente;
    }

    public int getIdformapagamento() {
        return idformapagamento;
    }

    public void setIdformapagamento(int idformapagamento) {
        this.idformapagamento = idformapagamento;
    }

    public String getNomeformapagamento() {
        return nomeformapagamento;
    }

    public void setNomeformapagamento(String nomeformapagamento) {
        this.nomeformapagamento = nomeformapagamento;
    }

    public int getIdplano() {
        return idplano;
    }

    public void setIdplano(int idplano) {
        this.idplano = idplano;
    }

    public String getNomeplano() {
        return nomeplano;
    }

    public void setNomeplano(String nomeplano) {
        this.nomeplano = nomeplano;
    }

    public int getIdtipoarmazenagem() {
        return idtipoarmazenagem;
    }

    public void setIdtipoarmazenagem(int idtipoarmazenagem) {
        this.idtipoarmazenagem = idtipoarmazenagem;
    }

    public String getNometipoarmazenagem() {
        return nometipoarmazenagem;
    }

    public void setNometipoarmazenagem(String nometipoarmazenagem) {
        this.nometipoarmazenagem = nometipoarmazenagem;
    }

    public ArrayList<ArmazenagemModel> getListaArmazenagem() {
        return ListaArmazenagem;
    }

    public void setListaArmazenagem(ArrayList<ArmazenagemModel> ListaArmazenagem) {
        this.ListaArmazenagem = ListaArmazenagem;
    }
    
 }