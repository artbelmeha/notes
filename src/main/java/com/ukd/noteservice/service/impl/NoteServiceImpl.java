package com.ukd.noteservice.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ukd.noteservice.entity.Note;
import com.ukd.noteservice.repository.NoteRepository;
import com.ukd.noteservice.service.NoteService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class NoteServiceImpl implements NoteService {
    private final NoteRepository noteRepository;

    @Override
    public List<Note> getNoteByUserId(Long userId) {
        return noteRepository.findAllByUserId(userId);
    }

    @Override
    public Note createNote(Note note) {
        return noteRepository.save(note);
    }
}
