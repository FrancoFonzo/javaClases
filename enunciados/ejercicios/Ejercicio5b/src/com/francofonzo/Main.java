package com.francofonzo;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    static Scanner lector = new Scanner(System.in);
    static LinkedList<Empleado> e = new LinkedList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            do {
                System.out.println("Empleado n°" + i + "es Administrativo(A) o Vendedor(V)?: ");
                String tipo = lector.nextLine();
                if (tipo.equalsIgnoreCase("a")){
                    e.add(setA());
                    break;
                }
                else if(tipo.equalsIgnoreCase("v")){
                    e.add(setV());
                    break;
                }
                else {
                    System.out.println("Finalizando carga...");
                    i = 20;
                    break;
                }
            }while (true);
        }
        lector.close();

        e.forEach(e -> {
            System.out.println(e.getDni());
            System.out.println(e.getApellido());
            System.out.println(e.getNombre());
            System.out.println(e.getEmail());
            System.out.println(e.getSueldoBase());
        });
    }

    private static Empleado createE(Empleado e){
        return setE(e);
    }

    private static Administrativo setA() {
        Administrativo a = (Administrativo) createE(new Administrativo());
        System.out.println("hsExtras: ");
        a.setHsExtra(Integer.parseInt(lector.nextLine()));
        System.out.println("hsMes: ");
        a.setHsMes(Integer.parseInt(lector.nextLine()));
        return a;
    }

    private static Vendedor setV() {
        Vendedor v = (Vendedor) createE(new Vendedor());
        System.out.println("Porcentaje de Comision: ");
        v.setPorcenComision(Float.parseFloat(lector.nextLine()));
        System.out.println("Ventas totales: ");
        v.setTotalVtas(Integer.parseInt(lector.nextLine()));
        return v;
    }

    private static Empleado setE(Empleado e) {
        System.out.println("Dni: ");
        e.setDni(lector.nextLine());
        System.out.println("Nombre: ");
        e.setNombre(lector.nextLine());
        System.out.println("Apellido: ");
        e.setApellido(lector.nextLine());
        System.out.println("Email: ");
        e.setEmail(lector.nextLine());
        System.out.println("Sueldo Base: ");
        e.setSueldoBase(Double.parseDouble(lector.nextLine()));
        return e;
    }
}
