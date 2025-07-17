package model;

import model.enumerador.TypeElectronicProduct;

public class Computer extends ElectronicProduct{

    private String processor;
    private String ram;
    private String storage;

    public Computer() {
    }
    public Computer(String name, String brand, double price, int stock, TypeElectronicProduct type, String processor, String ram, String storage) {
        super(name, brand, price, stock, type);
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", type=" + type +
                "} ";
    }
}
