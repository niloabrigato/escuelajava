/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoalumnos;

import java.util.Scanner;

/**
 *
 * @author Compu
 */
public class Menu {
    Scanner sn = new Scanner(System.in);
    boolean salir = false;
    int opcion; //Guardaremos la opcion del usuario
    Escuela escuela = new Escuela("");
    String nombreMateria;
    int cupo;
    String nombreDocente;
    Long dniDocente;
    String telefonoDocente;
    String nombreAlumno;
    String telefonoAlumno;
    int matricula;
    String fechaNacimientoAlumno;
    int numeroMateria;
    Materia materia;
    Docente docente;
    Alumno alumno;
    int numeroListadoAlumnos;
    int numeroDocente;
    
    public void opciones() {
        do{
            System.out.println("                                                PASO 1");
            System.out.println("                                                ======");
            System.out.println("                                                1. Agregar Escuela");
            System.out.println("                                                PASO 2");
            System.out.println("                                                ======");
            System.out.println("                                                2. Nueva Materia y agregarla");
            System.out.println("                                                3. Nuevo Profesor");
            System.out.println("                                                4. Nuevo Alumno");
            System.out.println("                                                PASO 3");
            System.out.println("                                                ======");
            System.out.println("                                                5. Listar Materias");            
            System.out.println("                                                6. Listar Docentes");
            System.out.println("                                                7. Listar Alumnos");
            System.out.println("                                                8. Asignar Docente [listar materia y docente]");
            System.out.println("                                                9. Asignar Alumnos [listar materia y alumnos]");
            System.out.println("                                                10. Listar Escuela completa");
            System.out.println("                                                11. Eliminar Alumno Materia[listado materia ]");
            System.out.println("                                                12. Eliminar Alumno Escuela[Listado alumnos]");
            System.out.println("                                                13. Eliminar Docente Materia[Listado materia]");
            System.out.println("                                                14. Eliminar Docente Escuela[Listado docente]");
            System.out.println("                                                0. Salir");
            System.out.println("                                                Escribe una de las opciones");
            opcion = sn.nextInt();
            
            switch(opcion){
               case 0:
                   salir=true;
                   break;
               case 1:{
                    sn.nextLine(); // consumo el salto de linea del 1
                    System.out.println("Ingresa el nombre de la escuela");
                    escuela.setNombre(sn.nextLine());
                    System.out.println("Has agregado la Escuela " + escuela.getNombre() );
                }
                   break;
               case 2:{
                    sn.nextLine(); // consumo el salto de linea del 1
                    System.out.println("Ingresa el nombre de la materia");
                    nombreMateria = sn.nextLine();
                    System.out.println("Ingresa el cupo para " + nombreMateria + ":");
                    cupo = sn.nextInt();
                    sn.nextLine(); // consumo el salto de linea del 1
                    escuela.agregarMateria(new Materia(nombreMateria, cupo));
                    escuela.mostrarEscuela();
                }
                   break;
                case 3:{
                    sn.nextLine(); // consumo el salto de linea del 1
                    System.out.println("Ingresa el nombre del profesor");
                    nombreDocente = sn.nextLine();
                    System.out.println("Ingresa el DNI del Profesor " + nombreDocente + ":");
                    dniDocente = sn.nextLong();
                    sn.nextLine(); // consumo el salto de linea del 1
                    System.out.println("Ingresa el teléfono del Profesor " + nombreDocente + ":");
                    telefonoDocente = sn.nextLine();
                    escuela.agregarDocente(new Docente(dniDocente, nombreDocente, telefonoDocente));
                    escuela.mostrarEscuela();
                }
                   break;
                case 4:{
                    sn.nextLine(); // consumo el salto de linea del 1
                    System.out.println("Ingresa el nombre del alumno");
                    nombreAlumno = sn.nextLine();
                    System.out.println("Ingresa la matrícula (número) del alumno " + nombreAlumno + ":");
                    matricula = sn.nextInt();
                    sn.nextLine(); // consumo el salto de linea del 1
                    System.out.println("Ingresa el teléfono del Alumno " + nombreAlumno + ":");
                    telefonoAlumno = sn.nextLine();
                    System.out.println("Ingresa la fecha de nacimento del Alumbi " + nombreAlumno + ":");
                    fechaNacimientoAlumno = sn.nextLine();
                    escuela.agregarAlumno(new Alumno(nombreAlumno, telefonoAlumno, matricula, fechaNacimientoAlumno));
                    escuela.mostrarEscuela();
                }
                   break;
                case 5: { 
                    sn.nextLine(); // consumo el salto de linea del 1
                    System.out.println("LISTADO DE MATERIAS ESCUELA " + escuela.getNombre());
                    escuela.listarMaterias();
                } break;
                case 6: { 
                    sn.nextLine(); // consumo el salto de linea del 1
                    System.out.println("LISTADO DE DOCENTES ESCUELA " + escuela.getNombre());
                    escuela.listarDocentes();
                } break;
                case 7: {
                    sn.nextLine(); // consumo el salto de linea del 1
                    System.out.println("LISTADO DE ALUMNOS ESCUELA " + escuela.getNombre());
                    escuela.listarAlumnos();
                } break;
                case 8: {
                    if(escuela.listaDocentes != null) {
                        sn.nextLine(); // consumo el salto de linea del 1
                        if(escuela.listaMaterias != null){
                            System.out.println("Ingrese el número de materia");
                            numeroMateria = sn.nextInt();
                            sn.nextLine(); // consumo el salto de linea del 1
                            if (escuela.listaMaterias.size() > numeroMateria && numeroMateria >= 0){
                                System.out.println("Ingrese el DNI del docente");
                                dniDocente = sn.nextLong();
                                sn.nextLine(); // consumo el salto de linea del 1
                                if (escuela.getDocente(dniDocente) != null){
                                    materia = escuela.getMateria(numeroMateria);
                                    docente = escuela.getDocente(dniDocente);
                                    materia.setDocente(docente);
                                    System.out.println(docente.getNombre() + " es profesor de la materia: " + materia.getNombre() );
                                } else {
                                    System.out.println("DNI no válido");
                                }
                            } else {
                                System.out.println("Número no válido");
                            }   
                        } else {
                            System.out.println("No hay materias en esta escuela");
                        }   
                    } else {
                        System.out.println("No hay docentes en esta escuela");
                    }    
                } break;
                case 9: {
                    sn.nextLine(); // consumo el salto de linea del 1
                    if(escuela.listaMaterias != null) {    
                        System.out.println("Ingrese el número de materia");
                        numeroMateria = sn.nextInt();
                        if (escuela.listaMaterias.size() > numeroMateria && numeroMateria >= 0){
                            sn.nextLine(); // consumo el salto de linea del 1
                            //if (escuela.listaMaterias.size() > numeroMateria && numeroMateria >= 0){
                            System.out.println("Ingrese la matrícula del alumno");
                            matricula = sn.nextInt();
                            sn.nextLine(); // consumo el salto de linea del 1
                            if(escuela.getAlumno(matricula) != null){
                                materia = escuela.getMateria(numeroMateria);
                                alumno = escuela.getAlumno(matricula);
                                materia.agregarListaAlumnos(alumno);
                                System.out.println(alumno.getNombre() + " es alumno de la materia: " + materia.getNombre() );
                            } else {
                                System.out.println("Matrícula no válida");
                            }
                        } else {
                            System.out.println("Número no válido");
                        }
                    } else {
                        System.out.println("No hay mateias en esta escuela");
                    }    
                } break;
                case 10: {
                    if(escuela != null){
                        escuela.mostrarEscuela();
                    } else {
                        System.out.println("Debe crear una escuela!");
                    }
                    
                } break;
                
                case 11: {
                    sn.nextLine(); // consumo el salto de linea del 1
                    if (escuela.listaMaterias !=null){
                        System.out.println("Borrar de la materia");
                        System.out.println("=====================");
                        System.out.println("Ingrese numero materia");
                        numeroMateria = sn.nextInt();
                        sn.nextLine(); // consumo el salto de linea del 1
                        System.out.println("Ingrese numero alumno en listado materia");
                        numeroListadoAlumnos = sn.nextInt();
                        sn.nextLine(); // consumo el salto de linea del 1
                        if (escuela.listaMaterias.size() > numeroMateria && numeroMateria >= 0){
                            materia = escuela.listaMaterias.get(numeroMateria);
                            alumno = materia.listaAlumnos.get(numeroListadoAlumnos);
                            materia.listaAlumnos.remove(alumno);
                        } else {
                            System.out.println("Número no válido");
                        }                            
                    } else {
                        System.out.println("No hay mateias en esta escuela");
                    }
                    
                } break;
                case 12: { 
                    sn.nextLine(); // consumo el salto de linea del 1
                    if(escuela.listaMaterias != null) {
                        System.out.println("Borrar Listado Escuela");
                        System.out.println("=====================");
                        System.out.println("Ingrese el número del alumno [listado alunmos] a borrar");
                        numeroListadoAlumnos = sn.nextInt();
                        if (escuela.listaAlumnos.size() > numeroListadoAlumnos && numeroListadoAlumnos >= 0){
                            alumno = escuela.listaAlumnos.get(numeroListadoAlumnos);
                            escuela.listaAlumnos.remove(alumno);
                        } else {
                            System.out.println("Número de alumno no válido");
                        }    
                    } else {
                        System.out.println("No hay alumnos en esta escuela");
                    }
                } break;
                
                case 13: {
                    if(escuela.listaMaterias != null) {
                        sn.nextLine(); // consumo el salto de linea del 1
                        System.out.println("Borrar de la materia");
                        System.out.println("=====================");
                        System.out.println("Ingrese numero materia");
                        numeroMateria = sn.nextInt();
                        sn.nextLine(); // consumo el salto de linea del 1
                        if (escuela.listaMaterias.size() > numeroMateria && numeroMateria >= 0){
                            materia = escuela.listaMaterias.get(numeroMateria);
                            materia.setDocente(null);
                        } else {
                            System.out.println("Número de materia no válido");
                        }    
                    } else {
                        System.out.println("No hay materias en esta escuela");
                    }
                    
                } break;
                case 14: { 
                    sn.nextLine(); // consumo el salto de linea del 1
                    if(escuela.listaDocentes != null){
                        System.out.println("Borrar Listado Escuela");
                        System.out.println("=====================");
                        System.out.println("Ingrese el número del docente [listado docente] a borrar");
                        numeroDocente = sn.nextInt();
                        sn.nextLine(); // consumo el salto de linea del 1
                        if (escuela.listaDocentes.size() > numeroDocente && numeroDocente >= 0){
                            docente = escuela.listaDocentes.get(numeroDocente);
                            escuela.listaDocentes.remove(docente);
                        } else {
                            System.out.println("Número de docente no válido");
                        }                        
                    } else {
                        System.out.println("No hay docentes en esta escuela");
                    }
                    
                 } break;
                default:
                   System.out.println("Solo números entre 0  y 14");
           }
       }
      while(!salir);
    }    
}
    

