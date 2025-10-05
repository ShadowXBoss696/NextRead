package com.bookcorner.controller;

import com.bookcorner.model.BookDetails;
import com.bookcorner.model.BookSummary;
import com.bookcorner.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/books")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping("/search")
    public Page<BookSummary> searchBooks(@RequestParam String q, Pageable pageable) {
        return bookService.searchBooks(q, pageable);
    }

    @GetMapping("/{bookId}/details")
    public BookDetails getBookDetails(@PathVariable UUID bookId) {
        return bookService.getBookDetails(bookId);
    }
}
