/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118905.latihan44.hukumohm;

/**
 *
 * @author Fitri
 * Nama     : Anindira Dina Fitriani
 * Kelas    : IF11-K
 * Nim      : 10118905
 * Deskripsi: Program Hukum OHM
 */
public class PBO11K10118905Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baterai btr = new Baterai();
        System.out.println("====== Hukum Ohm ======");
        System.out.println("Kuat arus yang mengalir pada suatu kawat Penghantar\nakan berbanding lurus dengan beda potensial\npada ujung-ujung kawat penghantar tersebut\nasalkan suhu kawat dijaga konstan.\n");
        Baterai btr1 = new Baterai(btr.getKuatArus(),btr.getHambatan());
    
    }
    
}
