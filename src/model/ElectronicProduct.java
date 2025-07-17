package model;

import model.enumerador.TypeElectronicProduct;

public abstract class ElectronicProduct {
    protected String name;
    protected String brand;
    protected double price;
    protected int stock;
    protected TypeElectronicProduct type;

    public ElectronicProduct() {
    }

    public ElectronicProduct(String name, String brand, double price, int stock, TypeElectronicProduct type) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.stock = stock;
        this.type = type;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public TypeElectronicProduct getType() {
        return type;
    }

    public void setType(TypeElectronicProduct type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ElectronicProduct{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", type=" + type +
                '}';
    }
}
