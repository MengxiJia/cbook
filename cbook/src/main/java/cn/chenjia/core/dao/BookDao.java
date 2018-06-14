package cn.chenjia.core.dao;

import cn.chenjia.core.bean.Book;
import cn.chenjia.core.bean.BookQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookDao {
    int countByExample(BookQuery example);

    int deleteByExample(BookQuery example);

    int deleteByPrimaryKey(Integer bid);

    int insert(Book record);

    int insertSelective(Book record);

    List<Book> selectByExample(BookQuery example);

    Book selectByPrimaryKey(Integer bid);

    int updateByExampleSelective(@Param("record") Book record, @Param("example") BookQuery example);

    int updateByExample(@Param("record") Book record, @Param("example") BookQuery example);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);
}