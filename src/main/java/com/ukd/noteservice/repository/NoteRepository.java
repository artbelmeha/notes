package com.ukd.noteservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ukd.noteservice.entity.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
    List<Note> findAllByUserId(Long personId);
}
