package co.edu.uptc.interfaces;

public interface PresenterInterface {
    public void setView(ViewInterface view);
    public void setModel(ModelInterface model);
    void addProduct(String description, String price, String unit);
    void showProduct();
    void sortByDescription();
    void sortByLastName();

}
