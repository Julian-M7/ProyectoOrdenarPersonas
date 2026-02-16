package co.edu.uptc.model;

import co.edu.uptc.interfaces.ModelInterface;
import co.edu.uptc.interfaces.PresenterInterface;

public class NumberSum implements ModelInterface {
    private ManagerList manager;

    public NumberSum() {
        this.manager = new ManagerList();
    }
    
    @Override
    public void addPeople(String name, String lastName) throws Exception {
        People people = new People();
        people.setName(name);
        people.setLastName(lastName);
        manager.addPeople(people);
    }
    @Override
    public void showPeople() throws Exception {
        manager.showPeople();
    }
    @Override
    public void sortByName() throws Exception {
         manager.sortByName();
    }
    @Override
    public void sortByLastName() throws Exception {
         manager.sortByLastName();
    }

}
