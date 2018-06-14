package cn.chenjia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.chenjia.core.bean.Adminster;
import cn.chenjia.core.bean.AdminsterQuery;
import cn.chenjia.core.bean.Book;
import cn.chenjia.core.bean.BookQuery;
import cn.chenjia.core.dao.BookDao;

@Service("bookService")
@Transactional
public class BookServiceImpl implements BookService {
	@Autowired
	private BookDao bookDao;
	
	public boolean AddBook(Book book) {
		// TODO Auto-generated method stub
		int count = bookDao.insert(book);
		boolean success = false;
		if(count>0) {
			success = true;
		}
		return success;
	}

	public Book UpdateBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean DeleteBook(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Book> selectAllBook() {
		// TODO Auto-generated method stub
		BookQuery bookQuery =new BookQuery();
		List<Book> books = bookDao.selectByExample(bookQuery);
		return books;

	}

}
