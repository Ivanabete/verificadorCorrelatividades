package domain;

import java.util.List;

public class Materia {
    private List<Materia> correlativas;
    private String nombre;

    public Materia(List<Materia> correlativas, String nombre) {
        this.correlativas = correlativas;
        this.nombre = nombre;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }
}
