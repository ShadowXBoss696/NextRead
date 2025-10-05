package com.bookcorner.service;

import com.bookcorner.model.BookDetails;
import com.bookcorner.model.BookSummary;
import com.bookcorner.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public Page<BookSummary> searchBooks(String query, Pageable pageable) {
        // Implement search logic here
        return Page.empty(pageable);
    }

    public BookDetails getBookDetails(UUID bookId) {
        // Implement retrieval logic here
        throw new NoSuchElementException();
    }
}
