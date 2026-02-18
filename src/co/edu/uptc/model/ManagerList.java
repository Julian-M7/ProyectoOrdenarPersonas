package co.edu.uptc.model;

import java.util.ArrayList;
import java.util.LinkedList;

public class ManagerList {
    Node header = null;
    LinkedList<Product> listProduct = new LinkedList<>();

    private Node createNode(Product product){
        return new Node(product);
    }

    private Node returnlastNode(){
        Node last = header;
        while(last.sig != null){
            last = last.sig;
        }
        return last;
    }
    public void addInicio(Product product){
        Node aux = new Node(product);
        if(header == null){
            header = aux;
        }else{
            aux.sig = header;
        }
    }

    public void conectarNodoAlFinal(Product product){
        Node aux = new Node(product);
        if(header == null){
            header = aux;
        }else{
            Node last = returnlastNode();
            last.sig = aux;
        }
    }
    public void addEnd(Product product){
        Node aux = new Node(product);
        //conectarNodoAlFinal(product);
        if(header == null){
            header = aux;
        }else{
            Node last = returnlastNode();
            last.sig = aux;
        }
    }

    public void showList(){
        Node aux = header;
        while(aux != null){
            System.out.println(aux.product);
            aux = aux.sig;
        }
        
    }

    public void addProduct(Product product) {
        listProduct.addLast(product);
    }

    public void showProduct() {
        for (Product p : listProduct) {
            System.out.println(p);
        }
    }

    public void sortByDesgetDescription() {
        listProduct.sort((p1, p2) -> p1.getDescription().compareToIgnoreCase(p2.getDescription()));
    }

    public void sortByName() {
        listProduct.sort((p1, p2) -> p1.getDescription().compareToIgnoreCase(p2.getDescription()));
    }

    
}
