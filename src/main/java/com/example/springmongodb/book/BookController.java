package com.example.springmongodb.book;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @GetMapping
    Iterable<Book> getAll() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    Optional<Book> getByid(@PathVariable String id) {
        return bookService.getById(id);
    }

    @PostMapping
    Book save(@RequestBody Book book) {
        return bookService.create(book);
    }

    @PutMapping("/{id}")
    Book update(@RequestBody Book book, @PathVariable String id) {
        return bookService.update(id, book);
    }

    @DeleteMapping(("/{id}"))
    void save(@PathVariable String id) {
        bookService.delete(id);
    }
}
