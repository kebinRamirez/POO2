package universidad;

import java.util.ArrayList;

public class Universidad {

    ArrayList<Curso> cursos;
    ArrayList<Profesor> profesores;
    ArrayList<Estudiante> estudiantes;
    // creando las relaciones(dandole el poder)

    public Universidad() {
        cursos = new ArrayList<>();
        profesores = new ArrayList<>();
        estudiantes = new ArrayList<>();
        //creando profesores, estudiantes y cursos
    }

    public void agregarProfesor() {
        Profesor p1 = new Profesor(1);
        profesores.add(p1);
        //agrega el profesor
    }

    public void agregarCurso() {
        Curso c = new Curso(10);
        cursos.add(c);
        //agrega  el curso
    }

    public void agregarEstudiante() {
        Estudiante e = new Estudiante(45);
    }

    public void registrarProfesorCurso(Profesor p, Curso c) {
        p.cursos.add(c);
        c.setProfesor(p);

    }

    public void registrarEstudiante(Estudiante e, Curso c) {
        e.cursos.add(c);
        c.setEstudiantes(e);
    }

    public static void main(String[] args) {

    }

}
