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
public class Escuela {
    private String nombre;
    List<Materia> listaMaterias;
    List<Docente> listaDocentes;
    List<Alumno> listaAlumnos;

    /**
     * 
     * @param nombre 
     */
    Escuela(String nombre){
        this.nombre = nombre;
        this.listaMaterias = new ArrayList<>();
        this.listaAlumnos = new ArrayList<>();
        this.listaDocentes = new ArrayList<>();
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
     * @param materia 
     */
    public void agregarMateria(Materia materia){
        this.listaMaterias.add(materia);
    }
    
    /**
     * 
     * @param docente 
     */
    public void agregarDocente(Docente docente){
        this.listaDocentes.add(docente);
    }
        
    /**
     * 
     * @param alumno 
     */
    public void agregarAlumno(Alumno alumno){
        this.listaAlumnos.add(alumno);
    }
    
    /**
     * 
     * @param materiaEliminar 
     */
    public void eliminarMateria(Materia materiaEliminar){
        for(Materia materia: this.listaMaterias){
            if(materia.equals(materiaEliminar)){
                this.listaMaterias.remove(materiaEliminar);
            }
        }
    }
    
    /**
     * 
     * @param docenteEliminar 
     */
    public void eliminarDocente(Docente docenteEliminar){
        for(Docente docente: this.listaDocentes){
            if(docente.equals(docenteEliminar)){
                this.listaDocentes.remove(docenteEliminar);
            }
        }
    }
    
    /**
     * 
     * @param alumnoEliminar 
     */
    public void eliminarAlumno(Alumno alumnoEliminar){
        for(Alumno alumno: this.listaAlumnos) {
            if(alumno.equals(alumnoEliminar)){
                this.listaAlumnos.remove(alumnoEliminar);
            }
        }
    }
    
    /**
     * 
     */
    public void listarMaterias(){
        int contador = 0;
        for(Materia materia: this.listaMaterias){
            System.out.println(contador + " " + materia.getNombre());
            contador++;
        }
    }
    
    /**
     * 
     */
    public void listarDocentes(){
        for(Docente docente: this.listaDocentes){
            System.out.println(docente.getNombre() + " DNI: " + docente.getDNI());
        }
    }
    
    public void listarAlumnos(){
        int contador= 0;
        for(Alumno alumno: this.listaAlumnos){
            System.out.println(contador + " " + alumno.getNombre() + " Mátricula: " + alumno.getMatricula());
            contador++;
        }
    }
    
    
    
    /***
     * 
     * @param indice
     * @return 
     */
    public Materia getMateria(int indice){
        return this.listaMaterias.get(indice);
    }
    
    /**
     * 
     * @param dni
     * @return 
     */
    public Docente getDocente(long dni){
        Docente docenteRetornar = null;
        for(Docente docente: this.listaDocentes){
            if(docente.getDNI() == dni){
                docenteRetornar = docente;
            }
        }
        return docenteRetornar;
    }
    
    /**
     * 
     * @param matricula
     * @return 
     */
    public Alumno getAlumno(int matricula){
        Alumno alumnoRetornar = null;
        for(Alumno alumno: this.listaAlumnos){
            if(alumno.getMatricula() == matricula){
                alumnoRetornar = alumno;
            }
        }
        return alumnoRetornar;
    }
    
    
    /**
     * 
     */
    public void mostrarEscuela() {
        int contador;
        
        System.out.println("Escuela: " + this.nombre);
        System.out.println("Materias: ");
        contador = 1;
        for(Materia materia: this.listaMaterias){
            System.out.println( contador + " - Materia: " + materia.getNombre());
            contador++;
            if(materia.getDocente() != null){
                System.out.println("Docente: " + materia.getDocente().getNombre() + "- DNI:" + materia.getDocente().getDNI() );
            }
            
            if(materia.listaAlumnos != null){
                System.out.println("Alumnos de " + materia.getNombre());
                for(Alumno alumno: materia.listaAlumnos){
                    System.out.println(alumno.getNombre() + " - matrícula: " + alumno.getMatricula());
                }
            }    
        }
        System.out.println("Docentes: ");
        if(this.listaDocentes != null){
            for(Docente docente: this.listaDocentes){
                System.out.println(docente.getNombre() + " DNI: " + docente.getDNI());
            }
        } else {
            System.out.println("La escuela no tiene docentes");
        }
        System.out.println("Alumnos: ");
        if(this.listaAlumnos != null){
            contador=0;
            for(Alumno alumno: this.listaAlumnos){
                System.out.println(contador + " " + alumno.getNombre() + " Mátricula: " + alumno.getMatricula());
                contador++;
            }
        } else {
            System.out.println("La escuela no tiene docentes");
        }
    }
}