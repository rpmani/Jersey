<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="restapi/jaxy/04">Single Parameter Test.
   </a> 
   <br/><br/><br/>
   <a href="restapi/jaxy/Mani/MSC/04">Multiple Parameter Test.
   </a> 
   <br/><br/>
    <a href="restapi/jaxy;name=adhi;class=10 th standard;rollNo=566671;id=566671">Matrix Parameter Test. 
  <!-- <a href="rest/jax/adhi;class=12th">Matrix Parameter Test. -->
  <br/><br/><br/>
   </a> 
   <center>
    <form action="restapi/jaxy/add" method="post">		
	Name : <input type="text" name="name" />
	<br/><br/>
	Roll No : <input type="text" name="rollNo" />
	<br/><br/>
	<input type="submit" value="Add Student" />
 </form>
</center>
</body>
</html>