package co.edu.uptc.interfaces;

public interface ViewInterface {
    void setPresenter(PresenterInterface presenter);
    void showError(String message);
    void start();
    void showMessage(String message);
}
