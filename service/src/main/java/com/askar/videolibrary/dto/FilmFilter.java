package com.askar.videolibrary.dto;

import com.askar.videolibrary.entity.enums.Genre;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class FilmFilter {

    Genre genre;
    String name;
    String country;
}
