package mx.utng.cjge.model.entity;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Examen {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @PrePersist
    public void PrePersist(){
        fecha = new Date();
    }
    @Temporal(TemporalType.DATE)
    private Date fecha;

    @Column (length = 100, nullable = false)
    @NotEmpty
    private String estudiante;

    @Column (length = 40, nullable = false)
    @NotEmpty
    private String materia;

    @Column (length = 40, nullable = false)
    @NotEmpty
    private String calificacion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    


}
