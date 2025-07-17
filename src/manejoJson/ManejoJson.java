package manejoJson;

import model.*;
import model.enumerador.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ManejoJson {


    public static JSONObject StoreToJson (Store store) throws JSONException {

        JSONObject storeJson = new JSONObject();

        storeJson.put("name", store.getName());
        storeJson.put("inventory", inventoryToJson(store.getInventory()));

        JSONUtiles.engrave(storeJson);

        return storeJson;

    }

    public static JSONArray inventoryToJson (Inventory<ElectronicProduct> inventory) throws JSONException {

        JSONArray jInventory = new JSONArray();

        for (ElectronicProduct product : inventory.getInventory()) {

            jInventory.put(ProductToJson(product));
        }


        return jInventory;
    }


    public static JSONObject ProductToJson (ElectronicProduct product) throws JSONException {

        JSONObject productJson = new JSONObject();

        productJson.put("name", product.getName());
        productJson.put("brand", product.getBrand());
        productJson.put("price", product.getPrice());
        productJson.put("stock", product.getStock());

        if (product instanceof Accessory) {

            Accessory accesory = (Accessory) product;


            productJson.put("connectionType", accesory.getConnectionType());
            productJson.put("compatibility", accesory.getCompatibility());

          } else if (product instanceof Computer) {

            Computer computer = (Computer) product;

            productJson.put ("processor", computer.getProcessor());
            productJson.put("ram", computer.getRam());
            productJson.put("storage", computer.getStorage());


        } else {

            Phone phone = (Phone) product;

            productJson.put("operatingSystem", phone.getOperatingSystem());
            productJson.put ("storageCapacity", phone.getStorageCapacity());
            productJson.put ("screenSize", phone.getScreenSize());


        }


        return productJson;
    }





    }










