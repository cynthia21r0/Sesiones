package mx.utng.s25.model.entity;


import java.util.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Teacher {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column (length = 100, nullable = false)
    @NotEmpty
    @Email
    private String email;

    @Column (length = 40, nullable = false)
    @NotEmpty
    private String password;

    @Column (length = 100, nullable = false)
    @NotEmpty
    private String name;
    
    

    @Temporal(TemporalType.DATE)
    private Date date;

    @PrePersist
    public void PrePersist(){
        date = new Date();
    }


    //GETTERS Y SETTERS
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }public void setPassword(String password) {
        this.password = password;
    }
    public Date getRecordAt() {
        return date;
    }
    public void setRecordAt(Date recordAt) {
        this.date = recordAt;
    }
}
