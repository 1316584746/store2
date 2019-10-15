<%--
  Created by IntelliJ IDEA.
  User: 梅国标
  Date: 2019/9/27
  Time: 9:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%--引入jstl第三方库--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <table border="1px" align="center">
       <tr>
           <th>员工编号</th>
           <th>身份证编号</th>
           <th>姓名</th>
           <th>卡号</th>
       </tr>
       <%--循环遍历数据--%>
       <c:forEach items="${employees}" var="empl">
           <tr>
           <th>${empl.EId}</th>
           <th>${empl.EIdCard}</th>
           <th>${empl.EName}</th>
           <th>${empl.ERfid}</th>
           </tr>
       </c:forEach>
   </table>

</body>
</html>
