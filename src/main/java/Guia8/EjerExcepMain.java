/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Rocio
 */
public class EjerExcepMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Se creara un promedio para 3 notas ingresadas");
        Scanner teclado = new Scanner (System.in);
        String materia, cif;
        double n1, n2, n3, promedio;
        boolean continuar;
        do{
            try{
                continuar = false;
                System.out.print("Ingrese su numero de CIF : ");
                cif= teclado.next();
                System.out.print("Ingrese el nombre de la materia : ");
                materia = teclado.next();
                System.out.print("Ingrese sus notas : ");
                n1= teclado.nextDouble();
                n2= teclado.nextDouble();
                n3= teclado.nextDouble();
                promedio = (n1 + n2 + n3) / 3;
                System.out.println("Sus datos son : ");
                System.out.println("Su CIF es : " + cif );
                System.out.println("Para la materia de " + materia + " tiene un promedio de " + promedio);
            } catch(InputMismatchException ex){
                System.out.println("Debe ingresar el tipo de dato correspondiente");
                teclado.next();
                continuar = true;
            }finally{
                System.out.print("\nSe ha ejecutado correctamente\n");
            }
            
        } while(continuar);
                
    }
    
}
