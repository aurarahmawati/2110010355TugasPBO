/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author Asus Laptop
 */
public class Jabatan {
    private int idJabatan;
    private String namaJabatan;
    private int tglAktif;
    private int tglBerakhir;
    private int idKaryawan;
    private String statusJabatan;
    
    public Jabatan(){}
     // Constructor
    public Jabatan(int idJabatan, String namaJabatan, int tglAktif, int tglBerakhir, int idKaryawan, String statusJabatan) {
        this.idJabatan = idJabatan;
        this.namaJabatan = namaJabatan;
        this.tglAktif = tglAktif;
        this.tglBerakhir = tglBerakhir;
        this.idKaryawan = idKaryawan;
        this.statusJabatan = statusJabatan;
    }

    // Getter dan Setter
    public int getIdJabatan() {
        return idJabatan;
    }

    public void setIdJabatan(int idJabatan) {
        this.idJabatan = idJabatan;
    }

    public String getNamaJabatan() {
        return namaJabatan;
    }

    public void setNamaJabatan(String namaJabatan) {
        this.namaJabatan = namaJabatan;
    }
    
    public int getTglAktif() {
        return tglAktif;
    }

    public void setTglAktif(int tglAktif) {
        this.tglAktif = tglAktif;
    }
    
    public int getTglBerakhir() {
        return tglBerakhir;
    }

    public void setTglBerakhir(int tglBerakhir) {
        this.tglBerakhir = tglBerakhir;
    }
    
     public int getIdKaryawan() {
        return idKaryawan;
    }

    public void setIdKaryawan(int idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public String getStatusJabatan() {
        return statusJabatan;
    }

    public void setStatusJabatan(String statusJabatan) {
        this.statusJabatan =statusJabatan;
    }


    // Method
    public void tampilkanInfoJabatan() {
        System.out.println("ID Jabatan : " + idJabatan);
        System.out.println("Nama Jabatan : " + namaJabatan);
        System.out.println("Tgl Aktif : " + tglAktif);
        System.out.println("Tgl Berakhir : " + tglBerakhir);
        System.out.println("ID Karyawan : " + idKaryawan);
        System.out.println("Status Jabatan : " + statusJabatan);
    }
}

