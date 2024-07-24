package cl.praxis.gestorbiblioteca.controller;

import cl.praxis.gestorbiblioteca.entity.Book;
import cl.praxis.gestorbiblioteca.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OperationsController {
    @Autowired
    private IBookService bookService;
    @GetMapping("/books")
    public String showBooksForm(ModelMap map) {
        map.addAttribute("book", new Book());
        map.addAttribute("books", bookService.getAllBooks());
        return "catalogue";
    }
    @PostMapping("/books")
    public String addBook(@ModelAttribute Book book) {
        bookService.saveBook(book);
        return "redirect:/books";
    }
}

