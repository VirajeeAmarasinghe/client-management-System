package Business;

public class Client {
    private int clientID;      //variable to store client id
    private String clientName; //variable to store client name
    private String addNo;      //variable to store address-no
    private String addStreet;  //variable to store address-street
    private String addCity;    //variable to store address-city
    private String nic;        //variable to store nic
    private String tele;       //variable to store telephone number
    private String email;      //variable to store email

    public Client() {
    }

    public Client(int clientID, String clientName, String addNo, String addStreet, String addCity, String nic, String tele, String email) {
        this.clientID = clientID;
        this.clientName = clientName;
        this.addNo = addNo;
        this.addStreet = addStreet;
        this.addCity = addCity;
        this.nic = nic;
        this.tele = tele;
        this.email = email;
    }

    public void setAddCity(String addCity) {
        this.addCity = addCity;
    }

    public void setAddNo(String addNo) {
        this.addNo = addNo;
    }

    public void setAddStreet(String addStreet) {
        this.addStreet = addStreet;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getAddCity() {
        return addCity;
    }

    public String getAddNo() {
        return addNo;
    }

    public String getAddStreet() {
        return addStreet;
    }

    public int getClientID() {
        return clientID;
    }

    public String getClientName() {
        return clientName;
    }

    public String getEmail() {
        return email;
    }

    public String getNic() {
        return nic;
    }

    public String getTele() {
        return tele;
    }
    
    
}
