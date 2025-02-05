package api.crud.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import api.crud.models.Livros;

public interface LivrosRepository extends JpaRepository<Livros, Long>{
    
}
