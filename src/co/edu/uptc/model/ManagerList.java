package co.edu.uptc.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ManagerList implements Collection {
    Node header = null;
    ArrayList<Product> listProduct = new ArrayList<>();
    // Node product;

    private Node createNode(Product product) {
        return new Node(product);
    }

    private Node returnlastNode() {
        Node last = header;
        while (last.sig != null) {
            last = last.sig;
        }
        return last;
    }

    public void addInicio(Product product) {
        Node aux = new Node(product);
        if (header == null) {
            header = aux;
        } else {
            aux.sig = header;
        }
    }

    public void conectarNodoAlFinal(Product product) {
        Node aux = new Node(product);
        if (header == null) {
            header = aux;
        } else {
            Node last = returnlastNode();
            last.sig = aux;
        }
    }

    private void rebuildListFromArray() {
        header = null;
        for (Product p : listProduct) {
            Node aux = new Node(p);
            if (header == null) {
                header = aux;
            } else {
                Node last = returnlastNode();
                last.sig = aux;
            }
        }
    }

    public void addEnd(Product product) {
        Node aux = new Node(product);
        // conectarNodoAlFinal(product);
        if (header == null) {
            header = aux;
        } else {
            Node last = returnlastNode();
            last.sig = aux;
        }
        listProduct.add(product);
    }

    public void showList() {
        Node aux = header;
        while (aux != null) {
            System.out.println(aux.product);
            aux = aux.sig;
        }
    }

    public void addProduct(Product product) {
        // listProduct.addLast(product);
        addEnd(product);
    }

    public void showProduct() {
        // for (Product p : listProduct) {
        // System.out.println(p);
        // }
        showList();
    }

    public void sortByDescription() {
        // listProduct.sort((p1, p2) ->
        // p1.getDescription().compareToIgnoreCase(p2.getDescription()));
        Collections.sort(listProduct, (p1, p2) -> p1.getDescription().compareToIgnoreCase(p2.getDescription()));
        rebuildListFromArray();
    }

    public void sortByPrice() {
        Collections.sort(listProduct, (p1, p2) -> p1.getPrice().compareToIgnoreCase(p2.getPrice()));
        rebuildListFromArray();
    }

    @Override
    public int size() {
        return listProduct.size();
    }

    @Override
    public boolean isEmpty() {
        return listProduct.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return listProduct.contains(o);
    }

    @Override
    public Iterator iterator() {
        return listProduct.iterator();
    }

    @Override
    public Object[] toArray() {
        return listProduct.toArray();
    }

    @Override
    public Object[] toArray(Object[] a) {
        return listProduct.toArray(a);
    }

    @Override
    public boolean add(Object e) {
        if (e instanceof Product) {
            addProduct((Product) e);
            return true;
        }
        return false;
    }

    public void removeProduct(String description) throws Exception {
        boolean removed = listProduct.removeIf(p -> p.getDescription().equalsIgnoreCase(description));
        if (!removed) {
            throw new Exception("Producto con descripción '" + description + "' no encontrado.");
        }
        rebuildListFromArray(); // Reconstruir la lista enlazada después de eliminar
    }

    @Override
    public boolean remove(Object o) {
        if (o instanceof String) {
            try {
                removeProduct((String) o);
                return true;
            } catch (Exception e) {
                return false; // Si no se encuentra, retorna false
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'containsAll'");
    }

    @Override
    public boolean addAll(Collection c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @Override
    public boolean removeAll(Collection c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeAll'");
    }

    @Override
    public boolean retainAll(Collection c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'retainAll'");
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

}
