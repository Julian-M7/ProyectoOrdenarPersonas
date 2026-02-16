package co.edu.uptc.interfaces;

public interface PresenterInterface {
    public void setView(ViewInterface view);
    public void setModel(ModelInterface model);
    void addPeople(String name, String lastName);
    void showPeople();
    void sortByName();
    void sortByLastName();

}
