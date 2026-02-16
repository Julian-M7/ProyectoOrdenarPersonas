package co.edu.uptc.interfaces;

public interface ModelInterface {
    void addPeople(String name, String lastName) throws Exception;
    void showPeople() throws Exception;
    void sortByName() throws Exception;
    void sortByLastName() throws Exception;
}
