package com.cn.hnust.controller;  
  
import javax.annotation.Resource;  
import javax.servlet.http.HttpServletRequest;  
  
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;  
  
import com.cn.hnust.pojo.User;  
import com.cn.hnust.service.IUserService;  
  
@Controller  
@RequestMapping("/user")  
public class UserController {  
    @Resource  
    private IUserService userService;  
      
    @RequestMapping("/showUser")  
    public String toIndex(HttpServletRequest request,Model model){  
        String usesName = request.getParameter("username");  
        User user = this.userService.getUserByUserName(usesName);  
        model.addAttribute("user", user);  
        return "showUser";  
    }  
    @RequestMapping("/login.do")
    public String toLogin(HttpServletRequest request,Model model) {
    	String usesName = request.getParameter("username");     	
    	User user = this.userService.getUserByUserName(usesName);  
    	String message;
    	String password=request.getParameter("password");
    	System.out.println(usesName+"----->"+password);
    	if(this.userService.existUser(usesName, password)) {             
    		model.addAttribute("user",user);
    		return "logSuccess";
    	}else
    	{
    	  
    		  if(user==null) {
    	  	  message="用户不存在！";
    		  model.addAttribute("message", message);
    		  return "logFail";  	}
    		  else {
    			  message="密码错误！";
        		  model.addAttribute("message", message);
        		  return "logFail";}            
    	}	    		
    }
    @RequestMapping("/regist")
    public String userRegistList() {
    	return "regist";
    }
    @RequestMapping("/regist.do")
    public String userRegist(HttpServletRequest request,Model model) {
    	User user=new User();
    	user.setUserName(request.getParameter("username"));
    	user.setAge(Integer.parseInt(request.getParameter("age")));
    	user.setPassword(request.getParameter("password"));
    	
    	int add=this.userService.addUser(user);
    	if(add==1) {
    		model.addAttribute("message", "注册成功！");
    		model.addAttribute("user",user);
    		return "registSuccess";
    	}else {
    		model.addAttribute("message", "用户增加失败！");
    		return "registFail";
    	}
    	
    }
    
    
}  