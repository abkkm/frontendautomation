package com.example.webApp1.Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "products", schema = "productmarket")
public class ProductsEntity {

    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Basic
    @Column(name = "productName", length = 30)
    private String productName;

    @ManyToOne
    @JoinColumn(name="idCategory",referencedColumnName ="id")
    private CategoryEntity category;

    @OneToMany(mappedBy = "productMarket",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<MarketEntity> market;

    @OneToMany(mappedBy = "product")
    private Set<DeliveriesEntity> suppliers = new HashSet<>();

    @OneToMany(mappedBy = "productSales")
    private Set<SalesEntity> customerSales = new HashSet<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public List<MarketEntity> getMarket() {
        return market;
    }

    public void setMarket(List<MarketEntity> market) {
        this.market = market;
    }

    public Set<DeliveriesEntity> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(Set<DeliveriesEntity> suppliers) {
        this.suppliers = suppliers;
    }

    public Set<SalesEntity> getCustomerSales() {
        return customerSales;
    }

    public void setCustomerSales(Set<SalesEntity> customerSales) {
        this.customerSales = customerSales;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductsEntity that = (ProductsEntity) o;

        if (id != that.id) return false;
        return Objects.equals(productName, that.productName);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return " name='" + productName + '\'' ;
    }
}
