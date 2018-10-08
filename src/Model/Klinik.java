/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static Model.RumahSakit.daftarDokter;
import java.util.ArrayList;

/**
 *
 * @author W I N D O W S 1 0
 */
public class Klinik {
   
      public String idKlinik;
   public String namaKlinik;
   // private Dokter[] daftarDokter;
   
   public Klinik (){}
   
    public Klinik(String idKlinik, String namaKlinik) {
        this.idKlinik = idKlinik;
        this.namaKlinik = namaKlinik;
    }

    public String getIdKlinik() {
        return idKlinik;
    }

    public void setIdKlinik(String idKlinik) {
        this.idKlinik = idKlinik;
    }

    public String getNamaKlinik() {
        return namaKlinik;
    }

    public void setNamaKlinik(String namaKlinik) {
        this.namaKlinik = namaKlinik;
    }
    
//    public  Dokter[] getDaftarDokter(){
//    
//        return daftarDokter;
//        
//    }
//    public  void setDaftarDokter(Dokter[]daftarDokter){
//        
//        this.daftarDokter = daftarDokter;
//    }
    
    public static ArrayList<Dokter> getDaftarDokter() {
        return daftarDokter;
    }

    public static void setDaftarDokter(ArrayList<Dokter> daftarDokter) {
        RumahSakit.daftarDokter = daftarDokter;
    }
    
    public static void tambahDokter(Dokter dokter){
        
        daftarDokter.add(dokter);
        
    }

}
