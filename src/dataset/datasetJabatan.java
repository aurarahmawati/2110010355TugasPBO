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
public class datasetJabatan {
    
    private ArrayList<Integer> idJabatan;
    private ArrayList<String> namaJabatan;
    private ArrayList<Integer> tglAktif;
    private ArrayList<Integer> tglBerakhir;
    private ArrayList<Integer> idKaryawan;
    private ArrayList<String> statusJabatan;
    
    public datasetJabatan(){
        idJabatan = new ArrayList<Integer>();
        namaJabatan = new ArrayList<String>();
        tglAktif = new ArrayList<Integer>();
        tglBerakhir = new ArrayList<Integer>();
        idKaryawan = new ArrayList<Integer>();
        statusJabatan = new ArrayList<String>();
    }
    
    public void insertIdJabatan (int isi){
        this.idJabatan.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdJabatan(){
        return this.idJabatan;
    }
    
    public void insertNamaJabatan (String isi){
        this.namaJabatan.add(isi);
    }
    
    public ArrayList<String> getRecordNamaJabatan(){
        return this.namaJabatan;
    }
    
    public void insertTglAktif (int isi){
        this.tglAktif.add(isi);
    }
    
    public ArrayList<Integer> getRecordTglAktif(){
        return this.tglAktif;
    }
    
    public void insertTglBerakhir (int isi){
        this.tglBerakhir.add(isi);
    }
    
    public ArrayList<Integer> getRecordTglBerakhir(){
        return this.tglBerakhir;
    }
    
    public void insertIdKaryawan (int isi){
        this.idKaryawan.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdKaryawan(){
        return this.idKaryawan;
    }
    
    public void insertStatusJabatan (String isi){
        this.statusJabatan.add(isi);
    }
    
    public ArrayList<String> getRecordStatusJabatan(){
        return this.statusJabatan;
    }
    
    public void insertJabatan(int idJabatan, String namaJabatan, int tglAktif, int tglBerakhir, int idKaryawan, String statusJabatan){
        this.idJabatan.add(idJabatan);
        this.namaJabatan.add(namaJabatan);
        this.tglAktif.add(tglAktif);
        this.tglBerakhir.add(tglBerakhir);
        this.idKaryawan.add(idKaryawan);
        this.statusJabatan.add(statusJabatan);
    }
}
