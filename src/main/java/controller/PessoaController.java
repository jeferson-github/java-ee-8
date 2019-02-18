package controller;

import modelo.Pessoa;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named //gerenciado pelo JSF
//@SessionScoped //bean do cdi com escopo de sessão
@ViewScoped
public class PessoaController implements Serializable {

    private String nome;
    private String sexo;
    private String endereco;

    private List<Pessoa> pessoas;

    @PostConstruct
    private void init(){
        pessoas = new ArrayList<>();
    }

    public void cadastrar(){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setEndereco(endereco);
        pessoa.setSexo(sexo);
        pessoas.add(pessoa);
        //limpar();
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void limpar(){
        setNome(null);
        setEndereco(null);
        setSexo(null);
        setPessoas(null);
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

}
