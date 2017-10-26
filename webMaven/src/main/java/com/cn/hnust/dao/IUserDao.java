package com.cn.hnust.dao;
import com.cn.hnust.pojo.User;

public interface IUserDao {
    int deleteByPrimaryKey(String username);
    int insert(User record);
    User selectByPrimaryKey(String username);
    int updateByPrimaryKey(User record);
}