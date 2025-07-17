package model;

import model.enumerador.TypeElectronicProduct;

public class Accessory extends ElectronicProduct {
    private String connectionType;
    private String compatibility;

    public Accessory() {
    }


    public Accessory(String name, String brand, double price, int stock, TypeElectronicProduct type, String connectionType, String compatibility) {
        super(name, brand, price, stock, type);
        this.connectionType = connectionType;
        this.compatibility = compatibility;
    }


    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    public String getCompatibility() {
        return compatibility;
    }

    public void setCompatibility(String compatibility) {
        this.compatibility = compatibility;
    }

    @Override
    public String toString() {
        return "Accessory{" +
                "connectionType='" + connectionType + '\'' +
                ", compatibility='" + compatibility + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", type=" + type +
                "} ";
    }
}
