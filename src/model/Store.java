package model;

import model.exception.ProductNotAvailableException;

import java.util.List;

public class Store {
    private String name;
    private Inventory <ElectronicProduct> inventory;

    public Store() {
    }

    public Store(String name, Inventory<ElectronicProduct> inventory) {
        this.name = name;
        this.inventory = new Inventory<ElectronicProduct>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventory<ElectronicProduct> getInventory() {
        return inventory;
    }

    public void setInventory(Inventory<ElectronicProduct> inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", inventory=" + inventory +
                '}';
    }


    //metodo Buy

    public void buyByName(int quantity, String name) throws ProductNotAvailableException {

        if (quantity <= 0) {

            throw new ProductNotAvailableException("La cantidad a comprar debe ser mayor a 0");
        }


        ElectronicProduct product = inventory.getByName(name);

        if (product.getStock() >= quantity) {

            product.setStock(product.getStock() - quantity);
            System.out.println("Se ha comprado " + quantity + " unidades de " + product.getName() + " stock actual: " + product.getStock());

        }else {

            throw new ProductNotAvailableException("No hay stock suficiente para la cantidad solicitada, "+ product.getName() + " solo tiene " + product.getStock()+ " unidades disponibles");

        }


    }


    public void add (ElectronicProduct product){

        inventory.add(product);

        System.out.println("Se ha agregado el producto: " + product.getName());
    }


    public ElectronicProduct getProductByName (String name) throws ProductNotAvailableException {

         return inventory.getByName(name);


    }


    public List <ElectronicProduct> getAllProducts (){

        System.out.println("Lista de productos: ");

        List <ElectronicProduct> products = inventory.getAll();

         return products;
    }


    public void deleteByName (String name) throws ProductNotAvailableException {

        inventory.deleteByName(name);

    }



}
