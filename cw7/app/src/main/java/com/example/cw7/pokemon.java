package com.example.cw7;

public class pokemon {

    public String name;
    public Integer image;
    public Integer attack;
    public Integer defence;
    public Integer total;

    public pokemon(String name, Integer image, Integer attack, Integer defence, Integer total) {
        this.name = name;
        this.image = image;
        this.attack = attack;
        this.defence = defence;
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDefence() {
        return defence;
    }

    public void setDefence(Integer defence) {
        this.defence = defence;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
