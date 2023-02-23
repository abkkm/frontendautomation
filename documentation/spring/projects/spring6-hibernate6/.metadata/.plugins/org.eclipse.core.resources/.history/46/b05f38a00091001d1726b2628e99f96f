package servlets;

import com.example.webApp1.DAO.CategoryDao;
import com.example.webApp1.DAO.CustomerDao;
import com.example.webApp1.Entity.CategoryEntity;
import com.example.webApp1.Entity.CustomersEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "customerServlet" ,urlPatterns = "/Customers")
public class CustomerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("Table", new CustomerDao().getListOfAllCustomersEntities());
        getServletContext().getRequestDispatcher("/Customers.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CustomerDao customerDao = new CustomerDao();
        if (req.getParameter("addButton")!=null) {
            customerDao.save(new CustomersEntity(req.getParameter("userLoginAdd"),req.getParameter("userPasswordAdd"),req.getParameter("userEmailAdd")));
            req.setAttribute("Table", new CustomerDao().getListOfAllCustomersEntities());
            getServletContext().getRequestDispatcher("/Customers.jsp").forward(req, resp);
        }
        else if(req.getParameter("deleteButton")!=null){
            customerDao.delete(customerDao.getCustomersEntityById(Integer.parseInt(req.getParameter("id"))));
            req.setAttribute("Table",new  CustomerDao().getListOfAllCustomersEntities());
            getServletContext().getRequestDispatcher("/Customers.jsp").forward(req, resp);
        }
        else if(req.getParameter("updateButton")!=null){
            CustomersEntity customersEntity = customerDao.getCustomersEntityById(Integer.parseInt(req.getParameter("userIdUp")));
            customersEntity.setUserLogin(req.getParameter("userLoginUp"));
            customersEntity.setUserPassword(req.getParameter("userPasswordUp"));
            customersEntity.setUserEmail(req.getParameter("userEmailUp"));
            customerDao.update(customersEntity);
            req.setAttribute("Table", new  CustomerDao().getListOfAllCustomersEntities());
            getServletContext().getRequestDispatcher("/Customers.jsp").forward(req, resp);
        }
    }
}
