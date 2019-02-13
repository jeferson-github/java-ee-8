package cdi;

import javax.enterprise.context.RequestScoped;
import java.io.Serializable;

//padrão é RequestScoped
@RequestScoped
public class RequestBean implements Serializable {
    private static int cont = 0;

    public RequestBean(){
        cont++;
    }

}
