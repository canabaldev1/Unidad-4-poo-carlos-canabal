/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Taller13.Ejemplos;

/**
 *
 * @author lm-carlos
 */
public interface Vehiculo {

    void acelerar();

    default void encender() {
        System.out.println("El vehículo está encendido.");
    }

}
