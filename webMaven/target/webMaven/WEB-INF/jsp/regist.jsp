<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>  
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
<html>  
  <head>  
    <base href="<%=basePath%>">  
    <title>My JSP 'Feilong_register.jsp' starting page</title>  
    <meta http-equiv="pragma" content="no-cache">  
    <meta http-equiv="cache-control" content="no-cache">  
    <meta http-equiv="expires" content="0">      
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">  
    <meta http-equiv="description" content="This is my page">  
    <!--  
    <link rel="stylesheet" type="text/css" href="styles.css">  
    -->  
    <script>  
        function addCheck(){  
            var username=document.frmregist.username.value; 
            var age=document.frmregist.age.value;
            var password=document.frmregist.password.value;    
            var newword=document.frmregist.newword.value;   
            if(username==""){  
                alert("用户名不能为空!");  
                document.frmregist.username.focus();  
                return false;  
                }  
            if(age==""){  
                alert("年龄不能为空!");  
                document.frmregist.age.focus();  
                return false;  
                }  
            if(password==""){  
                alert("密码不能为空!");  
                document.frmregist.password.focus();   
                 return false;  
                 }  
            if(password != newword){  
                alert("两次输入密码不相同!");  
                document.frmregist.password.focus();   
                 return false;  
                 }  
        }  
        function validate(){  
            var flag = addCheck();  
            if(flag == false)  
                return false;  
            return true;  
        }  
    </script>  
  <body>  
    <center>  
    <font face="楷体" size="6" color="#000">注册界面</font>  
    <form action = "/webMaven/user/regist.do" name="frmregist" method = "post" >  
    <table width="300" height = "180" border="5" bordercolor="#A0A0A0">  
      <tr>  
        <th>用户名：</th>  
        <td><input type="text" name="username" value="输入16个字符以内" maxlength = "16" onfocus = "if(this.value == '输入16个字符以内') this.value =''"></td>  
      </tr>
      <tr>  
        <th>年&nbsp&nbsp&nbsp&nbsp齡：</th>  
        <td><input type="text" name="age" value="输入不大于3位的正整數" maxlength = "3" onfocus = "if(this.value == '输入不大于3位的正整數') this.value =''"></td>  
      </tr>   
      <tr>  
        <th>输入密码：</th>  
        <td><input type="text" name="password" value="输入20个字符以内" maxlength = "20" onfocus = "if(this.value == '输入20个字符以内') this.value =''"></td>  
      </tr>  
      <tr>  
        <th>确认密码：</th>  
        <td><input type="text" name="newword" value="重新输入密码" maxlength = "20" onfocus = "if(this.value == '重新输入密码') this.value =''"></td>  
      </tr>  
      <tr>  
        <td colspan = "2" align = "center">  
          <input type="submit" value="提交" onclick="return validate()" /> 
          <input type="reset" value="重  置">  
        </td>  
      </tr>  
    </table>  
    </form>  
    </center>  
  </body>  
</html>  