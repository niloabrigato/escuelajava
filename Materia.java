/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoalumnos;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Compu
 */
public class Materia {
    private String nombre;
    private Docente docente;
    private int cupo;
    List<Alumno> listaAlumnos;
    
    /**
     * 
     * @param cupo 
     */
    public Materia(String nombre, int cupo){
       this.nombre = nombre;
       this.docente = new Docente();
       this.cupo = cupo;
       this.listaAlumnos =  new ArrayList<>();
    }
    
    /**
     * 
     * @param nombre
     * @param docente 
     */
    public Materia(String nombre, Docente docente, int cupo){
       this.nombre = nombre;
       this.docente = docente;
       this.cupo = cupo;
       this.listaAlumnos =  new ArrayList<>();
    }
    
    /**
     * 
     * @param nombre 
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    /**
     * 
     * @return 
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * 
     * @param docente 
     */
    public void setDocente(Docente docente){
        this.docente = docente;
    }
    
    /**
     * 
     * @param cupo 
     */
    public void setCupo(int cupo){
        this.cupo = cupo;
    }
    
    /**
     * 
     * @return 
     */
    public int getCupo(){
        return this.cupo;
    }
    
    /**
     * 
     * @return 
     */
    public Docente getDocente(){
        return this.docente;
    }
    
    /**
     * 
     * @param alumno 
     */
    public void agregarListaAlumnos(Alumno alumno){
        int inscriptos = this.listaAlumnos.size();
             
        if(inscriptos <= this.getCupo() ){
            this.listaAlumnos.add(alumno);
        } else {
            System.out.println(this.nombre + " tiene el cupo completo");
        }
    }
    
    /**
     * 
     */
    public void listarAlumnos(){
        for(Alumno alumno: this.listaAlumnos){
            System.out.println(alumno.getNombre() + " matrícula: " + alumno.getMatricula());
        }
    }    
    
     
    /**
     * 
     * @param alumnoEliminar 
     */
    public void eliminarAlumno(Alumno alumnoEliminar){
        for(Alumno alumno: this.listaAlumnos){
            if(alumno.equals(alumnoEliminar)){
                this.listaAlumnos.remove(alumnoEliminar);
            }
        }
    }
}