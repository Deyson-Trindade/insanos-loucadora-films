package br.com.insanos.loucadora.film.router;

import br.com.insanos.loucadora.film.handler.FilmHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
@RequiredArgsConstructor
public class FilmRouter {
    private final FilmHandler filmHandler;


    @Bean
    public RouterFunction<ServerResponse> filmRoutes() {
        return RouterFunctions.route()
                .path("/films", builder -> builder
                        .POST(filmHandler::registerFilm))
                .build();
    }
}
