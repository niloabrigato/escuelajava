/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoalumnos;

/**
 *
 * @author Compu
 */
public class Alumno extends Persona {
    private int matricula;
    private String fechaNacimiento;

    public Alumno(){
        super();
        this.matricula = 0;
        this.fechaNacimiento = "";
    }
   
    /**
     * 
     * @param matricula
     * @param nombre
     * @param fecha
     * @param telefono 
     */
    public Alumno( String nombre, String telefono, int matricula, String fecha){
        super(nombre, telefono);
        this.matricula = matricula;
        this.fechaNacimiento = fecha;
    }
    
    /**
     * 
     * @param matricula 
     */
    public void setMatricula(int matricula){ 
        this.matricula = matricula;
    }
    
    /**
     * 
     * @return 
     */
    public int getMatricula(){
        return this.matricula;
    }
    
    /**
     * 
     * @param fecha 
     */
    public void setFechaNacimiento(String fecha){
        this.fechaNacimiento = fecha;
    }
    
    public String getFechaNacimiento(){
        return this.fechaNacimiento;
    }
}
