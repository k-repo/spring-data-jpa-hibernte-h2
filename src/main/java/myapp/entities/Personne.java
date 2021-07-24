package myapp.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
public class Personne {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String nom;
    private String prenom;
    private String addresse;
    private String telephone;

    @OneToMany(mappedBy = "personne", fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    private ArrayList<Contrat> contrats;

    protected Personne() {

    }

    public Personne(Long id, String nom, String prenom, String addresse, String telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.addresse = addresse;
        this.telephone = telephone;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ArrayList<Contrat> getContrats() {
        return contrats;
    }

    public void setContrats(ArrayList<Contrat> contrats) {
        this.contrats = contrats;
    }

    @Id
    public Long getId() {
        return id;
    }
}
