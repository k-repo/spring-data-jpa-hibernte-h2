package myapp.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Contrat {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String numero;
    private Date date;
    private String information;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "personne_id", nullable = false)
    private Personne personne;

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
