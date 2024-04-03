package domain;

import java.util.List;

public class Inscripcion {
    private Alumno alumnoAInscribir;
    private List<Materia> materiasAInscribirse;

    public Inscripcion(List<Materia> materias, Alumno alumno) {
        this.alumnoAInscribir = alumno;
        this.materiasAInscribirse = materias;
    }

    public Boolean inscripcionAprobada(){
        return materiasAInscribirse.stream()
                .allMatch(materia -> this.alumnoAInscribir.cumpleCorrelativas(materia));
    }
}
