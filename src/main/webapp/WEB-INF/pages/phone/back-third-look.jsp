<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>		
		<link href="//netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
		<link rel="stylesheet" href="/static/css/bootstrap.min.css" />
		<link rel="stylesheet" href="/static/css/back-third-look.css" />
		<script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
		<script type="text/javascript" src="/static/js/jquery.form.js"></script>

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
          <form action="#">
               <div class="inpt"> 
               	<div class="iphone" >
                <input type="text" placeholder="请输入账号绑定的手机号"  id="phoneNumber" value="">
                </div>
                <div class="code">
                <input type="text" placeholder="请输入手机验证码"  value="">
                <a href="#">
                <button value="获取手机验证码" id="sendVerifyCode">
                	获取手机验证码
                </button>
                </a>
                </div>
                
                </div>
                
                
                <!--
                	找回密码
                -->
                
                <div class="look1">
                	<input type="submit" value="找回密码"  onclick='location.href="${pageContext.request.contextPath}/phone/back-five-look"' />
                </div>
            </form>
                
                
                
                </div>
                
            </div>

			    </div> 		

<script type="text/javascript">
	$(function(){
        //给发送验证码按钮添加事件
        $("#sendVerifyCode").click(function() {
            var phoneNumber = $("#phoneNumber").val(); //获取到手机号后发送ajax请求
            var _this = $(this);
            _this.attr("disabled", true); //点击之后立刻禁用按钮
			if(phoneNumber){
			    $.ajax({
					type:"post",
					url:"/sendVerifyCode.do",
					dataType:"json",
					data:{
					    //发送到服务器的数据
						phoneNumber : phoneNumber
					},
					success:function(data){
					    if(data.success){
					        var count=60;
					        var timer=window.setInterval(function () {
                                   count--;
                                   if(count<= 0){
                                       window.clearInterval(timer);
                                       this.text("重新发送验证码");
                                       _this.atter("disabled",false);
								   }else {
                                       _this.text(count+"秒后重新发送");
								   }
                            },1000);
						} else  {
					        $.message.popup(data.msg);
					        _this.atter("disabled",false);
						}
				}
				});
			}
        })

	});

</script>
			

	</body>
</html>
