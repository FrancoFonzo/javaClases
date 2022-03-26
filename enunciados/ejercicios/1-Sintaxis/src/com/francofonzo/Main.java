package com.francofonzo;

public class Main {

    public static void main(String[] args) {
        System.out.println("Primeros 10 numeros enteros: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(i+", ");
        }
        System.out.println("Primeros 10 numeros impares: ");
        for (int i = 0, j = 11; i < j;i++) {
            if (i % 2 != 0) {
                System.out.println(i+", ");
                j++;
            }
        }
    }
}
