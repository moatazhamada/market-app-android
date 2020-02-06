package com.bit68.marketapp.data.models;

public class Product {

    private String price;

    private String name;

    private String weight;

    private String id;

    private String product_img;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProduct_img() {
        return product_img;
    }

    public void setProduct_img(String product_img) {
        this.product_img = product_img;
    }

    @Override
    public String toString() {
        return "ClassPojo [price = " + price + ", name = " + name + ", weight = " + weight + ", id = " + id + ", product_img = " + product_img + "]";
    }
}
