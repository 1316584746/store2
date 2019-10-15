<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<link href="//netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
		<link rel="stylesheet" href="/static/css/bootstrap.min.css" />
		<link rel="stylesheet" href="/static/css/back-four-look.css" />
	</head>
	<body>
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
			         	<img src="images/bg1.png" />
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
                <form action="#">
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
                	<p style="color: #0E75C0;">安全验证</p>
                	<p>设置新密码</p>
                	<p>设置成功</p>
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
               	输入密码
               -->
               <div class="inpt"> 
               	<div class="iphone">
                <input type="text" placeholder="请输入账号绑定的手机号"  value="">
                </div>
                <div class="code">
                <input type="text" placeholder="请输入手机验证码"  value="">
                <a href="#">
                <button value="重新发送（30S）">
                	重新发送(30S)
                </button>
                </a>
                </div>
               
                
                
                <!--
                	找回密码
                -->
                
                <div class="look1">
                	<input type="submit" value="找回密码" />                	    
                </div>
                
                
                
                </div>
                </form>
                
            </div>
           
            	
           
           
          

			    </div> 		
			
			</div>

		</body>
	</body>
</html>
