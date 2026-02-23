package co.edu.uptc.presenter;

import java.util.ArrayList;

import co.edu.uptc.interfaces.ModelInterface;
import co.edu.uptc.interfaces.PresenterInterface;
import co.edu.uptc.interfaces.ViewInterface;
import co.edu.uptc.model.Product;

public class MainPresenter implements PresenterInterface {
    private ViewInterface view;
    private ModelInterface model;

    public void SumPresenter(ViewInterface view, ModelInterface model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void setView(ViewInterface view) {
        this.view = view;
    }

    @Override
    public void setModel(ModelInterface model) {
        this.model = model;
    }

    @Override
    public void addProduct(String description, String price, String unit) {

        try {
            if (description == null || description.trim().isEmpty() || price == null || price.trim().isEmpty()
                    || unit == null || unit.trim().isEmpty()) {
                view.showError(" no pueden estar vacíos.");
                return;
            }

            model.addProduct(description, price, unit);
            view.showMessage(
                    "Producto agregada exitosamente: " + description + " Precio: " + price + "Unidades" + unit);

        } catch (Exception e) {
            view.showError("Error al agregar el producto: " + e.getMessage());
        }
        /*
         * ArrayList<Product> listProduct = new ArrayList();
         * Product product1 = new Product();
         * product1.setdescription(description);
         * product1.setprice(price);
         * listProduct.add(product1);
         * 
         */
    }

    @Override
    public void showProduct() {
        try {
            model.showProduct();
        } catch (Exception e) {
            view.showError(e.getMessage());
        }
    }

    @Override
    public void sortByDescription() {
        try {
            model.sortByDescription();
        } catch (Exception e) {
            view.showError(e.getMessage());
        }
    }

    @Override
    public void sortByLastName() {
        try {
            model.sortByDescription();
        } catch (Exception e) {
            view.showError(e.getMessage());
        }
    }

    @Override
    public void removeProduct(String description) {
        try {
            model.removeProduct(description);
            view.showMessage("Producto eliminado exitosamente: " + description);
        } catch (Exception e) {
            view.showError("Error al eliminar el producto: " + e.getMessage());
        }
    }

}