package com.example.noteappbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@Controller
@RequestMapping(path = "/api")
public class MainController {
  @Autowired
  private UserRepository userRepository;

  @PostMapping(path = "/post")
  public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email) {

    User n = new User();
    n.setName(name);
    n.setEmail(email);
    userRepository.save(n);
    return "Saved";
  }

  @GetMapping(path = "/users")
  public @ResponseBody Iterable<User> getAllUsers() {
    return userRepository.findAll();
  }
}
