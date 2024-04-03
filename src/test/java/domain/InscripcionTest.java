package domain;

import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InscripcionTest {

    @Test
    public void alumnoCumpleCorrelativas(){
        List<Materia> sinCorrelativas = Collections.emptyList();
            Materia ayed = new Materia(sinCorrelativas,"AyED");
            Materia arquitectura = new Materia(sinCorrelativas,"Arquitectura de computadoras");

        List<Materia> correlativasPdeP = new ArrayList<>();
        correlativasPdeP.add(ayed);
            Materia pdep = new Materia(correlativasPdeP,"PdeP");

        List<Materia> materiasCursadasAlumno = new ArrayList<>();
        materiasCursadasAlumno.add(ayed);
        materiasCursadasAlumno.add(pdep);
        materiasCursadasAlumno.add(arquitectura);
            Alumno ivan = new Alumno(materiasCursadasAlumno,"Ivan","2100001");

        List<Materia> correlativasDdS = new ArrayList<>();
        correlativasDdS.add(ayed);
        correlativasDdS.add(pdep);
            Materia dds = new Materia(correlativasDdS,"PdeP");

        Assert.assertEquals(true, ivan.cumpleCorrelativas(dds).booleanValue());
    }


    @Test
    public void inscripcionAprobada(){
        List<Materia> sinCorrelativas = Collections.emptyList();
            Materia ayed = new Materia(sinCorrelativas,"AyED");
            Materia arquitectura = new Materia(sinCorrelativas,"Arquitectura de computadoras");

        List<Materia> correlativasPdeP = new ArrayList<>();
        correlativasPdeP.add(ayed);
            Materia pdep = new Materia(correlativasPdeP,"PdeP");

        List<Materia> materiasCursadasAlumno = new ArrayList<>();
        materiasCursadasAlumno.add(ayed);
        materiasCursadasAlumno.add(pdep);
        materiasCursadasAlumno.add(arquitectura);
            Alumno ivan = new Alumno(materiasCursadasAlumno,"Ivan","2100001");

        List<Materia> correlativasDdS = new ArrayList<>();
        correlativasDdS.add(ayed);
        correlativasDdS.add(pdep);
            Materia dds = new Materia(correlativasDdS,"DdS");

        List<Materia> correlativasSO = new ArrayList<>();
        correlativasSO.add(arquitectura);
            Materia so = new Materia(correlativasSO,"SIstemas Operativos");

        List<Materia> materiasInscripcion = new ArrayList<>();
        materiasInscripcion.add(dds);
        materiasInscripcion.add(so);
            Inscripcion dosMilVeinticuatro = new Inscripcion(materiasInscripcion,ivan);

        Assert.assertEquals(true, dosMilVeinticuatro.inscripcionAprobada().booleanValue());
    }


    @Test
    public void inscripcionRechazada(){
        List<Materia> sinCorrelativas = Collections.emptyList();
            Materia ayed = new Materia(sinCorrelativas,"AyED");

        List<Materia> correlativasPdeP = new ArrayList<>();
        correlativasPdeP.add(ayed);
            Materia pdep = new Materia(correlativasPdeP,"PdeP");

        List<Materia> materiasCursadasAlumno = new ArrayList<>();
        materiasCursadasAlumno.add(pdep); // falta AyED
            Alumno ivan = new Alumno(materiasCursadasAlumno,"Ivan","2100001");

        List<Materia> correlativasDdS = new ArrayList<>();
        correlativasDdS.add(ayed);
        correlativasDdS.add(pdep);
            Materia dds = new Materia(correlativasDdS,"DdS");

        List<Materia> materiasInscripcion = new ArrayList<>();
        materiasInscripcion.add(dds);
            Inscripcion dosMilVeinticuatro = new Inscripcion(materiasInscripcion,ivan);

        Assert.assertEquals(false, dosMilVeinticuatro.inscripcionAprobada().booleanValue());
    }
}
