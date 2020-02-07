package com.example.noteappbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@Controller
@RequestMapping(path = "/api")
public class MainController {
  @Autowired
  private NoteRepository noteRepository;

  @PostMapping(path = "/post")
  public @ResponseBody
  String addNewNote(@RequestParam String note) {

    Note n = new Note();
    n.setNote(note);
    noteRepository.save(n);
    return "Saved";
  }

  @GetMapping(path = "/notes")
  public @ResponseBody
  Iterable<Note> getAllNotes() {
    return noteRepository.findAll();
  }
}
