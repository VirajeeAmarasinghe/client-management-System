<%-- 
    Document   : Login
    Created on : 22-May-2016, 21:06:03
    Author     : Virajee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
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
        </style>
    </head>
    <body>
        <div id="main_section">
        <h1>Login</h1>
        <h3>${message}</h3>
        <form action="getLoginData" method="get">
            <table border="0" cellspacing="10">
               <tr>
                    <td>Username:</td>
                    <td><input type="text" name="txtUserName"></td>
                </tr> 
                <tr>
                    <td>Password:</td>
                    <td><input type="password" name="txtPass"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Log" name="btnLog"></td>
                </tr>                
            </table>
        </div>
    </body>
</html>
