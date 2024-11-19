package pe.edu.cibertec.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "estudiantes")
public class Estudiante {

    @Id
    private String idEstudiante;
    private String nombres;
    private String apellidos;
    private String correo;
    private Date fechaNacimiento;

    /**TODO ESTO COMPONE EL MAPEO
     * JOINTABLE, PARA HACER REFERENCIA A LA TABLA INTERMEDIA
     * JUNTO CON SUS DOS ID(PK), QUE HAN VINCULADO AL TB INTERMEDIA
     * joinColumns = @JoinColumn(name = "idEstudiante(CAMPO VINCULANTE)", nullable = false(PUEDE ESTAR VACI?=FALSE)
     * inverseJoinColumns = @JoinColumn(name = "idCurso", nullable = false (INVERSE, PORQUE ESTA YENDO A LA OTRA TABLA)
     */
    @ManyToMany
    @JoinTable(name = "matricula",
            joinColumns = @JoinColumn(name = "idEstudiante", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "idCurso", nullable = false)
    )
    private List<Curso> cursos;

    public Estudiante() {
    }

    public Estudiante(String idEstudiante, String nombres, String apellidos, String correo, Date fechaNacimiento, List<Curso> cursos) {
        this.idEstudiante = idEstudiante;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "idEstudiante='" + idEstudiante + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", correo='" + correo + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}
