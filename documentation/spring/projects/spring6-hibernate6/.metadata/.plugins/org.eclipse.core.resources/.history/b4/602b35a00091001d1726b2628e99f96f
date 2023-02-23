package servlets;

import com.example.webApp1.DAO.CategoryDao;
import com.example.webApp1.Entity.CategoryEntity;
import com.example.webApp1.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.imageio.metadata.IIOMetadataNode;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "CategoryServlet", urlPatterns = {"/Category", "/"})
public class CategoryServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("categoryTable", new CategoryDao().getAllCategories());
        getServletContext().getRequestDispatcher("/Category.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CategoryDao categoryDao = new CategoryDao();
        if (req.getParameter("addButton")!=null) {
            categoryDao.save(new CategoryEntity(req.getParameter(("categoryName"))));
            req.setAttribute("categoryTable", new CategoryDao().getAllCategories());
            getServletContext().getRequestDispatcher("/Category.jsp").forward(req, resp);
        }
        else if(req.getParameter("deleteButton")!=null){
            categoryDao.deleteById(Integer.parseInt(req.getParameter("id")));
            req.setAttribute("categoryTable", new CategoryDao().getAllCategories());
            getServletContext().getRequestDispatcher("/Category.jsp").forward(req, resp);
        }
        else if(req.getParameter("updateButton")!=null){
            CategoryEntity categoryEntity = categoryDao.getCategoryEntityById(Integer.parseInt(req.getParameter("categoryId")));
            categoryEntity.setCategoryName(req.getParameter("categoryName"));
            categoryDao.update(categoryEntity);
            req.setAttribute("categoryTable", new CategoryDao().getAllCategories());
            getServletContext().getRequestDispatcher("/Category.jsp").forward(req, resp);
        }
    }
}
