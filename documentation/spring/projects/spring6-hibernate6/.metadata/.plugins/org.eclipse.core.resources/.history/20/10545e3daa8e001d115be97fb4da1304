package com.example.webApp1.Entity;

import javax.persistence.*;

@Entity
@Table(name = "sales", schema = "productmarket")
public class SalesEntity {
    private int id;
    private Integer amount;

    private ProductsEntity productSales;

    private CustomersEntity customerSales;


    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "amount")
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @ManyToOne
    @PrimaryKeyJoinColumn(name = "idCustomer",referencedColumnName = "id")
    public CustomersEntity getCustomerSales() {
        return customerSales;
    }

    public void setCustomerSales(CustomersEntity customerSales) {
        this.customerSales = customerSales;
    }


    @ManyToOne
    @PrimaryKeyJoinColumn(name = "idProduct",referencedColumnName = "id")
    public ProductsEntity getProductSales() {
        return productSales;
    }

    public void setProductSales(ProductsEntity productSales) {
        this.productSales = productSales;
    }

    @Override
    public boolean equals(Object o) {
        return this == o;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SalesEntity{" +
                "id=" + id +
                ", amount=" + amount +
                ", productSales=" + productSales +
                ", customerSales=" + customerSales +
                '}';
    }
}
