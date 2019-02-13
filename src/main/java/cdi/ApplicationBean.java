package cdi;

import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;

@ApplicationScoped
public class ApplicationBean implements Serializable {
    private static int cont = 0;

    public ApplicationBean(){
        cont++;
    }

}
