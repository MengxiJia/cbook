package cn.chenjia.core.dao;

import cn.chenjia.core.bean.Adminster;
import cn.chenjia.core.bean.AdminsterQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminsterDao {
    int countByExample(AdminsterQuery example);

    int deleteByExample(AdminsterQuery example);

    int deleteByPrimaryKey(Integer adid);

    int insert(Adminster record);

    int insertSelective(Adminster record);

    List<Adminster> selectByExample(AdminsterQuery example);

    Adminster selectByPrimaryKey(Integer adid);

    int updateByExampleSelective(@Param("record") Adminster record, @Param("example") AdminsterQuery example);

    int updateByExample(@Param("record") Adminster record, @Param("example") AdminsterQuery example);

    int updateByPrimaryKeySelective(Adminster record);

    int updateByPrimaryKey(Adminster record);
}