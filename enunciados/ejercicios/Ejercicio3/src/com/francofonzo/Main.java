package com.francofonzo;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        LinkedList<String> words = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            words.add(reader.nextLine());
        }
        System.out.println("La palabra ya estaba?: "+words.contains(reader.nextLine()));
    }
}
