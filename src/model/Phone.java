package model;

import model.enumerador.TypeElectronicProduct;

public class Phone extends ElectronicProduct{

    private String operatingSystem;
    private String storageCapacity;
    private String screenSize;

    public Phone() {
    }

    public Phone(String name, String brand, double price, int stock, TypeElectronicProduct type, String operatingSystem, String storageCapacity, String screenSize) {
        super(name, brand, price, stock, type);
        this.operatingSystem = operatingSystem;
        this.storageCapacity = storageCapacity;
        this.screenSize = screenSize;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(String storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "operatingSystem='" + operatingSystem + '\'' +
                ", storageCapacity=" + storageCapacity +
                ", screenSize=" + screenSize +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", type=" + type +
                "} ";
    }
}
