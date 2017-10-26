package com.cn.hnust.service.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.cn.hnust.dao.IUserDao;  
import com.cn.hnust.pojo.User;  
import com.cn.hnust.service.IUserService;  
  
@Service("userService")  
public class UserServiceImpl implements IUserService {  
    @Resource  
    private IUserDao userDao; 
   private static Logger logger = Logger.getLogger(IUserService.class);  

    @Override  
    public User getUserByUserName(String username) {  
        // TODO Auto-generated method stub  
        return this.userDao.selectByPrimaryKey(username);  
    }
    @Override
    public int addUser(User record) {
    	return this.userDao.insert(record);
    }
    @Override
    public int updateByUserName(User record) {
    	// TODO Auto-generated method stub
    	return this.userDao.updateByPrimaryKey(record);
    }
    @Override
    public int deleteByUserName(String username) {
    	// TODO Auto-generated method stub
    	return this.userDao.deleteByPrimaryKey(username);
    }
    @Override
    public Boolean existUser(String username,String password) {
    	
    	User user=this.userDao.selectByPrimaryKey(username);
        	if(user==null) {
    		return false;
    	}
    	System.out.println(username+"的密码为:"+user.getPassword());
    	if(user.getPassword().equals(password)) {
    		return true;
    	}
    	return false;
    	
    }
    

  
}  