package com.bookcorner.service;

import com.bookcorner.model.AuthorDetails;
import com.bookcorner.model.AuthorSummary;
import com.bookcorner.model.BookDetails;
import com.bookcorner.model.BookSummary;
import com.bookcorner.repository.AuthorRepository;
import com.bookcorner.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AuthorService {

    private final AuthorRepository authorRepository;

    public Page<AuthorSummary> searchAuthors(String query, Pageable pageable) {
        // Implement search logic here
        return Page.empty(pageable);
    }

    public AuthorDetails getAuthorDetails(UUID authorId) {
        // Implement retrieval logic here
        throw new NoSuchElementException();
    }
}
