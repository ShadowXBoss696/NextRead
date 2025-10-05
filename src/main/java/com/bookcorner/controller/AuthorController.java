package com.bookcorner.controller;

import com.bookcorner.model.AuthorDetails;
import com.bookcorner.model.AuthorSummary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/authors")
public class AuthorController {

    @GetMapping("/search")
    public Page<AuthorSummary> searchAuthors(@RequestParam String q, Pageable pageable) {
        return new PageImpl<>(new ArrayList<>());
    }

    @GetMapping("/{authorId}/details")
    public AuthorDetails getAuthorDetails(@PathVariable UUID authorId) {
        return null;
    }
}
