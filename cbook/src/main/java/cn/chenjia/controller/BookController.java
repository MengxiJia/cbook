package cn.chenjia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.chenjia.core.bean.Adminster;
import cn.chenjia.core.bean.Book;
import cn.chenjia.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;
	
	@RequestMapping("/booklist")
	public String getBooklist() {
		return "booklist";
	}
	
	@RequestMapping("/AddBook")
	public String getAddBook() {
		return "addbook";
	}
	
	@RequestMapping("/AddBookFunc")
	public String AddBook(Book book) {
		boolean success = bookService.AddBook(book);
		if(success) {
			System.out.println("添加书成功");
		}else {
			System.out.println("添加书失败");
		}
		return "addbook";
	}
	
	@RequestMapping(value = "/BookList")
	public String getEditAdmin(Model model) {
		List<Book> books = bookService.selectAllBook();
		model.addAttribute("books", books);
		return "booklist";

	}
}
