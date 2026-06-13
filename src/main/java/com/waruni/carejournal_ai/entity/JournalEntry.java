package com.waruni.carejournal_ai.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "journal_entry")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JournalEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate entryDate;

    @Column(length = 1000)
    private String symptoms;

    @Column(length = 1000)
    private String medications;

    @Column(length = 2000)
    private String notes;
}
