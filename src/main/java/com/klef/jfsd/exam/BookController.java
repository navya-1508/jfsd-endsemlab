package com.klef.jfsd.exam;

import com.klef.jfsd.exam.Book;
import com.klef.jfsd.exam.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable("id") Long bookId, @RequestBody Book updatedBook) {
        return bookService.updateBook(bookId, updatedBook);
    }
}
