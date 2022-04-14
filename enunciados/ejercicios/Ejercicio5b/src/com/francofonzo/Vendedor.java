package com.francofonzo;

public class Vendedor extends Empleado{
    private float porcenComision;
    private int totalVtas;

    public float getPorcenComision() {
        return porcenComision;
    }

    public void setPorcenComision(float porcenComision) {
        this.porcenComision = porcenComision;
    }

    public int getTotalVtas() {
        return totalVtas;
    }

    public void setTotalVtas(int totalVtas) {
        this.totalVtas = totalVtas;
    }

    @Override
    public double getSueldoBase() {
        return super.getSueldoBase() +  (porcenComision*totalVtas/100);
    }
}
