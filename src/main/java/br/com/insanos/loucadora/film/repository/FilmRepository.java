package br.com.insanos.loucadora.film.repository;

import br.com.insanos.loucadora.film.document.FilmDocument;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends ReactiveMongoRepository<FilmDocument, String> {
}
