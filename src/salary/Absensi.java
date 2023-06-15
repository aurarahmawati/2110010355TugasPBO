/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author Asus Laptop
 */
public class Absensi {
    private int idAbsen;
    private int idKaryawan;
    private int tanggal;
    private String jamMasuk;
    private String jamKeluar;

    public Absensi(){}
    // Constructor
    public Absensi(int idAbsen, int idKaryawan, int tanggal, String jamMasuk, String jamKeluar) {
        this.idAbsen = idAbsen;
        this.idKaryawan = idKaryawan;
        this.tanggal = tanggal;
        this.jamMasuk = jamMasuk;
        this.jamKeluar = jamKeluar;
    }

    // Getter dan Setter
    public int getIdAbsen() {
        return idAbsen;
    }

    public void setIdAbsen(int idAbsen) {
        this.idAbsen = idAbsen;
    }

    public int getIdKaryawan() {
        return idKaryawan;
    }

    public void setIdKaryawan(int idKaryawan) {
        this.idKaryawan = idKaryawan;
    }
    
    public int getTanggal() {
        return tanggal;
    }
    
    public void setTanggal (int tanggal) {
        this.tanggal = tanggal;
    }

    public String getJamMasuk() {
        return jamMasuk;
    }

    public void setJamMasuk(String jamMasuk) {
        this.jamMasuk = jamMasuk;
    }

    public String getJamKeluar() {
        return jamKeluar;
    }

    public void setJamKeluar(String jamKeluar) {
        this.jamKeluar = jamKeluar;
    }

    // Method
    public void tampilkanInfoAbsensi() {
        System.out.println("ID Absen : " + idAbsen);
        System.out.println("ID Karyawan : " + idKaryawan);
        System.out.println("Tanggal : " + tanggal);    
        System.out.println("Jam Masuk : " + jamMasuk);
        System.out.println("Jam Keluar : " + jamKeluar);
    }
}