package com.ukd.noteservice.service;


import java.util.List;

import com.ukd.noteservice.entity.Note;

public interface NoteService {

    List<Note> getNoteByUserId(Long personId);

    Note createNote(Note note);
}
