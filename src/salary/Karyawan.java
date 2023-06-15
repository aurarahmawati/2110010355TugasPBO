/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author Asus Laptop
 */
public class Karyawan {
    private int idKaryawan;
    private int nikKaryawan;
    private String namaKaryawan;
    private String alamatKaryawan;
    private String jenisKelamin;
    private int noTelepon;
    private String statusKaryawan;
    private String bagian;

    public Karyawan(){}
    // Constructor
    public Karyawan(int idKaryawan,int nikKaryawan, String namaKaryawan, String alamatKaryawan,String jenisKelamin, int noTelepon, String statusKaryawan, String bagian) {
        this.idKaryawan = idKaryawan;
        this.nikKaryawan = nikKaryawan;
        this.namaKaryawan = namaKaryawan;
        this.alamatKaryawan = alamatKaryawan;
        this.jenisKelamin = jenisKelamin;
        this.noTelepon = noTelepon;
        this.statusKaryawan = statusKaryawan;
        this.bagian = bagian;
    }

    // Getter dan Setter
    public int getIdKaryawan() {
        return idKaryawan;
    }

    public void setIdKaryawan(int idKaryawan) {
        this.idKaryawan = idKaryawan;
    }
    
    public int getNikKaryawan(){
        return nikKaryawan;
    }
    
    public void setNikKaryawan(int nikKaryawan) {
        this.nikKaryawan = nikKaryawan;
    }

    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    public String getAlamatKaryawan() {
        return alamatKaryawan;
    }

    public void setAlamatKaryawan(String alamatKaryawan) {
        this.alamatKaryawan =alamatKaryawan;
    }
    
     public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin =jenisKelamin;
    }
    
     public int getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(int noTelepon) {
        this.noTelepon =noTelepon;
    }
    
     public String getStatusKaryawan() {
        return statusKaryawan;
    }

    public void setStatusKaryawan(String statusKaryawan) {
        this.statusKaryawan =statusKaryawan;
    }

    public String getBagian() {
        return bagian;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    // Method
    public void tampilkanInfoKaryawan() {
        System.out.println("ID Karyawan : " + idKaryawan);
        System.out.println("NIK Karyawan : " + nikKaryawan);
        System.out.println("Nama Karyawan : " + namaKaryawan);
        System.out.println("Alamat Karyawan : " + alamatKaryawan);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("No Telepon : " + noTelepon);
        System.out.println("Status Karyawan : " + statusKaryawan);
        System.out.println("Bagian : " + bagian);
    }
}

