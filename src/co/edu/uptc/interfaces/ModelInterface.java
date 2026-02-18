package co.edu.uptc.interfaces;

public interface ModelInterface {
    void addProduct(String description, String price, String unit) throws Exception;
    void showProduct() throws Exception;
    void sortByDescription() throws Exception;
    void sortByName() throws Exception;
}
