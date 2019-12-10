<%-- 
    Document   : displayAllClients
    Created on : May 4, 2016, 9:51:12 AM
    Author     : icbt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display All Clients</title>
        <style type="text/css">
            body {
                background-color:#cccccc;
                color: black;
                margin-top: 5em;
            }
            #main_section{
                margin-left: 20em;               
                border: solid 0.15em #ffffff;
                padding-left: 1.5em;
                padding-bottom: 1.5em;
                margin-right: 30em;
                margin-top:10em;
                width:50em;
            }
            table,tr,td{                
                border:solid 0.15em #ffffff;
            }
        </style>
    </head>
    <body>
        <div id="main_section">
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <h1>All Clients' Details</h1>
        <table>
            <tr>
                    <td>Client ID</td>
                    <td>Client Name</td>
                    <td>Address-No</td>
                    <td>Address-Street</td>
                    <td>Address-City</td>
                    <td>NIC</td>
                    <td>Telephone</td>
                    <td>Email</td>
                </tr>
            <c:forEach var="item" items="${clientList}">
                <tr>
                    <td>${item.clientID}</td>
                    <td>${item.clientName}</td>
                    <td>${item.addNo}</td>
                    <td>${item.addStreet}</td>
                    <td>${item.addCity}</td>
                    <td>${item.nic}</td>
                    <td>${item.tele}</td>
                    <td>${item.email}</td>
                </tr>
            </c:forEach>
        </table>
        </div>
    </body>
</html>
