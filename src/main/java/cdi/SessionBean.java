package cdi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.time.LocalDateTime;

// Só é destruído se for programado ou exceder o tempo de sessão (Internet Banking)
@SessionScoped
public class SessionBean implements Serializable {
    public static Integer cont = 0;

    public SessionBean(){

        cont++;
    }
    public String getCont(){
        return cont.toString();
    }

    @PostConstruct
    private void init(){
        System.out.println(" SessionBean foi criada: " + LocalDateTime.now());
    }

    @PreDestroy
    private void destroy(){
        System.out.println(" SessionBean foi destruída: " + LocalDateTime.now());

    }
}
