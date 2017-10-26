package org.zsl.testmybatis;
import javax.annotation.Resource;  

import org.apache.log4j.Logger;  
import org.junit.Before;  
import org.junit.Test;  
import org.junit.runner.RunWith;  
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
import org.springframework.test.context.ContextConfiguration;  
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;  
  
import com.alibaba.fastjson.JSON;  
import com.cn.hnust.pojo.User;  
import com.cn.hnust.service.IUserService;  
  
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
  
public class TestMyBatis {  
    private static Logger logger = Logger.getLogger(TestMyBatis.class);  
//  private ApplicationContext ac = null;  
    @Resource  
    private IUserService userService = null;  
    
  
//  @Before  
//  public void before() {  
//      ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
//      userService = (IUserService) ac.getBean("userService");  
//  }  
  
    @Test  
    public void test1() {  
        User user = userService.getUserByUserName("郭荣飞");
        User record= new User();
        record.setAge(50);
        record.setUserName("郭荣飞");
        record.setPassword("123456");      
        userService.addUser(record);
        User user1 = userService.getUserByUserName("郭荣飞");
        int dd = userService.deleteByUserName("郭荣飞");
        logger.info("dd="+dd);
        
        if(dd==1) {
        	logger.info("用户删除成功！");
        }else
        {
        	logger.info("用户删除失败！");
        }
        

        // System.out.println(user.getUserName());  
        // logger.info("值："+user.getUserName());  
        logger.info(JSON.toJSONString(user)); 
        logger.info(JSON.toJSONString(user1)); 
        
    }  
}  