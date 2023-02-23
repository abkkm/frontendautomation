package com.example.webApp1.Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "customers", schema = "productmarket")
public class CustomersEntity {

    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Basic
    @Column(name = "userLogin", nullable = true, length = 30)
    private String userLogin;

    @Basic
    @Column(name = "userPassword", nullable = true, length = 30)
    private String userPassword;

    @Basic
    @Column(name = "userEmail", nullable = true, length = 30)
    private String userEmail;

    @OneToMany(mappedBy = "customerSales")
    private final Set<SalesEntity> productSales = new HashSet<>();

    public CustomersEntity() { }

    public CustomersEntity(String userLogin, String userPassword, String userEmail) {
        this.userLogin = userLogin;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomersEntity that = (CustomersEntity) o;

        if (id != that.id) return false;
        if (userLogin != null ? !userLogin.equals(that.userLogin) : that.userLogin != null) return false;
        if (userPassword != null ? !userPassword.equals(that.userPassword) : that.userPassword != null) return false;
        if (userEmail != null ? !userEmail.equals(that.userEmail) : that.userEmail != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userLogin != null ? userLogin.hashCode() : 0);
        result = 31 * result + (userPassword != null ? userPassword.hashCode() : 0);
        result = 31 * result + (userEmail != null ? userEmail.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CustomersEntity{" +
                "id=" + id +
                ", userLogin='" + userLogin + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userEmail='" + userEmail + '\'' +
                '}';
    }
}
