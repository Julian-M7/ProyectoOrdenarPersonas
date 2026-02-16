package co.edu.uptc.presenter;

import java.util.ArrayList;

import co.edu.uptc.interfaces.ModelInterface;
import co.edu.uptc.interfaces.PresenterInterface;
import co.edu.uptc.interfaces.ViewInterface;
import co.edu.uptc.model.People;

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
    public void addPeople(String name, String lastName) {

        try {
            if (name == null || name.trim().isEmpty() || lastName == null || lastName.trim().isEmpty()) {
                view.showError("El nombre y apellido no pueden estar vacíos.");
                return;
            }
            
            model.addPeople(name, lastName);
            view.showMessage("Persona agregada exitosamente: " + name + " " + lastName);
            
        } catch (Exception e) {
            view.showError("Error al agregar persona: " + e.getMessage());
        }
        /* 
        ArrayList<People> listPeople = new ArrayList();
        People people1 = new People();
        people1.setName(name);
        people1.setLastName(lastName);
        listPeople.add(people1);

        */
    }

        @Override
    public void showPeople() {
        try {
            model.showPeople();
        } catch (Exception e) {
            view.showError(e.getMessage());
        }
    }

    @Override
    public void sortByName() {
        try {
            model.sortByName();
        } catch (Exception e) {
            view.showError(e.getMessage());
        }
    }

    @Override
    public void sortByLastName() {
        try {
            model.sortByLastName();
        } catch (Exception e) {
            view.showError(e.getMessage());
        }
    }
}