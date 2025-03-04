package com.tienda.modelo;

import javax.persistence.Entity;

/**
 * Clase Coche que hereda de Vehiculo y representa un automóvil en la tienda.
 */
@Entity
public class Coche extends Vehiculo {
    private int numeroDePuertas;

    /**
     * Constructor para inicializar un coche con sus características.
     *
     * @param marca          Marca del coche.
     * @param modelo         Modelo del coche.
     * @param anio           Año de fabricación del coche.
     * @param precio         Precio del coche.
     * @param numeroDePuertas Número de puertas del coche.
     */
    public Coche(String marca, String modelo, int anio, double precio, int numeroDePuertas) {
        super(marca, modelo, anio, precio);
        this.numeroDePuertas = numeroDePuertas;
    }

    public Coche() {
        super("", "", 0, 0);
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Coche - " + toString() + ", Número de Puertas: " + numeroDePuertas);
    }

    @Override
    public double calcularImpuestos() {
        return getPrecio() * 0.10; // 10% de impuesto sobre el precio del coche
    }
}
