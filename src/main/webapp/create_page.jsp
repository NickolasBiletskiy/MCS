<%--
  Created by IntelliJ IDEA.
  User: vitaly
  Date: 23.03.2015
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page errorPage="error.jsp" %>
<html>
<head>
    <title>CREATE_PAGE</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style_page.css">
  <meta charset="utf-8">

  <Script Language="JavaScript1.1">
  var dn
  c1=new Image(); c1.src="img/clock/c1.gif"
  c2=new Image(); c2.src="img/clock/c2.gif"
  c3=new Image(); c3.src="img/clock/c3.gif"
  c4=new Image(); c4.src="img/clock/c4.gif"
  c5=new Image(); c5.src="img/clock/c5.gif"
  c6=new Image(); c6.src="img/clock/c6.gif"
  c7=new Image(); c7.src="img/clock/c7.gif"
  c8=new Image(); c8.src="img/clock/c8.gif"
  c9=new Image(); c9.src="img/clock/c9.gif"
  c0=new Image(); c0.src="img/clock/c0.gif"
  cb=new Image(); cb.src="img/clock/cb.gif"
  cam=new Image(); cam.src="img/clock/cam.gif"
  cpm=new Image(); cpm.src="img/clock/cpm.gif"
  function extract(h,m,s,type)
   {if (!document.images)
    return
    if (h<=9)
      {document.images.a.src=cb.src
       document.images.b.src=eval("c"+h+".src")}
    else
      {document.images.a.src=eval("c"+Math.floor(h/10)+".src")
       document.images.b.src=eval("c"+(h%10)+".src")}
    if (m<=9)
      {document.images.d.src=c0.src
       document.images.e.src=eval("c"+m+".src")}
    else
      {document.images.d.src=eval("c"+Math.floor(m/10)+".src")
       document.images.e.src=eval("c"+(m%10)+".src")}
    if (s<=9)
      {document.g.src=c0.src
       document.images.h.src=eval("c"+s+".src")}
    else
      {document.images.g.src=eval("c"+Math.floor(s/10)+".src")
       document.images.h.src=eval("c"+(s%10)+".src")}
    if (dn=="AM") document.j.src=cam.src
    else document.images.j.src=cpm.src}
  function show3()
    {if (!document.images)
       return
     var Digital=new Date()
     var hours=Digital.getHours()
     var minutes=Digital.getMinutes()
     var seconds=Digital.getSeconds()
     dn="AM"
     if ((hours>=12)&&(minutes>=1)||(hours>=13))
       {dn="PM"
        hours=hours-12}
     if (hours==0)
     hours=12
     extract(hours,minutes,seconds,dn)
     setTimeout("show3()",1000)}
</Script>

</head>
<body OnLoad="show3()">
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
            <a href="view_page.jsp">
              <div id="header_button">
                <h2>
                  Всі картки
                </h2>
              </div>
            </a>
          </td>
        </tr>

      </table>
    </div>
  </div>
    <table>
        <tr>
            <td class="left">
  <div id="left_column">
    <center>
      <Img Src="img/clock/cb.gif" Name="a"><Img Src="img/clock/cb.gif" Name="b"><Img Src="img/clock/colon.gif" Name="c">
      <Img Src="img/clock/cb.gif" Name="d"><Img Src="img/clock/cb.gif" Name="e"><Img Src="img/clock/colon.gif" Name="f">
      <Img Src="img/clock/cb.gif" Name="g"><Img Src="img/clock/cb.gif" Name="h"><Img Src="img/clock/cam.gif" Name="j">
    </center>
    <br>

    <table id="calendar3" style="width:200px; background: rgba(0, 0, 0, 0.8);margin-left: 40px;">
      <thead>
      <tr><td colspan="4"><select>
        <option value="0">Січень</option>
        <option value="1">Лютий</option>
        <option value="2">Березень</option>
        <option value="3">Квітень</option>
        <option value="4">Травень</option>
        <option value="5">Червень</option>
        <option value="6">Липень</option>
        <option value="7">Серпень</option>
        <option value="8">Вересень</option>
        <option value="9">Жовтень</option>
        <option value="10">Листопад</option>
        <option value="11">Грудень</option>
      </select><td colspan="3"><input type="number" value="" min="0" max="9999" size="4">
        <tr><td>Пн<td>Вт<td>Ср<td>Чт<td>Пт<td>Сб<td>Нд
      <tbody>
    </table>

    <script>
      function Calendar3(id, year, month) {
        var Dlast = new Date(year,month+1,0).getDate(),
                D = new Date(year,month,Dlast),
                DNlast = D.getDay(),
                DNfirst = new Date(D.getFullYear(),D.getMonth(),1).getDay(),
                calendar = '<tr>',
                m = document.querySelector('#'+id+' option[value="' + D.getMonth() + '"]'),
                g = document.querySelector('#'+id+' input');
        if (DNfirst != 0) {
          for(var  i = 1; i < DNfirst; i++) calendar += '<td>';
        }else{
          for(var  i = 0; i < 6; i++) calendar += '<td>';
        }
        for(var  i = 1; i <= Dlast; i++) {
          if (i == new Date().getDate() && D.getFullYear() == new Date().getFullYear() && D.getMonth() == new Date().getMonth()) {
            calendar += '<td class="today">' + i;
          }else{
            if (  // список официальных праздников
            (i == 1 && D.getMonth() == 0 && ((D.getFullYear() > 1897 && D.getFullYear() < 1930) || D.getFullYear() > 1947)) || // Новый год
            (i == 2 && D.getMonth() == 0 && D.getFullYear() > 1992) || // Новый год
            ((i == 3 || i == 4 || i == 5 || i == 6 || i == 8) && D.getMonth() == 0 && D.getFullYear() > 2004) || // Новый год
            (i == 7 && D.getMonth() == 0 && D.getFullYear() > 1990) || // Рождество Христово
            (i == 23 && D.getMonth() == 1 && D.getFullYear() > 2001) || // День защитника Отечества
            (i == 8 && D.getMonth() == 2 && D.getFullYear() > 1965) || // Международный женский день
            (i == 1 && D.getMonth() == 4 && D.getFullYear() > 1917) || // Праздник Весны и Труда
            (i == 9 && D.getMonth() == 4 && D.getFullYear() > 1964) || // День Победы
            (i == 12 && D.getMonth() == 5 && D.getFullYear() > 1990) || // День России (декларации о государственном суверенитете Российской Федерации ознаменовала окончательный Распад СССР)
            (i == 7 && D.getMonth() == 10 && (D.getFullYear() > 1926 && D.getFullYear() < 2005)) || // Октябрьская революция 1917 года
            (i == 8 && D.getMonth() == 10 && (D.getFullYear() > 1926 && D.getFullYear() < 1992)) || // Октябрьская революция 1917 года
            (i == 4 && D.getMonth() == 10 && D.getFullYear() > 2004) // День народного единства, который заменил Октябрьскую революцию 1917 года
            ) {
              calendar += '<td class="holiday">' + i;
            }else{
              calendar += '<td>' + i;
            }
          }
          if (new Date(D.getFullYear(),D.getMonth(),i).getDay() == 0) {
            calendar += '<tr>';
          }
        }
        for(var  i = DNlast; i < 7; i++) calendar += '<td>&nbsp;';
        document.querySelector('#'+id+' tbody').innerHTML = calendar;
        g.value = D.getFullYear();
        m.selected = true;
        if (document.querySelectorAll('#'+id+' tbody tr').length < 6) {
          document.querySelector('#'+id+' tbody').innerHTML += '<tr><td>&nbsp;<td>&nbsp;<td>&nbsp;<td>&nbsp;<td>&nbsp;<td>&nbsp;<td>&nbsp;';
        }
        document.querySelector('#'+id+' option[value="' + new Date().getMonth() + '"]').style.color = 'rgb(220, 0, 0)'; // в выпадающем списке выделен текущий месяц
      }
      Calendar3("calendar3",new Date().getFullYear(),new Date().getMonth());
      document.querySelector('#calendar3').onchange = function Kalendar3() {
        Calendar3("calendar3",document.querySelector('#calendar3 input').value,parseFloat(document.querySelector('#calendar3 select').options[document.querySelector('#calendar3 select').selectedIndex].value));
      }
    </script>
    </div>
                </td>
            <td>
  <div id="main_content">
    <h1>In this page you can create conscript card of new soldier</h1>
    <table style="margin-left: 220px">
    <form action="create" method="post">
  <br>
      <tr>
        <td>
          <h2>Surname:</h2>
        </td>
        <td>
      <input style="width: 200px;height: 30px;" type="text" name="surname"/>
        </td>
      </tr>
      <tr>
        <td>
          <h2>Name:</h2>
        </td>
        <td>
      <input style="width: 200px;height: 30px;"  type="text" name="name"/>
        </td>
      <tr>
      <td>
        <h2>FathersName:</h2>
      </td>
      <td>
      <input  style="width: 200px;height: 30px;" type="text" name="fathersname"/>
      </td>
      </tr>
      <tr>
        <td>
          <h2>PhoneNumber:</h2>
        </td>
        <td>
      <input  style="width: 200px;height: 30px;" type="text" name="phonenumber"/>
        </td>
      </tr>
      <tr>
        <td>
          <h2>PassportData:</h2>
        </td>
        <td>
      <input  style="width: 200px;height: 30px;" type="text" name="passportdata"/>
        </td>
      </tr>
      <tr>
        <td>
          <h2> MedicalID:</h2>
        </td>
        <td>
      <input  style="width: 200px;height: 30px;" type="text" name="medicalID"/>
        </td>
      </tr>
    </table>
  <input style="border-radius:10px; height: 40px;width: 120px;margin-bottom: 20px;" type="submit" value="Create new card"/>
    </form>

</div>
            </td>
            </tr>
        </table>
     <div id="footer">
    <h2>
      &copy 2015 Kyiv
    </h2>
  </div>
  </div>


</body>
</html>
