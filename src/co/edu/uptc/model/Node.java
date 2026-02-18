package co.edu.uptc.model;

public class Node {
    Product product;
    Node sig;

    public Node(Product product){
        this.product = product;
    }
    public void addInicio(Product product){
        Node aux = new Node(product);
        if(sig == null){
            sig = aux;
        }else{
            aux.sig = sig;
        }
    }
}
