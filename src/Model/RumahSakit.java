/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author W I N D O W S 1 0
 */
public class RumahSakit {
    
     private String nama;
//    Dokter[] daftarDokter;
//    Klinik[] daftarKlinik;
    
    public static ArrayList<Dokter> daftarDokter = 
            new ArrayList<Dokter>();
    
    public static ArrayList<Klinik> daftarKlinik =
            new ArrayList<Klinik>();
    
//    
    public RumahSakit() {
        
    }
    
    public RumahSakit(String nama){
        
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public static ArrayList<Dokter> getDaftarDokter() {
        return daftarDokter;
    }

    public static void setDaftarDokter(ArrayList<Dokter> daftarDokter) {
        RumahSakit.daftarDokter = daftarDokter;
    }

    public static ArrayList<Klinik> getDaftarKlinik() {
        return daftarKlinik;
    }

    public static void setDaftarKlinik(ArrayList<Klinik> daftarKlinik) {
        RumahSakit.daftarKlinik = daftarKlinik;
    }

//    public Dokter[] getDaftarDokter() {
//        return daftarDokter;
//    }
//
//    public void setDaftarDokter(Dokter[] daftarDokter) {
//        this.daftarDokter = daftarDokter;
//    }
//
//    public Klinik[] getDaftarKlinik() {
//        return daftarKlinik;
//    }
//
//    public void setDaftarKlinik(Klinik[] daftarKlinik) {
//        this.daftarKlinik = daftarKlinik;
//    }

    
    
    public void tambahDokter(Dokter Dokter){
        
       daftarDokter.add(Dokter);
    }
    
    public int cariDokter(String nama){
        
        
        
        for (int i = 0; i < daftarDokter.size(); i++) {
            if (daftarDokter.get(i).nama == nama) {
                return i;
            }

        }
        return -1;
    }
//        this.nama = nama;
//        return nama;
        
    
    
    public int cariKlinik(String nama){
        
        
        for (int i = 0; i < daftarKlinik.size(); i++) {
            if (daftarKlinik.get(i).namaKlinik == nama) {
                return i;
            }

        }
        return -1;
    }
//        this.nama = nama;
//        return nama;
    
    
    public void tambahKlinik(Klinik klinik){
       
        daftarKlinik.add(klinik);
            }

}
