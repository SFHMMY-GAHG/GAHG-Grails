<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta name="layout" content="main"/>
<title>Insert title here</title>
</head>
<body>
  <div class="body">
  <table>
  <tr>
    <th>Username</th>
    <th>Post</th>
  </tr>
  <g:each in="${posts}" var="p">
	<tr>
    <td>${p.username}</td>
    <td>${p.post }</td>
    <td>${p.date_created }</td>
  </tr>
</g:each>
</table>
  </div>
</body>
</html>