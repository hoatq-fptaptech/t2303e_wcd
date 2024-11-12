package wcd.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import wcd.entity.Classroom;

import java.io.IOException;
import java.util.List;

@WebServlet(value = "/list-class")
public class ClassController extends HttpServlet {
    private SessionFactory _sessionFactory;

    @Override
    public void init() throws ServletException {
        super.init();
        try{
            _sessionFactory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .buildSessionFactory();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try(Session session = _sessionFactory.openSession()){
            session.beginTransaction();
            List<Classroom> list = session.createQuery("SELECT DISTINCT c FROM Classroom c LEFT JOIN FETCH c.students",Classroom.class)
                    .getResultList(); // jSQL
            req.setAttribute("classes",list);
            session.getTransaction().commit();
            req.getRequestDispatcher("classroom/list.jsp").forward(req,resp);
            return;
        }
    }


}
