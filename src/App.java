import manejoJson.ManejoJson;
import model.*;
import model.enumerador.TypeElectronicProduct;
import org.json.JSONException;

public class App {
    public static void main(String[] args) throws JSONException {


        Inventory < ElectronicProduct> inventory = new Inventory<>();


        inventory.add(new Phone("Alcatel 8", "Alcatel", 456.89,4,TypeElectronicProduct.PHONE, "Core", "126 gb", "12 pulgadas"));
        inventory.add(new Computer("HP 2.1", "HP", 12895.40, 79, TypeElectronicProduct.COMPUTER, "Intel", "16 gb", "15.6 inch"));
        inventory.add(new Accessory("Mouse", "Logitech", 80456, 90, TypeElectronicProduct.ACCESSORY, "USB", "2.0" ));
        inventory.add(new Accessory("Teclado", "Bangho", 234.69, 3, TypeElectronicProduct.ACCESSORY, "USB", "2.0" ));
        inventory.add(new Phone("Samsung A32", "Samsung", 123456.80, 1, TypeElectronicProduct.PHONE, "Corei2", "126 gb", "12 pulgadas"));
        inventory.add(new Computer("Dell 15", "Dell", 567890, 34, TypeElectronicProduct.COMPUTER, "Intel", "16 gb", "15.6 inch"));

        Store store = new Store("Tienda de Electronicos", inventory);

        store.setInventory(inventory);

//        System.out.println(store.getAllProducts());
//        System.out.println(store.getProductByName("Samsung A32"));
//        System.out.println(store.getProductByName("Samsung A34"));
//        store.deleteByName("Dell 15");
//        System.out.println(store.getAllProducts());
//          store.buyByName(0, "Samsung A32");
//        store.buyByName(4, "Samsung A32");
//        store.buyByName(1, "Samsung A32");

        //ManejoJson.StoreToJson(store);






    }
}
