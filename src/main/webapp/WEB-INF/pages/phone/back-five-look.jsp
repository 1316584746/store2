<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<link href="//netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
		<link rel="stylesheet" href="/static/css/bootstrap.min.css" />
		<link rel="stylesheet" href="/static/css/back-five-look.css" />
		<script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
		<script src="/static/lib/layui/layui.js" charset="utf-8"></script>
		<script  type="text/javascript" src="/static/js/xadmin.js" ></script>
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
                	<p style="color: #0E75C0;">设置新密码</p>
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
            	输入框
            -->   
            <form action="#" class="layui-form">
            <div class="inpt">
            	<input type="password" placeholder="请设置新密码" lay-verify="required"

				/>
            </div>
             <div class="inpt1">
            	<input type="password" placeholder="请再次确认新密码"  lay-verify="required"

				/>
            </div>
            <div class="inpt2">
            	<input type="submit" value="下一步" lay-submit lay-filter="inpt2"  />
            </div>
            </form>
            
               </div>
            </div>
        </div>  
	<script>
		$(function () {
			layui.use('form',function () {
				var form=layui.form;
				form.on('submit(inpt2)',function (data) {
				    console.log(data),
					$.ajax({
						type:"post",
						url:"${pageContext.request.contextPath}/phone/back-five-look",//数据提交到后端的位置
						data:data.field,//数据提交
						dataType:"json",
						success:function (data) {
							console.log(data);//将获得的数据显示在前端
							layer.msg(data.msg,function () {
								if(data.code == 200)
								    location.href='${pageContext.request.contextPath}/phone/back-six-look';
                            })
                        }
					});
				    return false;
                })
            })
        })
		
		
	</script>
	
	
	</body>
</html>
