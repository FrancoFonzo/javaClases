package com.francofonzo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();
        int[] mayores = new int[20];
        for (int i = 0, j = 0; i < 20; i++) {
            System.out.println("Ingrese un numero: ");
            int y = reader.nextInt();
            if(y <= x) continue;
            mayores[j] = y;
            j++;
        }

        for (int mayor : mayores) {
            if (mayor != 0) System.out.println(mayor);
        }
    }
}
