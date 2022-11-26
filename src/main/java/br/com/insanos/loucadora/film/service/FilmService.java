package br.com.insanos.loucadora.film.service;

import br.com.insanos.loucadora.film.document.FilmDocument;
import br.com.insanos.loucadora.film.model.Film;
import reactor.core.publisher.Mono;

public interface FilmService {
    Mono<FilmDocument> registerFilm(Film film);
}
