package com.mayousheng.www.mapper;

import com.mayousheng.www.pojo.User;
import org.springframework.stereotype.Repository;

@Repository(value = "userMapper")
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}