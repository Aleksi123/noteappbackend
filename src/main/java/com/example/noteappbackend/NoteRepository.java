package com.example.noteappbackend;

import org.springframework.data.repository.CrudRepository;

import com.example.noteappbackend.Note;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface NoteRepository extends CrudRepository<Note, Integer> {

}