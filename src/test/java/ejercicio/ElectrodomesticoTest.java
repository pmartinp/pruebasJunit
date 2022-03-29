/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ejercicio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alumno
 */
public class ElectrodomesticoTest {
    
    public ElectrodomesticoTest() {
    }

    @Test
    public void testGetPrecioBase() {
        System.out.println("getPrecioBase");
        Electrodomestico instance = new Electrodomestico("rojo", 'B', 23);
        int expResult = 100;
        int result = instance.getPrecioBase();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetPrecioBase() {
        System.out.println("setPrecioBase");
        int precioBase = 0;
        Electrodomestico instance = new Electrodomestico();
        instance.setPrecioBase(precioBase);
    }

    @Test
    public void testGetColor() {
        System.out.println("getColor");
        Electrodomestico instance = new Electrodomestico("rojo", 'B', 23);
        String expResult = "rojo";
        String result = instance.getColor();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetConsumo() {
        System.out.println("getConsumo");
        Electrodomestico instance = new Electrodomestico("verde", 'C', 23);
        char expResult = 'C';
        char result = instance.getConsumo();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetPeso() {
        System.out.println("getPeso");
        Electrodomestico instance = new Electrodomestico("rosita", 'B', 44);
        int expResult = 44;
        int result = instance.getPeso();
        assertEquals(expResult, result);
    }
    @Test
    public void testComprobarConsumoEnergetico() {
        System.out.println("comprobarConsumoEnergetico");
        char letra = 'd';
        Electrodomestico instance = new Electrodomestico();
        boolean expResult = false;
        boolean result = instance.comprobarConsumoEnergetico(letra);
        assertEquals(expResult, result);
    }

    @Test
    public void testComprobarColor() {
        System.out.println("comprobarColor");
        String color = "gris";
        Electrodomestico instance = new Electrodomestico();
        boolean expResult = true;
        boolean result = instance.comprobarColor(color);
        assertEquals(expResult, result);
    }

    @Test
    public void testPrecioFinal() {
        System.out.println("precioFinal");
        Electrodomestico instance = new Electrodomestico("rojo", 'B', 23);
        int expResult = 230;
        int result = instance.precioFinal();
        assertEquals(expResult, result);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Electrodomestico instance = new Electrodomestico();
        String expResult = "precio base=100\ncolor=blanco\nconsumo=A\npeso=5";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
