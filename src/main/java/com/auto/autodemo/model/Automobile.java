package com.auto.autodemo.model;

import javax.persistence.*;

@Entity
@Table(name="automobiles")
public class Automobile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "model")
    private String model;

    @Column(name = "top_speed")
    private int top_speed;

    @Column(name = "cost")
    private int cost;

    public Automobile(Long id, String model, int top_speed, int cost) {
        this.id = id;
        this.model = model;
        this.top_speed = top_speed;
        this.cost = cost;
    }

    public Automobile () {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTop_speed() {
        return top_speed;
    }

    public void setTop_speed(int top_speed) {
        this.top_speed = top_speed;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }


}
