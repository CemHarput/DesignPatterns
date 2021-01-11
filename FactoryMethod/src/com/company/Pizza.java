package com.company;

public class Pizza implements Food {
    private String name;
    private int price;
    private int type;

    public Pizza(String name, int price, int type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public void calculation() {

        if(type==0){
         this.price=this.price+10;

        }
        if(type==1){
            this.price=this.price+20;
        }
    }
}
