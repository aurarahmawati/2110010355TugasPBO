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
public class datasetBagian {
    
    private ArrayList<Integer> idBagian;
    private ArrayList<String> namaBagian;
    
    public datasetBagian(){
        idBagian = new ArrayList<Integer>();
        namaBagian = new ArrayList<String>();
    }
    
    public void insertIdBagian(int isi){
        this.idBagian.add(isi);
    }
    
    public ArrayList<Integer> getrecordIdBagian(){
        return this.idBagian;
    }
    
    public void insertNamaBagian(String isi){
        this.namaBagian.add(isi);
    }
    
    public ArrayList<String> getrecordNamaBagian(){
        return this.namaBagian;
    }
    
    public void insertBagian(int idBagian, String namaBagian){
        this.idBagian.add(idBagian);
        this.namaBagian.add(namaBagian);
    }
    
}
