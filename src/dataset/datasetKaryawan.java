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
public class datasetKaryawan {
    
    private ArrayList<Integer> idKaryawan;
    private ArrayList<Integer> nikKaryawan;
    private ArrayList<String> namaKaryawan;
    private ArrayList<String> alamatKaryawan;
    private ArrayList<String> jenisKelamin;
    private ArrayList<Integer> noTelepon;
    private ArrayList<String> statusKaryawan;
    private ArrayList<String> bagian;
    
    public datasetKaryawan(){
        idKaryawan = new ArrayList<Integer>();
        nikKaryawan = new ArrayList<Integer>();
        namaKaryawan = new ArrayList<String>();
        alamatKaryawan = new ArrayList<String>();
        jenisKelamin = new ArrayList<String>();
        noTelepon = new ArrayList<Integer>();
        statusKaryawan = new ArrayList<String>();
        bagian = new ArrayList<String>();
    }
    
    public void insertIdKaryawan (int isi){
        this.idKaryawan.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdKaryawan(){
        return this.idKaryawan;
    }
    
    public void insertNikKaryawan (int isi){
        this.nikKaryawan.add(isi);
    }
    
    public ArrayList<Integer> getRecordNikKaryawan(){
        return this.nikKaryawan;
    }
    
    public void insertNamaKaryawan (String isi){
        this.namaKaryawan.add(isi);
    }
    
    public ArrayList<String> getRecordNamaKaryawan(){
        return this.namaKaryawan;
    }
    
    public void insertAlamatKaryawan (String isi){
        this.alamatKaryawan.add(isi);
    }
    
    public ArrayList<String> getRecordAlamatKaryawan(){
        return this.alamatKaryawan;
    }
    
    public void insertJenisKelamin (String isi){
        this.jenisKelamin.add(isi);
    }
    
    public ArrayList<String> getRecordJenisKelamin(){
        return this.jenisKelamin;
    }
    
    public void insertNoTelepon (int isi){
        this.noTelepon.add(isi);
    }
    
    public ArrayList<Integer> getRecordNoTelepon(){
        return this.noTelepon;
    }
    
    public void insertStatusKaryawan (String isi){
        this.statusKaryawan.add(isi);
    }
    
    public ArrayList<String> getRecordStatusKaryawan(){
        return this.statusKaryawan;
    }
    
    public void insertBagian (String isi){
        this.bagian.add(isi);
    }
    
    public ArrayList<String> getRecordBagian(){
        return this.bagian;
    }
    
    public void insertKaryawan(int idKaryawan,int nikKaryawan, String namaKaryawan, String alamatKaryawan,String jenisKelamin, int noTelepon, String statusKaryawan, String bagian) {
        this.idKaryawan.add(idKaryawan);
        this.nikKaryawan.add(nikKaryawan);
        this.namaKaryawan.add(namaKaryawan);
        this.alamatKaryawan.add(alamatKaryawan);
        this.jenisKelamin.add(jenisKelamin);
        this.noTelepon.add(noTelepon);
        this.statusKaryawan.add(statusKaryawan);
        this.bagian.add(bagian);
    }
}
