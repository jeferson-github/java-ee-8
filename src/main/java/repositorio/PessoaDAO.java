package repositorio;

import modelo.Pessoa;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

@ApplicationScoped
public class PessoaDAO implements Serializable {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void salvar(Pessoa p){

        em.persist(p);
        System.out.println("Final do método salvar");
        System.out.println("Final do método salvar");
        System.out.println("Final do método salvar");
    }

    public List<Pessoa> consultar(){
        return em.createQuery("select p from Pessoa p",Pessoa.class).getResultList();
    }


    @Transactional
    public void remover(Pessoa p){
        //p = em.find(Pessoa.class,p.getId());
        //p = detached

        p = em.merge(p); //Estágias
        //p = em.find(Pessoa.class, p.getId()); //Daniel

        //p = managed
        em.remove(p);
        //em.flush();
    }

    private void atualizarTabela(){

    }
}
