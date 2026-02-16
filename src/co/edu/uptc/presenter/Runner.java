package co.edu.uptc.presenter;

import co.edu.uptc.interfaces.ModelInterface;
import co.edu.uptc.interfaces.PresenterInterface;
import co.edu.uptc.interfaces.ViewInterface;
import co.edu.uptc.model.NumberSum;
import co.edu.uptc.view.ConsoleView2;

public class Runner {
    PresenterInterface presenter;
    ModelInterface model;
    ViewInterface view;


    private void makeMVP(){
        presenter = new MainPresenter();
        model = new NumberSum();
        view = new ConsoleView2();

        presenter.setModel(model);
        presenter.setView(view);
        view.setPresenter(presenter);
    }

    public void start(){
        makeMVP();
        view.start();
    }

}
