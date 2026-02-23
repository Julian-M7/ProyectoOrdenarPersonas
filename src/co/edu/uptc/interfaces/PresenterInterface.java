package co.edu.uptc.interfaces;

public interface PresenterInterface {
    public void setView(ViewInterface view);
    public void setModel(ModelInterface model);
    void addProduct(String description, Double price, String unit);
    void showProduct();
    void sortByDescription();
    void sortByLastName();
    void removeProduct(String description);
}
