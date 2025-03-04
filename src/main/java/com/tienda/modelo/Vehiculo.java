package com.tienda.modelo;

import javax.persistence.MappedSuperclass;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * Clase abstracta Vehiculo que define las características y comportamientos
 * comunes de todos los vehículos en la tienda.
 */
@MappedSuperclass
public abstract class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Identificador único para la persistencia

    private String marca;
    private String modelo;
    private int anio;
    private double precio;

    /**
     * Constructor para inicializar un vehículo con sus características básicas.
     *
     * @param marca  Marca del vehículo.
     * @param modelo Modelo del vehículo.
     * @param anio   Año de fabricación.
     * @param precio Precio del vehículo.
     */
    public Vehiculo(String marca, String modelo, int anio, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }

    // Getters y Setters

    public Long getId() {
        return id;
    }

    // Normalmente no se incluye un setter para id cuando se utiliza generación automática.

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Método abstracto para mostrar los detalles específicos del vehículo.
     * Este método será implementado por las clases hijas.
     */
    public abstract void mostrarDetalles();

    /**
     * Método abstracto para calcular los impuestos del vehículo.
     * Cada tipo de vehículo tendrá su propia forma de calcular impuestos.
     *
     * @return Impuestos calculados según el tipo de vehículo.
     */
    public abstract double calcularImpuestos();

    /**
     * Representación en forma de cadena de un vehículo.
     * @return Información básica del vehículo.
     */
    @Override
    public String toString() {
        return "ID: " + id + ", Marca: " + marca + ", Modelo: " + modelo +
                ", Año: " + anio + ", Precio: $" + precio;
    }
}
