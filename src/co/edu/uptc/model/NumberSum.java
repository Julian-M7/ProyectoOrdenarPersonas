package co.edu.uptc.model;

import co.edu.uptc.interfaces.ModelInterface;
import co.edu.uptc.interfaces.PresenterInterface;

public class NumberSum implements ModelInterface {
    private ManagerList manager;

    public NumberSum() {
        this.manager = new ManagerList();
    }
    
    @Override
    public void addProduct(String description, String price, String unit) throws Exception {
        Product product = new Product();
        product.setDescription(description);
        product.setPrice(price);
        product.setUnit(unit);
        manager.addProduct(product);
    }
    @Override
    public void showProduct() throws Exception {
        manager.showProduct();
    }
    @Override
    public void sortByName() throws Exception {
         manager.sortByDescription();
    }
    @Override
    public void sortByDescription() throws Exception {
         manager.sortByDescription();
    }

}
