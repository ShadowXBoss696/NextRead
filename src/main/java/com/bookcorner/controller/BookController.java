package com.bookcorner.controller;

import com.bookcorner.models.BookDetails;
import com.bookcorner.models.BookSummary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    @GetMapping
    public List<BookSummary> searchBooks() {
        return new ArrayList<>();
    }

    @GetMapping("/{bookId}")
    public BookDetails getBookDetails(@PathVariable("bookId") UUID bookId) {
        return null;
    }
}
