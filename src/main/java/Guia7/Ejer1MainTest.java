/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7;

import java.util.Scanner;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Rocio
 */
public class Ejer1MainTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        String apellidos;
        String nombreusuario;
        float edad;
        String pais;
        String email;
        String password;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido a Pinteres, para registrarse ingrese sus datos : ");
        System.out.println("Ingrese su nombre : ");
        nombre = teclado.nextLine();
        System.out.println("Ingrese sus apellidos : ");
        apellidos = teclado.nextLine();
        System.out.println("Ingrese nombre de usuario : ");
        nombreusuario = teclado.nextLine();
        System.out.println("Ingrese su edad : ");
        edad = Float.parseFloat(teclado.nextLine());
        System.out.println("Ingrese su pais : ");
        pais = teclado.nextLine();
        System.out.println("Ingrese su email : ");
        email = teclado.nextLine();
        System.out.println("Ingrese su password : ");
        password = teclado.nextLine();
        
        String pass_hash;
        
        pass_hash = encriptar(password);
        
        Ejer1 cuenta1;
        
        cuenta1 = new Ejer1(nombre,apellidos,nombreusuario,edad,pais,email,pass_hash);
        
        System.out.println("Los datos de registro son : ");
        System.out.println("Nombre: " + cuenta1.getNombre());
        System.out.println("Apellidos: " + cuenta1.getApellidos());
        System.out.println("Nombre de usuario: " + cuenta1.getNombreusuario());
        System.out.println("Edad: " + cuenta1.getEdad());
        System.out.println("Departamento: " + cuenta1.getPais());
        System.out.println("Email: " + cuenta1.getEmail());
        System.out.println("Password: " + cuenta1.getPassword());
         
        String password_check;
        System.out.println("Ingresa el password a verificar : ");
        password_check = teclado.nextLine();
        if (BCrypt.checkpw(password_check, cuenta1.getPassword()))
        {
            System.out.println("El password es correcto");
        }else{
            System.out.println("El password es incorrecto");
        }
       
    }
    public static String encriptar(String pass)
    {
        return BCrypt.hashpw(pass, BCrypt.gensalt());
    }
    
}
