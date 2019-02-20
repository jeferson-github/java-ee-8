package controller;

import modelo.Pessoa;
import repositorio.PessoaDAO;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//@SessionScoped
@ViewScoped
@Named
public class PessoaController implements Serializable {
    private Pessoa pessoaForm;
    private List<Pessoa> pessoas;// = new ArrayList<>();
    private Pessoa pessoaSelecionada;

    @Inject
    private PessoaDAO pessoaDAO;

    @PostConstruct
    private void innit (){
        pessoaForm = new Pessoa();
        atualizarTabela();
    }

    public void cadastrar(){
        //pessoas.add(pessoaForm);
        pessoaDAO.salvar(pessoaForm);
        limpar();
        atualizarTabela();
    }

    public void atualizarTabela(){
        pessoas = pessoaDAO.consultar();
    }

    public void limpar(){
        this.pessoaForm = new Pessoa();
    }

    public void excluir(){
        //this.pessoas.remove(pessoaForm);
        pessoaDAO.remover(pessoaForm);
        limpar();
        atualizarTabela();
    }

    public void aoSelecionar(){
        this.pessoaForm = pessoaSelecionada;
    }

    public void aoDesselecionar(){
        limpar();
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }
    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public Pessoa getPessoaSelecionada() {
        return pessoaSelecionada;
    }

    public void setPessoaSelecionada(Pessoa pessoaSelecionada) {
        this.pessoaSelecionada = pessoaSelecionada;
    }

    public Pessoa getPessoaForm() {
        return pessoaForm;
    }

    public void setPessoaForm(Pessoa pessoaForm) {
        this.pessoaForm = pessoaForm;
    }
}