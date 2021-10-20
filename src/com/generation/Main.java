package com.generation;

public class Main {
    public static int numerador = 10;
    public static int denominador = 0;
    public static float division;


    public static void main(String[] args) {

        System.out.println("antes de hacer la division");

        try {
            division = numerador / denominador;
        } catch (NullPointerException ex){
            System.out.println("NullPointer");
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Exeption");
            System.out.println(ex.getMessage());
        }
        System.out.println("Despues de la division");





    }
}
