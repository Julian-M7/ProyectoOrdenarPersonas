package co.edu.uptc.presenter;

/**
 * PROPÓSITO DE LA CLASE LinkedList:
 * 
 * Una Lista Enlazada (LinkedList) es una estructura de datos que almacena elementos
 * en nodos conectados entre sí mediante referencias (punteros). A diferencia de un array,
 * los elementos no están en posiciones contiguas en memoria, sino distribuidos.
 * 
 * VENTAJAS:
 * - Tamaño dinámico: crece según sea necesario
 * - Inserción/Eliminación eficiente en cualquier posición sin desplazamientos
 * - No desperdicia memoria como los arrays
 * 
 * DESVENTAJAS:
 * - Acceso más lento a elementos (O(n) vs O(1) en arrays)
 * - Requiere más memoria por las referencias
 * 
 * ESTRUCTURA:
 * [Nodo1] -> [Nodo2] -> [Nodo3] -> null
 *   (dato)    (dato)    (dato)
 *   (siguiente) (siguiente) (siguiente)
 */
public class LinkedList {
    
    // Clase interna que define la estructura de cada nodo
    private class Node {
        int data;          // Dato almacenado en el nodo
        Node next;         // Referencia al siguiente nodo
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    private Node head;     // Referencia al primer nodo (cabeza) de la lista
    private int size;      // Número de elementos en la lista
    
    /**
     * Constructor: Inicializa una lista enlazada vacía
     */
    public LinkedList() {
        this.head = null;
        this.size = 0;
    }
    
    /**
     * MÉTODO: add(int valor)
     * PROPÓSITO: Agregar un elemento al final de la lista
     * COMPLEJIDAD: O(n) porque debe recorrer hasta el final
     * 
     * PASOS:
     * 1. Crear un nuevo nodo con el valor
     * 2. Si la lista está vacía, el nuevo nodo es la cabeza
     * 3. Si no está vacía, buscar el último nodo y conectarlo al nuevo
     */
    public void add(int valor) {
        Node nuevoNodo = new Node(valor);
        
        if (head == null) {
            // Lista vacía: el nuevo nodo es la cabeza
            head = nuevoNodo;
        } else {
            // Buscar el último nodo
            Node actual = head;
            while (actual.next != null) {
                actual = actual.next;
            }
            // Conectar el último nodo con el nuevo
            actual.next = nuevoNodo;
        }
        size++;
    }
    
    /**
     * MÉTODO: addFirst(int valor)
     * PROPÓSITO: Agregar un elemento al inicio de la lista
     * COMPLEJIDAD: O(1) constante
     * 
     * PASOS:
     * 1. Crear un nuevo nodo
     * 2. El nuevo nodo apunta al nodo que era la cabeza
     * 3. El nuevo nodo se convierte en la cabeza
     */
    public void addFirst(int valor) {
        Node nuevoNodo = new Node(valor);
        nuevoNodo.next = head;
        head = nuevoNodo;
        size++;
    }
    
    /**
     * MÉTODO: remove(int valor)
     * PROPÓSITO: Eliminar la primera ocurrencia de un valor en la lista
     * COMPLEJIDAD: O(n) porque debe buscar el elemento
     * 
     * PASOS:
     * 1. Si la lista está vacía, no hacer nada
     * 2. Si el elemento está en la cabeza, eliminarla
     * 3. Si está en otra posición, buscar el anterior y conectarlo al siguiente
     */
    public boolean remove(int valor) {
        if (head == null) {
            return false; // Lista vacía
        }
        
        // Caso 1: El elemento está en la cabeza
        if (head.data == valor) {
            head = head.next;
            size--;
            return true;
        }
        
        // Caso 2: El elemento está en otro lugar
        Node anterior = head;
        Node actual = head.next;
        
        while (actual != null) {
            if (actual.data == valor) {
                // Encontrado: saltar este nodo
                anterior.next = actual.next;
                size--;
                return true;
            }
            anterior = actual;
            actual = actual.next;
        }
        
        return false; // No encontrado
    }
    
    /**
     * MÉTODO: removeFirst()
     * PROPÓSITO: Eliminar el elemento del inicio de la lista
     * COMPLEJIDAD: O(1) constante
     */
    public int removeFirst() {
        if (head == null) {
            throw new RuntimeException("Lista vacía");
        }
        int valor = head.data;
        head = head.next;
        size--;
        return valor;
    }
    
    /**
     * MÉTODO: get(int index)
     * PROPÓSITO: Obtener el valor en una posición específica
     * COMPLEJIDAD: O(n)
     */
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        
        Node actual = head;
        for (int i = 0; i < index; i++) {
            actual = actual.next;
        }
        return actual.data;
    }
    
    /**
     * MÉTODO: size()
     * PROPÓSITO: Retornar la cantidad de elementos en la lista
     * COMPLEJIDAD: O(1) constante
     */
    public int size() {
        return size;
    }
    
    /**
     * MÉTODO: isEmpty()
     * PROPÓSITO: Verificar si la lista está vacía
     * COMPLEJIDAD: O(1) constante
     */
    public boolean isEmpty() {
        return size == 0;
    }
    
    /**
     * MÉTODO: print()
     * PROPÓSITO: Mostrar los elementos de la lista en consola
     * COMPLEJIDAD: O(n)
     * FORMATO: 1 -> 2 -> 3 -> null
     */
    public void print() {
        Node actual = head;
        System.out.print("Lista: ");
        
        while (actual != null) {
            System.out.print(actual.data + " -> ");
            actual = actual.next;
        }
        System.out.println("null");
    }
    
    /**
     * MÉTODO MAIN: Ejemplos de uso de la LinkedList
     */
    public static void main(String[] args) {
        System.out.println("========== EJEMPLOS DE USO DE LINKEDLIST ==========\n");
        
        LinkedList lista = new LinkedList();
        
        // EJEMPLO 1: AGREGAR ELEMENTOS AL FINAL (add)
        System.out.println("EJEMPLO 1: Agregando elementos al final");
        System.out.println("Comando: lista.add(10); lista.add(20); lista.add(30);");
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.print();
        System.out.println("Tamaño: " + lista.size() + "\n");
        
        // EJEMPLO 2: AGREGAR ELEMENTO AL INICIO (addFirst)
        System.out.println("EJEMPLO 2: Agregando elementos al inicio");
        System.out.println("Comando: lista.addFirst(5);");
        lista.addFirst(5);
        lista.print();
        System.out.println("Tamaño: " + lista.size() + "\n");
        
        // EJEMPLO 3: ACCEDER A ELEMENTOS (get)
        System.out.println("EJEMPLO 3: Accediendo a elementos por índice");
        System.out.println("Comando: lista.get(0); lista.get(2); lista.get(3);");
        System.out.println("Elemento en índice 0: " + lista.get(0));
        System.out.println("Elemento en índice 2: " + lista.get(2));
        System.out.println("Elemento en índice 3: " + lista.get(3) + "\n");
        
        // EJEMPLO 4: ELIMINAR POR VALOR (remove)
        System.out.println("EJEMPLO 4: Eliminando elemento por valor");
        System.out.println("Antes: ");
        lista.print();
        System.out.println("Comando: lista.remove(20);");
        boolean eliminado = lista.remove(20);
        System.out.println("¿Se eliminó 20?: " + eliminado);
        System.out.println("Después: ");
        lista.print();
        System.out.println("Tamaño: " + lista.size() + "\n");
        
        // EJEMPLO 5: ELIMINAR DEL INICIO (removeFirst)
        System.out.println("EJEMPLO 5: Eliminando elemento del inicio");
        System.out.println("Antes: ");
        lista.print();
        System.out.println("Comando: int valor = lista.removeFirst();");
        int valor = lista.removeFirst();
        System.out.println("Valor eliminado: " + valor);
        System.out.println("Después: ");
        lista.print();
        System.out.println("Tamaño: " + lista.size() + "\n");
        
        // EJEMPLO 6: INTENTAR ELIMINAR UN ELEMENTO QUE NO EXISTE
        System.out.println("EJEMPLO 6: Intentando eliminar un elemento no existente");
        System.out.println("Comando: lista.remove(999);");
        boolean encontrado = lista.remove(999);
        System.out.println("¿Se encontró 999?: " + encontrado);
        lista.print();
        System.out.println();
        
        // EJEMPLO 7: VERIFICAR SI ESTÁ VACÍA
        System.out.println("EJEMPLO 7: Verificando si la lista está vacía");
        System.out.println("Comando: lista.isEmpty();");
        System.out.println("¿Está vacía?: " + lista.isEmpty() + "\n");
        
        // EJEMPLO 8: AGREGAR MÁS ELEMENTOS Y OPERACIONES
        System.out.println("EJEMPLO 8: Operaciones adicionales");
        System.out.println("Agregando: 40, 50, 60");
        lista.add(40);
        lista.add(50);
        lista.add(60);
        lista.print();
        System.out.println("Tamaño total: " + lista.size());
        System.out.println();
        
        // EJEMPLO 9: LISTAR TODOS LOS ELEMENTOS
        System.out.println("EJEMPLO 9: Recorriendo e imprimiendo todos los elementos");
        System.out.println("Elementos:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("  Posición " + i + ": " + lista.get(i));
        }
    }
}
