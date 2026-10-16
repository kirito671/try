package com.kirito.test3;

public class NoteServiceImpl implements NoteService {
    @Override
    public void addNote(String title) {
        System.out.println("Adding note: " + title);
    }

    @Override
    public void deleteNote(Long id) {
        System.out.println("Deleting note with id: " + id);
    }
}
