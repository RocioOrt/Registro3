/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia9;

/**
 *
 * @author Rocio
 */
public class TestSecManagerMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.setProperty("java.policy", "file:/C:/Users/Rocio/Downloads/java.policy");
        SecurityManagerTest sm = new SecurityManagerTest();
        System.setSecurityManager(sm);
        sm.checkPackageAccess("uees.registro3.Guia9");
        System.out.println("Acceso concedido!");
    }
    
}
