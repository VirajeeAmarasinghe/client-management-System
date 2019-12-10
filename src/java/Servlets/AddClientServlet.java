package Servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import Business.Client;
import java.io.*;
import DB.ClientDB;
import java.sql.SQLException;


public class AddClientServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = "";  //this variable is for storing the web page name
        String message = "";  //this variable is for storing the message
        Client client = null;
        try {
            int clientID = 0;
            //check the client id is entered or not
            if (request.getParameter("clientID").length() != 0) {
                clientID = Integer.parseInt(request.getParameter("clientID"));
            }
            //retrieve text field values
            String clientName = request.getParameter("clientName");
            String addNo = request.getParameter("addNo");
            String addStreet = request.getParameter("addStreet");
            String addCity = request.getParameter("addCity");
            String nic = request.getParameter("nic");
            String conNo = request.getParameter("conNo");
            String email = request.getParameter("email");
            client = new Client(clientID, clientName, addNo, addStreet, addCity, nic, conNo, email);

            //mandatory filed validations
            if (request.getParameter("clientID").length() == 0 || clientName.length() == 0 || addNo.length() == 0 || addStreet.length() == 0 || addCity.length() == 0 || nic.length() == 0 || conNo.length() == 0 || email.length() == 0) {
                message = "Please fill out all the text boxes";
                url = "/clientReg.jsp";
            } else { 
                int result;                
                result = ClientDB.addClient(client);
                if (result==1) {
                    url = "/displayClient.jsp";
                } else if(result==0) {
                    message = "Error in Inserting!!!!Contact System Administrator.";
                    url = "/error.jsp";
                }else if(result==2){
                   message="Error in Inserting!!!!Entered client id is already there.";
                   url="/clientReg.jsp";
                }
            }

        } catch (NumberFormatException | SQLException e) {
            message = "Error in Inserting!!!!Contact System Administrator.";
            url = "/error.jsp";
        } finally {
            request.setAttribute("client", client);
            request.setAttribute("message", message);
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        processRequest(request, response);

    }

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        processRequest(request, response);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
