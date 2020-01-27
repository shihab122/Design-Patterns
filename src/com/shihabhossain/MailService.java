package com.shihabhossain;

public class MailService {
    public void sendMail(String mail){
        connect();
        authenticate();
        System.out.println("Send " + mail + " Successfully");
        disconnect();
    }

    private void connect(){
        System.out.println("Connect");
    }

    private void disconnect(){
        System.out.println("Disconnect");
    }

    private  void authenticate(){
        System.out.println("Authenticate");
    }
}
