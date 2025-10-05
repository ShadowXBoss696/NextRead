package com.bookcorner.controller;

import com.bookcorner.model.AuthorDetails;
import com.bookcorner.model.AuthorSummary;
import com.bookcorner.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/authors")
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorService authorService;

    @GetMapping("/search")
    public Page<AuthorSummary> searchAuthors(@RequestParam String q, @ParameterObject Pageable pageable) {
        return authorService.searchAuthors(q, pageable);
    }

    @GetMapping("/{authorId}/details")
    public AuthorDetails getAuthorDetails(@PathVariable UUID authorId) {
        return authorService.getAuthorDetails(authorId);
    }
}
