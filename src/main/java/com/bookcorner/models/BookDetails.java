package com.bookcorner.models;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class BookDetails {

    private UUID id;
    private String title;
    private List<AuthorSummary> author;
    private String coverImage;
    private Long firstPublishedYear;
}
