/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119005.latihan26.waktusekarang;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 * Deskripsi Program : Program untuk memberi tau waktu sekarang
 */
public class IF110119005Latihan26WaktuSekarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
	Date date = new Date();
	System.out.println("Hari ini adalah hari : " + formatter.format(date));
    }
}
    

