package servlets;

import com.example.webApp1.DAO.DeliveriesDao;
import com.example.webApp1.DAO.MarketDao;
import com.example.webApp1.DAO.ProductDao;
import com.example.webApp1.DAO.SuppliersDao;
import com.example.webApp1.Entity.DeliveriesEntity;
import com.example.webApp1.Entity.MarketEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@WebServlet(urlPatterns = "/Market")
public class MarketServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("Table", new MarketDao().getAllProductsInMarketEntity());
        getServletContext().getRequestDispatcher("/Market.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MarketDao marketDao = new MarketDao();
        if (req.getParameter("addButton")!=null){
            MarketEntity marketEntity=new MarketEntity(Integer.parseInt(req.getParameter("marketAmountAdd")),
                    new ProductDao().getProductsEntityById(Integer.parseInt(req.getParameter("productIdAdd"))));
            marketDao.save(marketEntity);
            req.setAttribute("Table", new MarketDao().getAllProductsInMarketEntity());
            getServletContext().getRequestDispatcher("/Market.jsp").forward(req, resp);
        }
        else if (req.getParameter("updateButton")!=null){
            MarketEntity marketEntity = marketDao.getPositionById(Integer.parseInt(req.getParameter("posId")));
            marketEntity.setMarketAmount(Integer.parseInt(req.getParameter("marketAmountUp")));
            marketEntity.setProductMarket(new ProductDao().getProductsEntityById(Integer.parseInt(req.getParameter("productIdUp"))));
            marketDao.update(marketEntity);
            req.setAttribute("Table", new MarketDao().getAllProductsInMarketEntity());
            getServletContext().getRequestDispatcher("/Market.jsp").forward(req, resp);
        }
        else if (req.getParameter("deleteButton")!=null){
            MarketEntity marketEntity = marketDao.getPositionById(Integer.parseInt(req.getParameter("idPosDel")));
            marketDao.delete(marketEntity);
            req.setAttribute("Table", new MarketDao().getAllProductsInMarketEntity());
            getServletContext().getRequestDispatcher("/Market.jsp").forward(req, resp);
        }
    }
}
