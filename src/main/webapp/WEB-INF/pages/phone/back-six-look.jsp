<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<link href="//netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
		<link rel="stylesheet" href="/static/css/bootstrap.min.css" />
		<link rel="stylesheet" href="/static/css/back-six-look.css" />
	</head>
	<body>
		
				<div class="box1">
			<div class="logo">
				<p>超市管理系统</p>
				<p id="logo1" >Supermarket Management System</p>
			</div>
			<div class="middle-box">
				<!--
            	左边的盒子
            -->	     
				<div class="service-box1">	
			         	<img src="/static/images/bg1.png" />
			         </div>
				<!--
                	右边的盒子
                -->
				<div class="service-box">
                                         <!--
                                         	可截
                                         -->					
                <div class="tlt">
                	<a id="look" href="#">找回密码</a>
                	<i class="fa fa-mail-reply">
                	<a id="look1" href="#">返回登陆</a>	
                	</i>            
                </div> 
                <!--
                	按钮
                -->
                
                <div class="btn">
                	<div class="btn1">
                	<input type="button"  value="通过绑定手机找回"/>
                	</div>
                	<div class="btn2">
                	<input type="button"  value="通过绑定邮箱找回"/>
                	</div>
                </div>
                <!--
                	验证
                -->
                <div class="verify">
                	<p >安全验证</p>
                	<p >设置新密码</p>
                	<p style="color: #0E75C0;">设置成功</p>
                	<div class="verify1">
                		<div id="rud"></div>                	   
                		<div id="rud"></div>               	    
                		<div id="rud"></div>                		
                	</div>
                	<div class="verify2">
                		<div id="line"></div>                	   
                		<div id="line"></div>               	                  		
                	</div>                	                	                	                                             	
                </div>
               
               
               
              <!--
              	完成
              -->            
              <div class="com">
              	<img src="/static/images/com.png"/>
              </div>
              <div class="com1">
              	<p>新密码设置成功！</p>
              	<a href="#">
              	<input  type="button" value="返回登陆页面" onclick='location.href="${pageContext.request.contextPath}/login/page"'/>
              	</a>
              </div>
                
                
            </div>                	                	                	                                             	
        </div> 
    </div>      
                
	</body>
</html>
