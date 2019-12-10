package Servlets;

import Business.Login;
import DB.LoginDB;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class getLoginData extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = "";
        String message = "";
        String password = "";
        String userLevel="";
        try {
            if (request.getParameter("txtUserName").length() == 0 || request.getParameter("txtPass").length() == 0) {
                message = "Please fill out all the text boxes";
                url = "/Login.jsp";
            } else {
                Login l = new Login();
                l = LoginDB.getLoginInfo(request.getParameter("txtUserName"));
                if(l==null){
                   message="Password or username is incorrect";
                   url="/Login.jsp";
                }else if(request.getParameter("txtPass").equals(l.getPassword())){
                    userLevel=l.getUserLevel();
                    url="/index.jsp";
                }else{
                   url="/Login.jsp";
                   message="Password or username is incorrect";
                }
            }
        } catch (SQLException e) {
            message="Error in accessing login data";
            url="/error.jsp";
        } finally {
            request.setAttribute("message", message);
            request.setAttribute("userlevel", userLevel);
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
