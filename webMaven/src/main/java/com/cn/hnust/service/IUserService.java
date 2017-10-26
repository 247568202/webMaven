package com.cn.hnust.service;

import com.cn.hnust.pojo.User;

public interface IUserService {
	public User getUserByUserName(String username);
	public int addUser(User record);
    public int deleteByUserName(String username);
    public int updateByUserName(User record);
    public Boolean existUser(String username,String password);
   }
