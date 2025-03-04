package com.tienda.modelo;

import javax.persistence.Entity;

/**
 * Clase Camion que hereda de Vehiculo y representa un camión en la tienda.
 */
@Entity
public class Camion extends Vehiculo {
    private double capacidadCarga; // Capacidad de carga en toneladas

    /**
     * Constructor para inicializar un camión con sus características.
     *
     * @param marca         Marca del camión.
     * @param modelo        Modelo del camión.
     * @param anio          Año de fabricación del camión.
     * @param precio        Precio del camión.
     * @param capacidadCarga Capacidad de carga en toneladas.
     */
    public Camion(String marca, String modelo, int anio, double precio, double capacidadCarga) {
        super(marca, modelo, anio, precio);
        this.capacidadCarga = capacidadCarga;
    }

    public Camion() {
        super("", "", 0, 0);
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Camion - " + toString() + ", Capacidad de Carga: " + capacidadCarga + " toneladas");
    }

    @Override
    public double calcularImpuestos() {
        return getPrecio() * 0.15; // 15% de impuesto sobre el precio del camión
    }
}
