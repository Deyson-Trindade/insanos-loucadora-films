package br.com.insanos.loucadora.film.service;

import br.com.insanos.loucadora.film.document.FilmDocument;
import br.com.insanos.loucadora.film.document.Response;
import br.com.insanos.loucadora.film.model.Film;
import br.com.insanos.loucadora.film.repository.FilmRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class FilmServiceImpl implements FilmService{
    private final FilmRepository repository;

    @Override
    public Mono<FilmDocument> registerFilm(final Film film) {
        var document = FilmDocument.builder()
                .id(String.valueOf(UUID.randomUUID()))
                .category(film.getCategory())
                .hrefImage(film.getHrefImage())
                .parentalRating(film.getParentalRating())
                .synopsis(film.getSynopsis())
                .title(film.getTitle())
                .build();

        return repository.save(document);
    }
}
