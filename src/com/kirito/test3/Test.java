package com.kirito.test3;

public class Test {
    static void main() {
        NoteServiceImpl noteService = new NoteServiceImpl();
        noteService.addNote("title");
        noteService.deleteNote(1L);
    }
}
