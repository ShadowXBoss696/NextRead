package com.bookcorner.controller;

import com.bookcorner.models.AuthorDetails;
import com.bookcorner.models.AuthorSummary;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/authors")
public class AuthorController {

    @GetMapping
    public List<AuthorSummary> searchAuthors() {
        return new ArrayList<>();
    }

    @GetMapping("/{authorId}")
    public AuthorDetails getAuthorDetails(@PathVariable Long authorId) {
        return null;
    }
}
