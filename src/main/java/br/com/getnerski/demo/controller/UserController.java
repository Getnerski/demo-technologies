package br.com.getnerski.demo.controller;

import br.com.getnerski.demo.model.auth.dto.UserDTO;
import br.com.getnerski.demo.model.auth.entity.UserEntity;
import br.com.getnerski.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(userService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> findById(
            @PathVariable("id") final Long id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(userService.findById(id));
    }

    @PostMapping
    public ResponseEntity<UserDTO> save(
            @RequestBody UserEntity user) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(userService.save(user));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDTO> update(
            @PathVariable("id") final Long id,
            @RequestBody UserEntity user) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(userService.update(id, user));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(
            @PathVariable("id") final Long id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(userService.delete(id));
    }

    @PutMapping("/{id}/disable")
    public ResponseEntity<String> disabled(@PathVariable("id") final Long id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(userService.disabled(id));
    }
}
