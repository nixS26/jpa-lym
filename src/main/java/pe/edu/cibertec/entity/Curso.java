package pe.edu.cibertec.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "cursos")
public class Curso {

    @Id
    private String idCurso;
    private String nombre;
    private String especialidad;

    /**TODO COMPONE AL MAPEO MAPEO
     * MANY TO MANY(MUCHOS A MUCHOS)
     * PORQUE SI CONSULTO UN CURSO ME GUSTARIA CONOCER LOS ESTUDIANTES
     * */
    @ManyToMany(mappedBy = "cursos")
    private List<Estudiante> estudiantes;


    public Curso() {
    }

    public Curso(String idCurso, String nombre, String especialidad, List<Estudiante> estudiantes) {
        this.idCurso = idCurso;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "idCurso='" + idCurso + '\'' +
                ", nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /*AGREGADO, PARA ESTABLECER LOS METODOS DEL GET Y SET APRA ESTDUIANTES */
    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
}
