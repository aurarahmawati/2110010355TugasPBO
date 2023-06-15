/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author Asus Laptop
 */
public class Bagian {
    private int idBagian;
    private String namaBagian;
    
    public Bagian(){}
    // Constructor
    public Bagian(int idBagian, String namaBagian) {
        this.idBagian = idBagian;
        this.namaBagian = namaBagian;
    }

    // Getter dan Setter
    public int getIdBagian() {
        return idBagian;
    }

    public void setIdBagian(int idBagian) {
        this.idBagian = idBagian;
    }

    public String getNamaBagian() {
        return namaBagian;
    }

    public void setNamaBagian(String namaBagian) {
        this.namaBagian = namaBagian;
    }

    // Method
    public void tampilkanInfoBagian() {
        System.out.println("ID Bagian : " + idBagian);
        System.out.println("Nama Bagian : " + namaBagian);
    }
}
