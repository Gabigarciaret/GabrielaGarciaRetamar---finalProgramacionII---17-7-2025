package model;

import model.exception.ProductNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Inventory <T extends ElectronicProduct> {

    List<T> inventory;

    public Inventory() {
        this.inventory = new ArrayList<>();

    }

    public Inventory(List<T> inventory) {
        this.inventory = new ArrayList<>();
    }

    public List<T> getInventory() {
        return inventory;
    }

    public void setInventory(List<T> inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return inventory.toString();
    }


    //funcionalidades

    public void add(T product) {

        inventory.add(product);
    }

    public T getByName (String name) throws ProductNotFoundException {

        if (name == null) {

            throw new ProductNotFoundException("El nombre del producto no puede ser nulo");

        }


        for (T product : inventory) {

           if (product.getName().equalsIgnoreCase(name)) {

               return product;
           }

        }


        throw new ProductNotFoundException("No se encontro el producto con el nombre: " + name);
    }



    public List <T> getAll (){

        return inventory;

    }


    public void deleteByName (String name) throws ProductNotFoundException {

        if (name == null) {

            throw new ProductNotFoundException("El nombre del producto no puede ser nulo");

        }


        for (T product : inventory) {

            if (product.getName().equalsIgnoreCase(name)) {

                inventory.remove(product);

                System.out.println("Se ha eliminado el producto con el nombre: " + name);

                return;

            }
        }

        throw new ProductNotFoundException("No se encontro el producto con el nombre: " + name);
    }
}
