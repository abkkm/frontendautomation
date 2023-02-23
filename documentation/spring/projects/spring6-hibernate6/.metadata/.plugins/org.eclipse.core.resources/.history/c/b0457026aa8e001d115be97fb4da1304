package com.example.webApp1.Entity;

import javax.persistence.*;
import java.beans.ParameterDescriptor;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "category", schema = "productmarket")
public class CategoryEntity {

    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Basic
    @Column(name = "categoryName", nullable = true, length = 30)
    private String categoryName;

    @OneToMany(mappedBy = "category")
    private final Set<ProductsEntity> products =new HashSet<>();

    public CategoryEntity(){}

    public CategoryEntity(String categoryName) {
        this.categoryName = categoryName;
    }

    public CategoryEntity(int id, String categoryName) {
        this.id = id;
        this.categoryName = categoryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Set<ProductsEntity> getProducts() {
        return products;
    }

    public void setProducts(ProductsEntity product) {
        this.products.add(product);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CategoryEntity that = (CategoryEntity) o;

        if (id != that.id) return false;
        return Objects.equals(categoryName, that.categoryName);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (categoryName != null ? categoryName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CategoryEntity{" +
                "id=" + id +
                ", categoryName='" + categoryName + '\'' +
                ", products=" + products +
                '}';
    }
}
