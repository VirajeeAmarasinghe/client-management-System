<%-- 
    Document   : findClient
    Created on : May 2, 2016, 11:52:12 AM
    Author     : icbt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Find Client</title>
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
        <h1>Welcome to Find Client Page</h1>
        <form action="getClient" method="get">
            <table border="0" cellspacing="10">
                <tr>
                    <td>Client ID:</td>
                    <td><input type="number" name="clientID"></td>
                </tr> 
                <tr>
                    <td></td>
                    <td><input type="submit" value="Search"></td>
                </tr> 
            </table>
        </div>
    </body>
</html>
