/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoalumnos;

/**
 *
 * @author Compu
 */
public class Docente extends Persona {
    private long DNI;
    
    /**
     * 
     * @param DNI
     * @param nombre
     * @param telefono 
     */
    public Docente(long DNI, String nombre, String telefono){
        super(nombre, telefono);
        this.DNI = DNI;
    }
    
    public Docente(){
        super();
        this.DNI = 0;
    }
    
    /**
     * 
     * @param DNI 
     */
    public void setDNI(long DNI){
        this.DNI = DNI;
    }
    
    /**
     * 
     * @return 
     */
    public long getDNI(){
        return this.DNI;
    } 
}

