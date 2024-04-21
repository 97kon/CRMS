package com.example.testnosecurity.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.example.testnosecurity.pojo.Monday;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author liuqiming
* @description 针对表【monday】的数据库操作Mapper
* @createDate 2023-06-12 09:46:41
* @Entity com.example.testnosecurity.pojo.Monday
*/
@Mapper
public interface MondayMapper extends BaseMapper<Monday> {

    List<Monday> selectPositionByOne(@Param("one") String one);

    List<Monday> selectPositionByTwo(@Param("two") String two);


    List<Monday> selectPositionByThree(@Param("three") String three);

    List<Monday> selectPositionByFour(@Param("four") String four);

    List<Monday> selectPositionByFive(@Param("five") String five);
}




