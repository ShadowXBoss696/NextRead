package com.bookcorner.controller;

import com.bookcorner.model.BookDetails;
import com.bookcorner.model.BookSummary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    @GetMapping("/search")
    public Page<BookSummary> searchBooks(@RequestParam String q, Pageable pageable) {
        return new PageImpl<>(new ArrayList<>());
    }

    @GetMapping("/{bookId}/details")
    public BookDetails getBookDetails(@PathVariable UUID bookId) {
        return null;
    }
}
