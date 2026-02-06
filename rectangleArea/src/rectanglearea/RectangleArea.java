/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectanglearea;

import java.util.*;
/**
 *
 * @author CHALA RAMIREZ
 */
public class RectangleArea {

    /**
     * Área de un rectángulo
     * Diseñar un algoritmo que reciba la base y la altura 
     * de un rectángulo y muestre su área y su perímetro.
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa el valor de la base: ");
        byte base = sc.nextByte();
        
        System.out.print("Ingresa el valor de la altura: ");
        byte height = sc.nextByte();
        
        int perimeter = 2 * (base + height);
        int area = base * height;
        
        System.out.println("El valor del area es: " + area);
        System.out.println("El valor del perimetro es: " + perimeter);
        
        sc.close();
    }
    
}
