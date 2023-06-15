/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2110010355;

import salary.*;
import dataset.*;
import forms.*;
/**
 * 
 *
 * @author Asus Laptop
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /** Absensi absensi = new Absensi();
        Admin admin = new Admin();
        Bagian bagian = new Bagian();
        Jabatan jabatan = new Jabatan();
        Karyawan karyawan = new Karyawan();
        User user = new User(); 
        
        //set
        karyawan.setIdKaryawan(1);
        absensi.setIdAbsen(3);
        
        //get
        System.out.println("ID Karyawan : " + karyawan.getIdKaryawan());
        System.out.println("ID Absen : " + absensi.getIdAbsen());
       
       //Memasukkan Array List kedalam object
       datasetUser user = new datasetUser();
       datasetAdmin admin = new datasetAdmin();
       datasetAbsensi absen = new datasetAbsensi();
       datasetKaryawan karyawan = new datasetKaryawan();
       datasetJabatan jabatan = new datasetJabatan();
       datasetBagian bagian = new datasetBagian();
       
       //Menginput data ArrayList pada masing-masing tabel
       user.insertIdUser(001);
       user.insertUsernameUser("aura");
       user.insertPasswordUser("bjm123");
       user.insertUser(002, "rahma", "bjm");
       
       admin.insertIdAdmin(111);
       admin.insertUsernameAdmin("nanda");
       admin.insertPasswordAdmin("bjb123");
       admin.insertAdmin(112, "risna", "bjb");
       
       absen.insertIdAbsen(222);
       absen.insertIdKaryawan(003);
       absen.insertTanggal(18);
       absen.insertJamMasuk("08.00");
       absen.insertJamKeluar("17.00");
       absen.insertAbsensi(223, 003, 19, "07.00", "16.00");
       
       karyawan.insertIdKaryawan(004);
       karyawan.insertNikKaryawan(005);
       karyawan.insertNamaKaryawan("wati");
       karyawan.insertAlamatKaryawan("jl.hksn");
       karyawan.insertJenisKelamin("perempuan");
       karyawan.insertNoTelepon(123456);
       karyawan.insertStatusKaryawan("tetap");
       karyawan.insertBagian("operator");
       karyawan.insertKaryawan(014, 015, "pebrianti", "jl.dahlia", "perempuan", 7890, "kontrak", "keuangan");
       
       jabatan.insertIdJabatan(006);
       jabatan.insertNamaJabatan("HRD");
       jabatan.insertTglAktif(18);
       jabatan.insertTglBerakhir(30);
       jabatan.insertIdKaryawan(007);
       jabatan.insertStatusJabatan("tetap");
       jabatan.insertJabatan(10, "asisten", 8, 30, 10, "magang");
       
       bagian.insertIdBagian(3);
       bagian.insertNamaBagian("Operator");
       bagian.insertBagian(4, "humas");
       
       //Menampilkan data ArrayList
       System.out.println("==========DATA USER==========");
       System.out.println(user.getRecordIdUser());
       System.out.println(user.getRecordUsernameUser());
       System.out.println(user.getRecordPasswordUser());
       
       System.out.println("\t");
       System.out.println("==========DATA ADMIN==========");
       System.out.println(admin.getRecordIdAdmin());
       System.out.println(admin.getRecordUsernameAdmin());
       System.out.println(admin.getRecordPasswordAdmin());
       
       System.out.println("\t");
       System.out.println("==========DATA ABSENSI==========");
       System.out.println(absen.getRecordIdAbsen());
       System.out.println(absen.getRecordIdKaryawan());
       System.out.println(absen.getRecordTanggal());
       System.out.println(absen.getRecordJamMasuk());
       System.out.println(absen.getRecordJamKeluar());
       
       System.out.println("\t");
       System.out.println("==========DATA KARYAWAN==========");
       System.out.println(karyawan.getRecordIdKaryawan());
       System.out.println(karyawan.getRecordNikKaryawan());
       System.out.println(karyawan.getRecordNamaKaryawan());
       System.out.println(karyawan.getRecordAlamatKaryawan());
       System.out.println(karyawan.getRecordJenisKelamin());
       System.out.println(karyawan.getRecordNoTelepon());
       System.out.println(karyawan.getRecordStatusKaryawan());
       System.out.println(karyawan.getRecordBagian());
       
       System.out.println("\t");
       System.out.println("==========DATA JABATAN==========");
       System.out.println(jabatan.getRecordIdJabatan());
       System.out.println(jabatan.getRecordNamaJabatan());
       System.out.println(jabatan.getRecordTglAktif());
       System.out.println(jabatan.getRecordTglBerakhir());
       System.out.println(jabatan.getRecordIdKaryawan());
       System.out.println(jabatan.getRecordStatusJabatan());
       
       System.out.println("\t");
       System.out.println("==========DATA BAGIAN==========");
       System.out.println(bagian.getrecordIdBagian());
       System.out.println(bagian.getrecordNamaBagian());*/
       
       new frameUtama().setVisible(true);
    }   
}  
       