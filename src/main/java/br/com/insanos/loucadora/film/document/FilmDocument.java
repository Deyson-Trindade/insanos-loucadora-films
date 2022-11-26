package br.com.insanos.loucadora.film.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "films")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FilmDocument implements Response {
    @Id
    private String id;
    private String title;
    private String synopsis;
    private String category;
    private String hrefImage;
    private String parentalRating;
}
