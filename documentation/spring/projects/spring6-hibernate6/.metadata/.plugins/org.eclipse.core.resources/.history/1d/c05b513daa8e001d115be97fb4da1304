package com.example.webApp1.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "market", schema = "productmarket")
public class MarketEntity {
    private int id;
    private Integer marketAmount;

    private ProductsEntity productMarket;

    public MarketEntity(Integer marketAmount, ProductsEntity productMarket) {
        this.marketAmount = marketAmount;
        this.productMarket = productMarket;
    }

    public MarketEntity() {

    }

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "marketAmount", nullable = true)
    public Integer getMarketAmount() {
        return marketAmount;
    }

    public void setMarketAmount(Integer marketAmount) {
        this.marketAmount = marketAmount;
    }


    @ManyToOne
    @JoinColumn(name="idProduct")
    public ProductsEntity getProductMarket() {
        return productMarket;
    }

    public void setProductMarket(ProductsEntity productMarket) {
        this.productMarket = productMarket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MarketEntity that = (MarketEntity) o;

        if (id != that.id) return false;
        if (!Objects.equals(marketAmount, that.marketAmount)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (marketAmount != null ? marketAmount.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MarketEntity{" +
                "id=" + id +
                ", marketAmount=" + marketAmount +
                ", productMarket=" + productMarket +
                '}';
    }
}
