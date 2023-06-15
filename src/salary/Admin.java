/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author Asus Laptop
 */
public class Admin {
    private int idAdmin;
    private String usernameAdmin;
    private String passwordAdmin;
    
    public Admin(){}
     // Constructor
    public Admin(int idAdmin, String usernameAdmin, String passwordAdmin) {
        this.idAdmin = idAdmin;
        this.usernameAdmin = usernameAdmin;
        this.passwordAdmin = passwordAdmin;
    }

    // Getter dan Setter
    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getUsernameAdmin() {
        return usernameAdmin;
    }

    public void setUsernameAdmin(String usernameAdmin) {
        this.usernameAdmin = usernameAdmin;
    }

    public String getPasswordAdmin() {
        return passwordAdmin;
    }

    public void setPasswordAdmin(String passwordAdmin) {
        this.passwordAdmin =passwordAdmin;
    }


    // Method
    public void tampilkanInfoAdmin() {
        System.out.println("ID Admin : " + idAdmin);
        System.out.println("Username Admin : " + usernameAdmin);
        System.out.println("Password Admin : " + passwordAdmin);
    }
}

