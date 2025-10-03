package com.bookcorner.models;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class BookSummary {

    private UUID id;
    private String title;
    private List<String> authorName;
    private String coverImage;
    private Long firstPublishedYear;
}
