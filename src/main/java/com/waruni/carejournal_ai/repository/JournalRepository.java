package com.waruni.carejournal_ai.repository;

import com.waruni.carejournal_ai.entity.JournalEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalRepository
        extends JpaRepository<JournalEntry, Long> {
}
