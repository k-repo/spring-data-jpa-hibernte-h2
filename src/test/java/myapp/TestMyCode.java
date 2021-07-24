package myapp;

import myapp.entities.Contrat;
import myapp.entities.Personne;
import myapp.repo.ContratRepo;
import myapp.repo.PersonneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Date;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMyCode {

    @Autowired
    private PersonneRepo personneRepo;

    @Autowired
    private ContratRepo contratRepo;

    @Test
    public void myFirstTest() {
        System.out.println("Hello");

        Personne personne = new Personne(1L, "C", "Ae", "ADRESS", "06");
        personneRepo.save(personne);

        Personne personne2 = new Personne(2L, "Ch2", "Am2", "ADRESS", "06");
        personneRepo.save(personne2);

        Personne personne3 = new Personne(3L, "Ch3", "A3", "ADRESS", "06");
        personneRepo.save(personne3);

        Contrat contrat1 = new Contrat();
        contrat1.setId(1L);
        contrat1.setDate(new Date());
        contrat1.setNumero("00000001");
        contrat1.setInformation("00000002 blabla");
        contrat1.setPersonne(personne);
        contratRepo.save(contrat1);

        Contrat contrat2 = new Contrat();
        contrat2.setId(2L);
        contrat2.setDate(new Date());
        contrat2.setNumero("00000002");
        contrat2.setInformation("00000002 blabla");
        contrat2.setPersonne(personne);
        contratRepo.save(contrat2);


        personneRepo.findAll().forEach(p -> {
            System.out.println("================= PERSONNE ");
            System.out.println(p.getNom());
            System.out.println(p.getPrenom());
            System.out.println(p.getAddresse());
        });

        contratRepo.findAll().forEach(c -> {
            System.out.println("================= CONTRAT " + c.getPersonne().getNom());
            System.out.println(c.getNumero());
            System.out.println(c.getDate());
            System.out.println(c.getInformation());
            System.out.println(c.getPersonne().getNom());
            System.out.println(c.getPersonne().getPrenom());
            System.out.println(c.getPersonne().getTelephone());
        });

    }
}
