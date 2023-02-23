package com.example.webApp1.Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "suppliers", schema = "productmarket")
public class SuppliersEntity {
    private int id;
    private String supplierAddress;

    private Set<DeliveriesEntity> product = new HashSet<>();

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "supplierAddress", nullable = true, length = 30)
    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    @OneToMany(mappedBy = "suppliers")
    public Set<DeliveriesEntity> getProduct() {
        return product;
    }

    public void setProduct(Set<DeliveriesEntity> product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SuppliersEntity that = (SuppliersEntity) o;

        if (id != that.id) return false;
        return Objects.equals(supplierAddress, that.supplierAddress);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (supplierAddress != null ? supplierAddress.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", supplierAddress='" + supplierAddress;
    }
}
