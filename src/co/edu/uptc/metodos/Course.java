package model;

import java.util.Arrays;

public class Course {
    public final static int TAM = 12;
    private String name;
    private double []notes;
    private int [][]a;
    private int [][]b;
    private int [][]c;

    public Course(){
        notes = new double[TAM];
        for(int i = 0; i < TAM; i++)
            notes[i] = 0;
    }
    public double promedio(){
        double sum = 0;
        for(int i = 0; i < TAM; i++){
            sum += notes[i];
        }
        return sum/TAM;
    }

    public int estudiantesNotaSuperior(){
        int count = 0;
        double Promedio = promedio();
        for(int i = 0; i < TAM; i++){
            if(notes[i] > Promedio)
                count++;
        }
        return count;
    }
    //1. busqueda secuencial
    //metodo que retorne la posicion del estudiante de la nota mas alta
    public int notaMasAlta(){
        int pos = 0;
        for(int i = 1; i < TAM; i++){
            if(notes[i] > notes[pos])//mayor
                pos = i;
        }
        return pos;
    }
    //Cambio por temporal (if)
    //Ordenamiento lineal
    public String ordenarNotas(){
        double temp = 0;
        int count = 0;
        String bolsa ="";
        for(int i = 0; i < notes.length; i++) {
            for(int j= i + 1 ; j < notes.length; j++) {
                count++;
                if(notes[i] > notes[j]) {
                    temp = notes[i];
                    notes[i] = notes[j];
                    notes[j] = temp;
                }
            }
        }
        bolsa = bolsa + count;
        return bolsa;
    }

    public String ordenamientoBurbuja(){
        double temp = 0;
        int count = 0;
        String bolsa = "";
        for (int i = 0; i < (notes.length - 1); i ++) {
            for (int j = 0; j < (notes.length - 1); j++) {
                count++;
                if (notes[j] > notes[j + 1]) {
                    temp = notes[j];
                    notes[j] = notes[j + 1];
                    notes[j + 1] = temp;
                }
            }
        }
        bolsa = bolsa + count;
        return bolsa;
    }
    //busqueda binaria
    public int binarySearch(double nota){
        int inicio = 0;
        int fin = notes.length - 1;
        int m = (inicio + fin) / 2;
        int resultado = -1;
        while(inicio <= fin && nota != notes[m]){ // poner el boleano despues del && para quitar el primer calculo de m
            m = (inicio + fin) / 2;
            if(nota < notes[m]){
                fin = m - 1;
            }else if(nota > notes[m]){
                inicio = m + 1;
            }if(notes[m] == nota){
                resultado = m;
            }
        }
        return resultado;
    }
    //matrices
    public int []intToHex (int num){
        int []hex = new int[3];
        int i = 0;
        int res = 0;
        while(num != 0){
            res = num % 16;
            hex[i] = res;
            num = num / 16;
            i++;
        }
        return hex;
    }
    //ejercicio clase virtual
    public void matMultiplicacion(int a[][], int b[][], int c[][]){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < b[0].length; j++){
                c[i][j] = 0;
                for(int k = 0; k < a[0].length; k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
    }
    public void matTranspuesta(int a[][], int b[][]){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                b[j][i] = a[i][j];
            }
        }
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double [] getNotes() {
        return notes;
    }

    public void setNotes(double notes[]) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return  " Nombre= " + getName() + "" + ", Notas = " + Arrays.toString(getNotes());
        //return name + Arrays.toString(getNotes());
    }
    
    
    
}
