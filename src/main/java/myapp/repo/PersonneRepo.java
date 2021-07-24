package myapp.repo;

import myapp.entities.Personne;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonneRepo extends CrudRepository<Personne, Long> {

    List<Personne> findPersonneByNom(String nom);
    Personne findById(long id);

}
