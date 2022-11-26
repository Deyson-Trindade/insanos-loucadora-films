package br.com.insanos.loucadora.film.model;

import br.com.insanos.loucadora.film.document.Response;

public interface Film {
    String getTitle();
    String getSynopsis();
    String getCategory();
    String getHrefImage();
    String getParentalRating();
    //Response dtoToDocument();
}
