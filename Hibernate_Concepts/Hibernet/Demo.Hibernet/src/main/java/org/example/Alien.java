package org.example;

import jakarta.persistence.*;

//The @Entity annotation is used to mark a class as a persistent entity in the Java Persistence API (JPA).
@Entity(name = "aliens_table")
public class Alien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int aid;

    @Transient
    private String name;

    @Column(name="alien_color") //it helps to change the column name
    private String color;

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
