/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculosalariosemanal;

import java.util.*;
/**
 *
 * @author CHALA RAMIREZ
 */
public class CalculoSalarioSemanal {

    /**
     * Cálculo de salario semanal
     * Un trabajador recibe un pago fijo por hora.
     * El programa debe solicitar la cantidad de horas trabajadas 
     * en la semana y el pago por hora, y calcular el salario semanal total.
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa la cantidad de horas trabajadas en la semana: ");
        byte hour = sc.nextByte();
        
        int paymentWeek = 1200;
        
        int totalSalary = hour * paymentWeek;
        
        System.out.println("Total: " + totalSalary);
        
        sc.close();
    }
}
