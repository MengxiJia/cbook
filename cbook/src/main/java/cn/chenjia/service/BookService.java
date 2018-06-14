package cn.chenjia.service;

import java.util.List;

import cn.chenjia.core.bean.Adminster;
import cn.chenjia.core.bean.Book;

public interface BookService {
	public boolean AddBook(Book book);
	public Book UpdateBook(Book book);
	public boolean DeleteBook(Book book);
	public List<Book> selectAllBook();
}
