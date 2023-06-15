/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author Asus Laptop
 */
public class User {
    private int idUser;
    private String usernameUser;
    private String passwordUser;
    
    public User(){}
     // Constructor
    public User(int idUser, String usernameUser, String passwordUser) {
        this.idUser = idUser;
        this.usernameUser = usernameUser;
        this.passwordUser = passwordUser;
    }

    // Getter dan Setter
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUsernameUser() {
        return usernameUser;
    }

    public void setUsernameUser(String usernameUser) {
        this.usernameUser = usernameUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser =passwordUser;
    }


    // Method
    public void tampilkanInfoUser() {
        System.out.println("ID User : " + idUser);
        System.out.println("Username User : " + usernameUser);
        System.out.println("Password User : " + passwordUser);
    }
}

