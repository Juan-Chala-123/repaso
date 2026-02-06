/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package discountpurchase;

import java.util.*;
/**
 *
 * @author CHALA RAMIREZ
 */
public class DiscountPurchase {

    /**
     * Descuento en una compra
     * Si el monto de una compra es mayor a 100, se aplica un 10% de descuento.
     * El algoritmo debe mostrar el total a pagar.
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa el valor de la compra: ");
        int buys = sc.nextInt();
        
        if (buys > 100) {
            double discount = buys * 0.10;
        
            double total = buys - discount;
        
            System.out.println("Se le aplica un descuento de: " + discount);
            System.out.println("El total a pagar es: " + total);
        } else {
            System.out.println("El total a pagar es: " + buys);
        }
        
        sc.close();
    }
    
}
