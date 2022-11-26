package br.com.insanos.loucadora.film.model;

import br.com.insanos.loucadora.film.document.FilmDocument;
import br.com.insanos.loucadora.film.document.Response;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FilmRequest implements Film {
    private String title;
    private String synopsis;
    private String category;
    private String hrefImage;
    private String parentalRating;


/*    public Response dtoToDocument() {
        return FilmDocument.builder()
                .id(String.valueOf(UUID.randomUUID()))
                .category(this.getCategory())
                .hrefImage(this.getHrefImage())
                .parentalRating(this.getParentalRating())
                .synopsis(this.getSynopsis())
                .title(this.getTitle())
                .build();
    }*/
}
