<%-- 
    Document   : displayClient
    Created on : Apr 29, 2016, 2:31:19 PM
    Author     : icbt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Client Details</title>
    </head>
    <body>
        <%@page import="Business.Client" %>
        <h1>Client Details!</h1>
        <table border="0" cellspacing="10">
                <tr>
                    <td>Client ID:</td>
                    <td>${client.clientID}</td>
                </tr> 
                <tr>
                    <td>Client Name:</td>
                    <td>${client.clientName}</td>
                </tr> 
                <tr>
                    <td>Address</td>
                    <td></td>
                </tr> 
                <tr>
                    <td>No:</td>
                    <td>${client.addNo}</td>
                </tr> 
                <tr>
                    <td>Street:</td>
                    <td>${client.addStreet}</td>
                </tr> 
                <tr>
                    <td>City:</td>
                    <td>${client.addCity}</td>
                </tr>
                <tr>
                    <td>NIC:</td>
                    <td>${client.nic}</td>
                </tr>
                <tr>
                    <td>Contact No:</td>
                    <td>${client.tele}</td>
                </tr>
                <tr>
                    <td>Email:</td>
                    <td>${client.email}</td>
                </tr>
                
            </table>
    </body>
</html>
