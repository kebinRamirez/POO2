/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Curso {
    private int nrc;
    private Profesor profesor;
    ArrayList<infornacionCurso> infoCurso;
    ArrayList<Estudiante> estudiantes;
   
    //agregando las relaciones necesarias
    

    public Curso(int nrc) {
        this.nrc = nrc;
        estudiantes =new ArrayList();
        //creando curso(agregandole un nrc)
    }

    public int getNrc() {
        return nrc;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante estudiantes) {
        if(this.estudiantes.size()<=40){
        this.estudiantes.add(estudiantes);
        }
    }
    
    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        if (this.profesor == null){
            this.profesor = profesor;
        }
    }
    
    
    
}
