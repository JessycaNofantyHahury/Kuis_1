/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Model.Dokter;
import Model.RumahSakit;

/**
 *
 * @author W I N D O W S 1 0
 */
public class Test2 {
    
    public static void main(String[] args) {
                RumahSakit rs = new RumahSakit("RSKU");
        System.out.println("Nama RumahSakit : " + rs.getNama());

        Dokter dokter1 = new Dokter("001", "dr. Puspa");
        Dokter dokter2 = new Dokter("002", "dr. Adi");

        rs.tambahDokter(dokter2);
        rs.tambahDokter(dokter1);

        for (int i = 0; i < rs.getDaftarDokter().size(); i++) {
            System.out.println(
                    "noPegawai: "
                    + rs.getDaftarDokter().get(i).getNomorPegawai()
                    + ", Nama : "
                    + rs.getDaftarDokter().get(i).getNama()
            );
        }
    }
  

}
