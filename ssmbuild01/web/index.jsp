<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
    <style>
      a{
        text-decoration: none;
        color: black;
        font-size: 18px;
      }
      h3{
        width: 180px;
        height: 38px;
        margin: 100px auto;
        line-height: 38px;
        text-align: center;
        background: deepskyblue;
        border-radius: 5px;
      }
    </style>
  </head>
  <body>
  <h3>
    <a href="${pageContext.request.contextPath}/book/allBook">
      查看书籍信息
    </a>
  </h3>
  <br>
  <h3>
    <a href="${pageContext.request.contextPath}/user/goLogin">
      登录
    </a>
  </h3>
  </body>
</html>
