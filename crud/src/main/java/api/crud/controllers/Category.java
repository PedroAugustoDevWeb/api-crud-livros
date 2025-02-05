package api.crud.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("api/category")
public class Category {
    
    @GetMapping
    public ResponseEntity getCategory() {
        return ResponseEntity.ok("");
    }

    @PostMapping
    public ResponseEntity postCategory() {
        return ResponseEntity.ok("ok");
    }

    @PutMapping
    public ResponseEntity putCategory() {
        return ResponseEntity.ok("ok");
    }

    @DeleteMapping
    public ResponseEntity deleteCategory() {
        return ResponseEntity.ok("ok");
    }
    
}
