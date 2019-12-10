<%-- 
    Document   : clientReg
    Created on : Apr 29, 2016, 2:16:53 PM
    Author     : icbt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>Client Registration</title>        
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
            }            
        </style>
    </head>
    <body>
        <div id="main_section">        
        <h1>Welcome to Client Registration</h1>
        <h3>${message}</h3>
        <form action="AddClient" method="get">
            <table border="0" cellspacing="10">
                <tr>
                    <td>Client ID:</td>"
                    <td><input type="number" name="clientID" value=${client.clientID}></td>
                </tr> 
                <tr>
                    <td>Client Name:</td>
                    <td><input type="text" name="clientName" value=${client.clientName}></td>
                </tr> 
                <tr>                
                    <td>Address</td>
                    <td></td>
                </tr> 
                <tr>
                    <td>No:</td>
                    <td><input type="text" name="addNo" value=${client.addNo}></td>
                </tr> 
                <tr>
                    <td>Street:</td>
                    <td><input type="text" name="addStreet" value=${client.addStreet}></td>
                </tr> 
                <tr>
                    <td>City:</td>
                    <td><input type="text" name="addCity" value=${client.addCity}></td>
                </tr>                
                <tr>
                    <td>NIC:</td>
                    <td><input type="text" name="nic" value=${client.nic}></td>
                </tr>
                <tr>
                    <td>Contact No:</td>
                    <td><input type="text" name="conNo" value=${client.tele}></td>
                </tr>
                <tr>
                    <td>Email:</td>
                    <td><input type="email" name="email" value=${client.email}></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Save"></td>
                </tr> 
            </table>
        </form>
        </div>
    </body>
</html>
