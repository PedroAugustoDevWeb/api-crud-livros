package api.crud.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse.ResponseInfo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/livros")
public class Livro {
    
    @GetMapping
    public ResponseEntity getLivros() {
        return ResponseEntity.ok("ok");
    }
    
    @PostMapping
    public ResponseEntity postLivros() {
        return ResponseEntity.ok("ok");
    }

    @PutMapping
    public ResponseEntity putLivros() {
        return ResponseEntity.ok("ok");
    }

    @DeleteMapping
    public ResponseEntity deleteLivros() {
        return ResponseEntity.ok("ok");
    }
}
