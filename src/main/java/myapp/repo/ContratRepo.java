package myapp.repo;

import myapp.entities.Contrat;
import myapp.entities.Personne;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ContratRepo extends CrudRepository<Contrat, Long> {
    public List<Contrat> findByPersonne(Personne personne);
}
