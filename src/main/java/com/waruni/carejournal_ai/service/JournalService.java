package com.waruni.carejournal_ai.service;

import com.waruni.carejournal_ai.entity.JournalEntry;
import com.waruni.carejournal_ai.repository.JournalRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JournalService {

    private static final Logger log =
            LoggerFactory.getLogger(JournalService.class);

    private final JournalRepository repository;

    public JournalEntry save(JournalEntry entry) {

        log.info("Saving journal entry for date: {}", entry.getEntryDate());

        return repository.save(entry);
    }

    public List<JournalEntry> getAll() {

        log.info("Retrieved {} journal entries", repository.count());

        return repository.findAll();
    }
}
