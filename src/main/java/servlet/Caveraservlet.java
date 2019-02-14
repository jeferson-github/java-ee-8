package servlet;

import cdi.ApplicationBean;
import cdi.RequestBean;
import cdi.SessionBean;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cavera/")
public class Caveraservlet extends HttpServlet {

    @Inject
    private ApplicationBean applicationBean;

    @Inject
    private SessionBean sessionBean;

    @Inject
    private RequestBean requestBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("funfou");

        resp.getWriter().append("ok");

        resp.getWriter().append(" ApplicationBean: " + applicationBean.getCont());
        resp.getWriter().append(" SessionBean: " + sessionBean.getCont());
        resp.getWriter().append(" RequestBean: " + requestBean.getCont());

        System.out.println(" ApplicationBean: " + applicationBean.getCont());
        System.out.println(" SessionBean: " + sessionBean.getCont());
        System.out.println(" RequestBean: " + requestBean.getCont());

    }

}
