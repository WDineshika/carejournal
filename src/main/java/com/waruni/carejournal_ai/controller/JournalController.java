package com.waruni.carejournal_ai.controller;

import com.waruni.carejournal_ai.entity.JournalEntry;
import com.waruni.carejournal_ai.service.JournalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/journal")
@RequiredArgsConstructor
@CrossOrigin("*")
public class JournalController {

    private final JournalService service;

    @PostMapping
    public JournalEntry save(
            @RequestBody JournalEntry entry) {

        return service.save(entry);
    }

    @GetMapping
    public List<JournalEntry> getAll() {
        return service.getAll();
    }
}
