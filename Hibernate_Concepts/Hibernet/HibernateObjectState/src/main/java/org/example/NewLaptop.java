package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class NewLaptop {
    @Id
    private int lid;
    private String lBrand;
    private int lPrice;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getlBrand() {
        return lBrand;
    }

    public void setlBrand(String lBrand) {
        this.lBrand = lBrand;
    }

    public int getlPrice() {
        return lPrice;
    }

    public void setlPrice(int lPrice) {
        this.lPrice = lPrice;
    }

    @Override
    public String toString() {
        return "NewLaptop{" +
                "lid=" + lid +
                ", lBrand='" + lBrand + '\'' +
                ", lPrice=" + lPrice +
                '}';
    }
}
