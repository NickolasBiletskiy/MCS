<%--
  Created by IntelliJ IDEA.
  User: vitaly
  Date: 03.04.2015
  Time: 17:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-5" pageEncoding="ISO-8859-5"%>

<html><body>

<jsp:useBean id="gc" class="java.util.GregorianCalendar"/>

<jsp:getProperty name="gc" property="time"/>

<FORM action="viewall" method="POST">

  <INPUT type="submit" value="Вызвать сервлет">

</FORM>

</body></html>
