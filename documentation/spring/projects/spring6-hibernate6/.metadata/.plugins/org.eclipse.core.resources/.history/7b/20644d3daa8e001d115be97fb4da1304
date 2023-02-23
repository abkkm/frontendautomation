package com.example.webApp1.Entity;

import javax.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "deliveries", schema = "productmarket")
public class DeliveriesEntity {
    private int id;
    private Integer idProduct;
    private Integer idSupplier;
    private Date deliveryDate;
    private Integer deliveryAmount;

    private SuppliersEntity suppliers;

    private ProductsEntity product;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "idProduct", nullable = true)
    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    @Basic
    @Column(name = "idSupplier", nullable = true)
    public Integer getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(Integer idSupplier) {
        this.idSupplier = idSupplier;
    }

    @Basic
    @Column(name = "deliveryDate", nullable = true)
    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Basic
    @Column(name = "deliveryAmount", nullable = true)
    public Integer getDeliveryAmount() {
        return deliveryAmount;
    }

    public void setDeliveryAmount(Integer deliveryAmount) {
        this.deliveryAmount = deliveryAmount;
    }

    @ManyToOne
    @PrimaryKeyJoinColumn(name="idProduct",referencedColumnName = "id")
    public ProductsEntity getProduct() {
        return product;
    }

    public void setProduct(ProductsEntity product) {
        this.product = product;
    }


    @ManyToOne
    @PrimaryKeyJoinColumn(name="idSupplier",referencedColumnName = "id")
    public SuppliersEntity getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(SuppliersEntity suppliers) {
        this.suppliers = suppliers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeliveriesEntity that = (DeliveriesEntity) o;

        if (id != that.id) return false;
        if (!Objects.equals(idProduct, that.idProduct)) return false;
        if (!Objects.equals(idSupplier, that.idSupplier)) return false;
        if (!Objects.equals(deliveryDate, that.deliveryDate)) return false;
        return Objects.equals(deliveryAmount, that.deliveryAmount);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (idProduct != null ? idProduct.hashCode() : 0);
        result = 31 * result + (idSupplier != null ? idSupplier.hashCode() : 0);
        result = 31 * result + (deliveryDate != null ? deliveryDate.hashCode() : 0);
        result = 31 * result + (deliveryAmount != null ? deliveryAmount.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "DeliveriesEntity{" +
                "id=" + id +
                ", idProduct=" + idProduct +
                ", idSupplier=" + idSupplier +
                ", deliveryDate=" + deliveryDate +
                ", deliveryAmount=" + deliveryAmount +
                ", suppliers=" + suppliers +
                ", product=" + product +
                '}';
    }
}
