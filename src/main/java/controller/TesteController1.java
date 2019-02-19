package controller;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named //gerenciado pelo JSF
@SessionScoped //bean do cdi com escopo de sessão
public class TesteController1 implements Serializable {

    private String mensagemBoasVindas;
    private String nome;

    @PostConstruct
    private void init(){
        mensagemBoasVindas = "Xurupita dentro do bean";
    }

    public void teste(){
        mensagemBoasVindas = nome;
    }

    public void setMensagemBoasVindas(String mensagemBoasVindas) {
        this.mensagemBoasVindas = mensagemBoasVindas;
    }

    public String getMensagemBoasVindas() {
        return mensagemBoasVindas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

}
