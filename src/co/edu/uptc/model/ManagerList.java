package co.edu.uptc.model;

import java.util.ArrayList;

public class ManagerList {
    Node header = null;
    ArrayList<People> listPeople = new ArrayList();

    private Node createNode(String value){
        return new Node(value);
    }

    private Node returnlastNode(){
        Node last = header;
        while(last.sig != null){
            last = last.sig;
        }
        return last;
    }
    public void addInicio(String value){
        Node aux = new Node(value);
        if(header == null){
            header = aux;
        }else{
            aux.sig = header;
        }
    }

    public void conectarNodoAlFinal(String value){
        Node aux = new Node(value);
        if(header == null){
            header = aux;
        }else{
            Node last = returnlastNode();
            last.sig = aux;
        }
    }
    public void addEnd(String value){
        Node aux = new Node(value);
        //conectarNodoAlFinal(value);
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
            System.out.println(aux.value + " " + aux.value.length());
            aux = aux.sig;
        }
        
    }

    public void addPeople(People people) {
        listPeople.add(people);
    }

    public void showPeople() {
        for (People p : listPeople) {
            System.out.println(p);
        }
    }

    public void sortByName() {
        listPeople.sort((p1, p2) -> p1.getName().compareToIgnoreCase(p2.getName()));
    }

    public void sortByLastName() {
        listPeople.sort((p1, p2) -> p1.getLastName().compareToIgnoreCase(p2.getLastName()));
    }

    
}
