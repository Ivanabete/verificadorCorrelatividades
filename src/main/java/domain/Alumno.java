package domain;

import java.util.List;
public class Alumno {
    private List<Materia> materiasAprobadas;

    private String nombre;

    private String legajo;

    public Alumno(List<Materia> materias, String nombre, String legajo){
        this.materiasAprobadas = materias;
        this.nombre = nombre;
        this.legajo = legajo;
    }
    public Boolean cumpleCorrelativas(Materia materia) {
      return this.materiasAprobadas.containsAll(materia.getCorrelativas());
    }
}
