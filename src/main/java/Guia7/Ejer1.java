/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7;

/**
 *
 * @author Rocio
 */
public class Ejer1 {
    private String nombre;
    private String apellidos;
    private String nombreusuario;
    private float edad;
    private String pais;
    private String email;
    private String password;

    public Ejer1(String nombre, String apellidos, String nombreusuario, float edad, String pais, String email, String password)
    {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nombreusuario = nombreusuario;
        this.edad = edad;
        this.pais = pais;
        this.email = email;
        this.password = password;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellidos(){
        return apellidos;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public String getNombreusuario(){
        return nombreusuario;
    }
    public void setNombreusuario(String nombreusuario){
        this.nombreusuario = nombreusuario;
    }
    public float getEdad(){
        return edad;
    }
    public void setEdad(float edad){
        this.edad = edad;
    }
    public String getPais(){
        return pais;
    }
    public void setPais(String pais){
        this.pais = pais;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    
}
