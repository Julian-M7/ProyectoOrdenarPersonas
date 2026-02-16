package co.edu.uptc.model;

public class Node {
    String value;
    Node sig;

    public Node(String value){
        this.value = value;
    }
    public void addInicio(String value){
        Node aux = new Node(value);
        if(sig == null){
            sig = aux;
        }else{
            aux.sig = sig;
        }
    }
}
