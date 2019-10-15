<%--
  Created by IntelliJ IDEA.
  User: 梅国标
  Date: 2019/10/10
  Time: 12:00
  To change this template use File | Settings | File Templates.
--%>
<%--引入jstl第三方库--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title></title>
    <link rel="stylesheet" href="/static/css/login.css"/>
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script src="/static/lib/layui/layui.js" charset="utf-8"></script>
     <script type="text/javascript" src="/static/js/xadmin.js"></script>
</head>
<body>
<div class="box1">
    <div class="middle-box">

        <div class="service-box1">
            <img src="/static/images/background1.png"/>
        </div>
        <!--
        左边的盒子pag
        -->
        <form method="post" class="layui-form" >
            <div class="service-box">
                <div class="name">超市管理系统</div>
                <div class="logo-input">
                    <div class="logo">
                        <img src="/static/images/logo.png"/>
                    </div>
                    <div class="inputBox">
                        <input type="text" lay-verify="required"  placeholder="账号" name="eRfid"  class="layui-input" >
                    </div>
                </div>
                <!--
                    密码
                -->
                <div class="logo-input1">
                    <div class="logo">
                        <img src="/static/images/logo1.png"/>
                    </div>
                    <div class="inputBox">
                        <input type="password"  lay-verify="required" placeholder="密码" maxlength="8" name="ePassword"  class="layui-input" >
                    </div>
                </div>
                <!--
                    忘记密码
                -->
                <div class="password">
                    <a href="" onclick="window.open('${pageContext.request.contextPath}/phone/back-third-look')">忘记密码</a>
                </div>

                <!--
                    登录
                -->
                <div class="login" >
                    <input type="submit" value="登录" lay-submit lay-filter="login"  >
                </div>

            </div>
        </form>

    </div>
</div>
<script>
    $(function(){
        layui.use('form', function(){
            var form = layui.form;
            //监听提交
            form.on('submit(login)', function(data){
                //data.field是我们填写的表单的信息
                //console.log(data),
                $.ajax({
                    type:"post",//表单的提价方法
                    url:"${pageContext.request.contentType} /login/action",//提交到后端接收数据的地址
                    data:data.field,//提交到后端的数据
                    dataType:"json",//后端返回的数据类型
                    success:function (data) {
                        // data : 后端返回的json数据
                        console.log(data);
                        layer.msg(data.msg,function(){
                            if(data.code==200)
                                location.href='${pageContext.request.contentType}/home';
                        });
                    }
                });

                return false;
            });
        });
    })

</script>

</body>
</html>

