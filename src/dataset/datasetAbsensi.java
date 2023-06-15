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
public class datasetAbsensi {
    
    private ArrayList<Integer> idAbsen;
    private ArrayList<Integer> idKaryawan;
    private ArrayList<Integer> tanggal;
    private ArrayList<String> jamMasuk;
    private ArrayList<String> jamKeluar;
    
    public datasetAbsensi(){
        idAbsen = new ArrayList<Integer>();
        idKaryawan = new ArrayList<Integer>();
        tanggal = new ArrayList<Integer>();
        jamMasuk = new ArrayList<String>();
        jamKeluar = new ArrayList<String>();
    }
    
    public void insertIdAbsen (int isi){
        this.idAbsen.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdAbsen(){
        return this.idAbsen;
    }
    
     public void insertIdKaryawan (int isi){
        this.idKaryawan.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdKaryawan(){
        return this.idKaryawan;
    }
    
     public void insertTanggal (int isi){
        this.tanggal.add(isi);
    }
    
    public ArrayList<Integer> getRecordTanggal(){
        return this.tanggal;
    }
    
     public void insertJamMasuk (String isi){
        this.jamMasuk.add(isi);
    }
    
    public ArrayList<String> getRecordJamMasuk(){
        return this.jamMasuk;
    }
    
   public void insertJamKeluar (String isi){
        this.jamKeluar.add(isi);
    }
    
    public ArrayList<String> getRecordJamKeluar(){
        return this.jamKeluar;
    }  
    
    public void insertAbsensi(int idAbsen, int idKaryawan, int tanggal, String jamMasuk, String jamKeluar){
        this.idAbsen.add(idAbsen);
        this.idKaryawan.add(idKaryawan);
        this.tanggal.add(tanggal);
        this.jamMasuk.add(jamMasuk);
        this.jamKeluar.add(jamKeluar);
    }
}
