package org.example;

import jakarta.persistence.*;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Cache;


@Entity(name = "NewAlien_table")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class New_Alien {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int aid;

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

