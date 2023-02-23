package servlets;

import com.example.webApp1.DAO.DeliveriesDao;
import com.example.webApp1.DAO.ProductDao;
import com.example.webApp1.DAO.SuppliersDao;
import com.example.webApp1.Entity.DeliveriesEntity;
import com.example.webApp1.HibernateUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@WebServlet(name = "DeliveriesServlet", urlPatterns = "/Deliveries")
public class DeliveriesServlet extends HttpServlet {

    public List<DeliveriesEntity> deliveries;
    public Set<String> products=new HashSet<>();
    public Set<String> suppliers = new HashSet<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        deliveries = new DeliveriesDao().getAllDelivers();
        for (DeliveriesEntity delivery: deliveries) {
            products.add(delivery.getProduct().getProductName());
            suppliers.add(delivery.getSuppliers().getSupplierAddress());
        }
        req.setAttribute("Table", deliveries);
        req.setAttribute("products", products);
        req.setAttribute("suppliers", suppliers);
        getServletContext().getRequestDispatcher("/Deliveries.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DeliveriesDao deliveriesDao = new DeliveriesDao();
        if (req.getParameter("addButton")!=null){
            DeliveriesEntity deliveriesEntity = new DeliveriesEntity();
            try {
                deliveriesEntity.setDeliveryDate(new SimpleDateFormat("yyyy.MM.dd").parse((req.getParameter("dateDel"))));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            deliveriesEntity.setDeliveryAmount(Integer.parseInt(req.getParameter("amountDel")));
            deliveriesEntity.setIdProduct(Integer.parseInt(req.getParameter("idProduct")));
            deliveriesEntity.setIdSupplier(Integer.parseInt(req.getParameter("idSupplier")));
            deliveriesEntity.setProduct(new ProductDao().getProductsEntityById(deliveriesEntity.getIdProduct()));
            deliveriesEntity.setSuppliers(new SuppliersDao().getSupplierById(deliveriesEntity.getIdSupplier()));
            deliveriesDao.save(deliveriesEntity);
            deliveries = new DeliveriesDao().getAllDelivers();
        }
        else if (req.getParameter("updateButton")!=null){
            DeliveriesEntity deliveriesEntity = deliveriesDao.getDeliveryById(Integer.parseInt(req.getParameter("idDeliveryUp")));
            try {
                deliveriesEntity.setDeliveryDate(new SimpleDateFormat("yyyy.MM.dd").parse(req.getParameter("dateDelUp")));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            deliveriesEntity.setDeliveryAmount(Integer.parseInt(req.getParameter("amountDelUp")));
            deliveriesEntity.setIdProduct(Integer.parseInt(req.getParameter("idProductUp")));
            deliveriesEntity.setIdSupplier(Integer.parseInt(req.getParameter("idSupplierUp")));
            deliveriesEntity.setProduct(new ProductDao().getProductsEntityById(deliveriesEntity.getIdProduct()));
            deliveriesEntity.setSuppliers(new SuppliersDao().getSupplierById(deliveriesEntity.getIdSupplier()));
            deliveriesDao.update(deliveriesEntity);
            deliveries = new DeliveriesDao().getAllDelivers();
        }
        else if (req.getParameter("deleteButton")!=null){
            DeliveriesEntity deliveriesEntity = deliveriesDao.getDeliveryById(Integer.parseInt(req.getParameter("idDel")));
            deliveriesDao.delete(deliveriesEntity);
            deliveries = new DeliveriesDao().getAllDelivers();
        }
        else if (req.getParameter("productName")!=null){
            if(req.getParameter("productName").equals("none")){
                deliveries = new DeliveriesDao().getAllDelivers();
            }
            else {
                deliveries = new DeliveriesDao().getAllDelivers();
                DeliveriesEntity deliverySel = new DeliveriesEntity();
                for (DeliveriesEntity delivery : deliveries) {
                    if (delivery.getProduct().getProductName().equals(req.getParameter("productName"))) {
                        deliverySel = delivery;
                        break;
                    }
                }
                deliveries = new DeliveriesDao().getDeliveriesByProduct(deliverySel.getProduct());
            }
        }
        else if (req.getParameter("supplierAddress")!=null){
            if(req.getParameter("supplierAddress").equals("none")){
                deliveries = new DeliveriesDao().getAllDelivers();
            }
            else {
                deliveries = new DeliveriesDao().getAllDelivers();
                DeliveriesEntity deliverySel = new DeliveriesEntity();
                for (DeliveriesEntity delivery : deliveries) {
                    if (delivery.getSuppliers().getSupplierAddress().equals(req.getParameter("supplierAddress"))) {
                        deliverySel = delivery;
                        break;
                    }
                }
                deliveries = new DeliveriesDao().getDeliveriesBySupplier(deliverySel.getSuppliers());
            }
        }
        req.setAttribute("products", products);
        req.setAttribute("suppliers", suppliers);
        req.setAttribute("Table", deliveries);
        getServletContext().getRequestDispatcher("/Deliveries.jsp").forward(req, resp);
    }
}
