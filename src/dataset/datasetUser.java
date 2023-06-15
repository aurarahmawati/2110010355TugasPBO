/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;
/**
 *
 * @author Asus Laptop
 */
public class datasetUser {
    
    private ArrayList<Integer> idUser;
    private ArrayList<String> usernameUser;
    private ArrayList<String> passwordUser;
    
    public datasetUser(){
        idUser = new ArrayList<Integer>();
        usernameUser = new ArrayList<String>();
        passwordUser = new ArrayList<String>();
    }
    
    public void insertIdUser(int isi){
        this.idUser.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdUser(){
        return this.idUser;
    }
    
     public void insertUsernameUser(String isi){
        this.usernameUser.add(isi);
    }
    
    public ArrayList<String> getRecordUsernameUser(){
        return this.usernameUser;
    }
    
     public void insertPasswordUser(String isi){
        this.passwordUser.add(isi);
    }
    
     public ArrayList<String> getRecordPasswordUser(){
        return this.passwordUser;
    }
     
     public void insertUser(int idUser, String usernameUser, String passwordUser){
         this.idUser.add(idUser);
         this.usernameUser.add(usernameUser);
         this.passwordUser.add(passwordUser);
     }
}
