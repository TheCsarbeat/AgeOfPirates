/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author erksm
 */
public class Message implements Serializable{
    
    private String user; 
    private String message;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Message(String user, String message) {
        this.user = user;
        this.message = message;
    }

    @Override
    public String toString() {
        return user + ": "+ message;
    }
    
}
