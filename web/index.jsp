<%-- 
    Document   : index
    Created on : 23-May-2016, 20:10:46
    Author     : Virajee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
        <style type="text/css">
            body {
                background-color:#cccccc;
                color: black;
                margin-top: 5em;
            }
            #main_section{
                margin-left: 25em;               
                border: solid 0.15em #ffffff;
                padding-left: 1.5em;
                padding-bottom: 1.5em;
                margin-right: 30em;
                margin-top:10em;
            }   
            input{                
                margin-bottom: 1em;
                margin-left: 2em;
                padding-top: 1em;
                padding-bottom: 1em;
                padding-left: 5em;
                padding-right: 5em;
            }
        </style>
    </head>
    <body>
        <div id="main_section">
        <h1>Welcome to Home Page</h1>
        <%
          String user_level=(String)request.getAttribute("userlevel");
         String disabled="";
          if(!user_level.equals("Administrator")){
            disabled="disabled";
          }
        %> 
   
        <a href="clientReg.jsp"><input type="button" value="Register Client" <%=disabled%>></a><br>
        <a href="findClient.jsp"><input type="button" value="Search   Client" <%=disabled%>></a><br>
        <form action="getAll" method="post">
            <input type="submit" value="Get All Clients" name="btnSub">
        </form>
        </div>
    </body>
</html>
