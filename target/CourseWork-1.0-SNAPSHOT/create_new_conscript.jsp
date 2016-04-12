<%@ page import="DAO.Factory" %>
<%@ page import="logic.ConscriptCard" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: vitaly
  Date: 26.03.2015
  Time: 19:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style_page.css">
</head>
<body>
<div id="wrapper">
  <div id="header">
    <img src="http://upload.wikimedia.org/wikipedia/commons/thumb/5/55/Emblem_of_the_Ukrainian_Armed_Forces.svg/2000px-Emblem_of_the_Ukrainian_Armed_Forces.svg.png">
    <div id="header_text">
      <h1>
        Military Control System
      </h1>
      <h2>
        Система обліку призовників
      </h2>
    </div>
    <div id="header_menu">
      <table>
        <tr>
          <td>
            <a href="mypage.jsp">
              <div id="header_button">
                <h2>
                  На головну

                </h2>
              </div>
            </a>
          </td>
          <td>
            <a href="create_page.jsp">
              <div id="header_button">
                <h2>
                  Створити картку
                </h2>
              </div>
            </a>
          </td>
          <td>
            <a href="">
              <div id="header_button">
                <h2>
                  Оноввити
                </h2>
              </div>
            </a>
          </td>
        </tr>

      </table>
    </div>
  </div>
  <div id="left_column">
    <script type="text/javascript">
      var lastResFind=""; // последний удачный результат
      var copy_page=""; // копия страницы в ихсодном виде
      function TrimStr(s) {
        s = s.replace( /^\s+/g, '');
        return s.replace( /\s+$/g, '');
      }
      function FindOnPage(inputId) {//ищет текст на странице, в параметр передается ID поля для ввода
        var obj = window.document.getElementById(inputId);
        var textToFind;

        if (obj) {
          textToFind = TrimStr(obj.value);//обрезаем пробелы
        } else {
          alert("Шуканий призовник не знайдений");
          return;
        }
        if (textToFind == "") {
          alert("Введіть значення в поле пошуку");
          return;
        }

        if(document.body.innerHTML.indexOf(textToFind)=="-1")
          alert("Нічого не знайдено, перевірте правильність введення");

        if(copy_page.length>0)
          document.body.innerHTML=copy_page;
        else copy_page=document.body.innerHTML;


        document.body.innerHTML = document.body.innerHTML.replace(eval("/name="+lastResFind+"/gi")," ");//стираем предыдущие якори для скрола
        document.body.innerHTML = document.body.innerHTML.replace(eval("/"+textToFind+"/gi"),"<a name="+textToFind+" style='background:red'>"+textToFind+"</a>"); //Заменяем найденный текст ссылками с якорем;
        lastResFind=textToFind; // сохраняем фразу для поиска, чтобы в дальнейшем по ней стереть все ссылки
        window.location = '#'+textToFind;//перемещаем скрол к последнему найденному совпадению
      }
    </script>


    <h2>Пошук</h2>
    <input type="text" id="text-to-find" value="">
    <input type="button" onclick="javascript: FindOnPage('text-to-find'); return false;" value="Знайти"/>
    <br/><i>Введіть прізвище, ім'я чи по-бітькові</i>
    <hr/>
    <br>
    <form action="view_profile.jsp" method="get">
      <input type="text" name="ID" id="id">
      <input type="submit" value="SerchByID"/>
    </form>
  </div>
  <div id="main_content">
<%
String surname = request.getParameter("surname");
String name = request.getParameter("name");
String fathers_name = request.getParameter("fathersname");
String phone_number = request.getParameter("phonenumber");
String passportdata = request.getParameter("passportdata");
String medicalID = request.getParameter("medicalID");
ConscriptCard card = new ConscriptCard(name,surname,fathers_name,phone_number,passportdata,medicalID);
Factory.getInstance().getConscriptCardDAO().addObject(card);
%>



    <%!List<ConscriptCard> cards = null;%>
    <%  cards=Factory.getInstance().getConscriptCardDAO().getAllCards();
      for (ConscriptCard a: cards){ %>
    <tr><td>
      <form action="view_profile.jsp" method="get">
        <h3>  <%=a.getSurName()%> <%=a.getName()%> <%=a.getFathersName()%></h3></td><td><input type="submit" value="<%=a.getId()%>" name="ID"/>
      </form></td>
      <script>
        arrayOfSurnmes[<%=a.getId()%>]="<%=a.getSurName()%>";
      </script>
    </tr>
    <%}%>
    </table>
  </div>
  <div id="footer">
    <h2>
      &copy 2015 Kyiv
    </h2>
  </div>

  </div>


</body>
</html>
