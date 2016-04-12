<%@ page import="DAO.Factory" %>
<%@ page import="logic.Action" %>
<%@ page import="java.sql.SQLException" %>

<%--
  Created by IntelliJ IDEA.
  User: vitaly
  Date: 22.03.2015
  Time: 19:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page errorPage="error.jsp" %>


<html>
<head>
  <title>MCS</title>
  <meta charset="UTF-8">
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/myspage_style.css">
  <script type="text/javascript">
    window.onload = changeBG;
    function changeBG() {
      var first = 1;		// Первая картинка
      var last = 7;		// Последняя картинка
      var path = 'img/';		// Путь к каталогу с картинками

      var img_src='url("'+path+getRandomInt(first,last)+'.jpg")';
      var div = document.getElementById("main");
      div.style.backgroundImage=img_src;
    }
    function getRandomInt(min, max)
    {
      return Math.floor(Math.random() * (max - min + 1)) + min;
    }
  </script>

  <script>

  var userName = prompt('Login:', '');

  if ( userName == 'admin' ) {

  var pass = prompt('Password:', '');

  if ( pass == 'qwerty' ) {
  alert('You are welcome!!');
  } else if ( pass == null ) {
  alert('Login canceled');
    window.location.href = "authorization_error.jsp";
  } else {
  alert('Password is incorrect');
    window.location.href = "authorization_error.jsp";
  }

  } else if ( userName == null ) {
  // Обратите внимание: пустая строка не равна null,
  // т.е. проверка value == null обрабатывает именно нажатие "Отмена"
  alert('Login canceled');
    window.location.href = "authorization_error.jsp";
  } else {
    alert('Login is incorrect');
    window.location.href = "authorization_error.jsp";
  }

  </script>

</head>
<body id="main">
<div id="wrapper">
  <div id="header">
    <h1>
      Military Control System
    </h1>
    <br>
    <h2>
      Система обліку призовників
    </h2>

  </div>
  <table>
    <tr>
      <td>
        <a href="create_page.jsp">
          <div id="button">
            <h1>Create new card</h1>
          </div>
        </a>
      </td>
      <td>
        <%--<form action="view" method="post">--%>
          <%--<INPUT type="submit" value="Вызвать сервлет">--%>
        <%--</form>--%>
        <a href="view_page.jsp">
          <div id="button" style="margin-left: 90px;">
            <%--<FORM action="viewall" method="POST">--%>
              <%--<INPUT type="submit" value="Вызвать сервлет">--%>
            <%--</FORM>--%>
            <h1>View snd search cards</h1>
          </div>
        </a>
      </td>
    </tr>
  </table>
  <div id="copyrighter">
    <h3>
      &copy 2015 Kyiv
    </h3>

  </div>

</div>
</body>
</html>






