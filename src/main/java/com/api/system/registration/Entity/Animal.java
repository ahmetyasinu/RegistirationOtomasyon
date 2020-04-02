package com.api.system.registration.Entity;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "animal")
public class Animal implements Serializable {

    @Id
    @Column(name = "s_no")
    private Integer sNo;
    @Column(name = "id")
    private Integer id;
    @Column(name = "live_weight")
    private Integer liveWeight;
    @Column(name = "price")
    private Integer price;
    @Column(name = "date")
    private String date;
    @Column(name="animal_no")
    private Integer animalNo;

    public Animal() {
    }

    public Animal(Integer sNo,  Integer id, Integer liveWeight, Integer price, String date,Integer animalNo) {
        this.sNo = sNo;
        this.id = id;
        this.liveWeight = liveWeight;
        this.price = price;
        this.date = date;
        this.animalNo = animalNo;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer cutNo) {
        this.id = id;
    }

    public Integer getLiveWeight() {
        return liveWeight;
    }

    public void setLiveWeight(Integer liveWeight) {
        this.liveWeight = liveWeight;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getsNo() {
        return sNo;
    }

    public void setsNo(Integer sNo) {
        this.sNo = sNo;
    }

    public Integer getAnimalNo() {
        return animalNo;
    }

    public void setAnimalNo(Integer animalNo) {
        this.animalNo = animalNo;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "sNo=" + sNo +
                ", id=" + id +
                ", liveWeight=" + liveWeight +
                ", price=" + price +
                ", date='" + date + '\'' +
                ", animalNo=" + animalNo +
                '}';
    }
}
