package co.edu.uptc.view;
import co.edu.uptc.interfaces.PresenterInterface;
import co.edu.uptc.interfaces.ViewInterface;

import java.util.Scanner;



public class ConsoleView2 implements ViewInterface {
    private PresenterInterface presenter;
    private Scanner scanner;
    private boolean isRunning;

    public ConsoleView2() {
        this.scanner = new Scanner(System.in);
        this.isRunning = true;
    }



    @Override
    public void setPresenter(PresenterInterface presenter) {
        this.presenter = presenter;
    }

    
    @Override
    public void showError(String message) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showError'");
    }


        @Override
    public void start() {
        System.out.println("===  SISTEMA DE GESTIÓN DE PERSONAS  ===");

        while (isRunning) {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Añadir producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Ordenar por descripcion");
            System.out.println("4. Ordenar por precio");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            
            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    readInfo();
                    break;
                case "2":
                    presenter.showProduct();
                    break;
                case "3":
                    presenter.sortByDescription();
                    break;
                case "4":
                    presenter.sortByLastName();
                    break;
                case "5":
                    isRunning = false;
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }

    private void readInfo() {
        System.out.print("Ingrese la descripcion: ");
        String n1 = scanner.nextLine();

        System.out.print("Ingrese el precio: ");
        String n2 = scanner.nextLine();

        System.out.print("Ingrese las unidades: ");
        String n3 = scanner.nextLine();

        presenter.addProduct(n1, n2, n3);
    }
    /* 
    @Override
    public void start() {
        System.out.println("===  SISTEMA  ===");

        while (isRunning) {
            System.out.println("\nEscriba 'salir' para finalizar o presione Enter para Continuar:");
            String option = scanner.nextLine();

            if (option.equalsIgnoreCase("salir")) {
                isRunning = false;
                System.out.println("Saliendo del programa...");
            } else {
                readInfo();
            }
        }
    }
*/
    

    @Override
    public void showMessage(String message) {
        System.out.println("--------------------------------");
        System.out.println(message);
        System.out.println("--------------------------------");
    }
}
