<%-- 
    Document   : displayClientData
    Created on : May 2, 2016, 11:51:52 AM
    Author     : icbt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Client Details</title>
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
        <h1>Client Details</h1>
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
        </div>
    </body>
</html>
