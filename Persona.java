/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoalumnos;

/**
 *
 * @author Compu
 */
public class Persona {
    private String nombre;
    private String telefono;
    
    /**
     * Método constructor
     * @param nombre
     * @param telefono 
     */
    public Persona(String nombre, String telefono){
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    public Persona(){
        this.nombre = "";
        this.telefono = "";
    }
    
    /**
     * 
     * @param nombre 
     */
    public void setNombre(String nombre){ this.nombre = nombre; }
    public String getNombre(){ return this.nombre; }
     
    /**
     * 
     * @param telefono
     */
    public void setTelefono(String telefono){ this.telefono = telefono; }
    public String getTelefono(){ return this.telefono; }
}

