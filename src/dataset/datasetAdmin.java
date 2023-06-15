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
public class datasetAdmin {
    
    private ArrayList<Integer> idAdmin;
    private ArrayList<String> usernameAdmin;
    private ArrayList<String> passwordAdmin;
    
    public datasetAdmin(){
        idAdmin = new ArrayList<Integer>();
        usernameAdmin = new ArrayList<String>();
        passwordAdmin = new ArrayList<String>();
    }
    
    public void insertIdAdmin(int isi){
        this.idAdmin.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdAdmin(){
        return this.idAdmin;
    }
    
     public void insertUsernameAdmin(String isi){
        this.usernameAdmin.add(isi);
    }
    
    public ArrayList<String> getRecordUsernameAdmin(){
        return this.usernameAdmin;
    }
    
     public void insertPasswordAdmin(String isi){
        this.passwordAdmin.add(isi);
    }
    
     public ArrayList<String> getRecordPasswordAdmin(){
        return this.passwordAdmin;
    }
     
     public void insertAdmin(int idAdmin, String usernameAdmin, String passwordAdmin){
         this.idAdmin.add(idAdmin);
         this.usernameAdmin.add(usernameAdmin);
         this.passwordAdmin.add(passwordAdmin);
     }
}
