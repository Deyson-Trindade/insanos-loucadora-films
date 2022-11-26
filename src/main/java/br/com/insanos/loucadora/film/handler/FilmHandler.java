package br.com.insanos.loucadora.film.handler;

import br.com.insanos.loucadora.film.document.Response;
import br.com.insanos.loucadora.film.model.Film;
import br.com.insanos.loucadora.film.model.FilmRequest;
import br.com.insanos.loucadora.film.service.FilmService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.net.URISyntaxException;

@Component
@RequiredArgsConstructor
public class FilmHandler {
    private final FilmService service;


    public Mono<ServerResponse> registerFilm(final ServerRequest request) {
        return request.bodyToMono(FilmRequest.class)
                .flatMap(service::registerFilm)
                .flatMap(this::getBodyBuilder);
    }


    private Mono<ServerResponse> getBodyBuilder(Response filmResponse) {
        try {
            var uri = new URI(String.format("/film/%s", filmResponse.getId()));
            return ServerResponse.created(uri).bodyValue(filmResponse);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
