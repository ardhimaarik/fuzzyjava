/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Variabel;

/**
 *
 * @author Ardhipc
 */
public class Permintaan {
    //buat variabel permintaan yang nantinya menjadi nilai masukan 
    private static double permintaan;
    
    //baut variabel titik-titik range pada model fuzzy nya, agar mudah untuk mengganti nilai ketika ada perubahan
    private static double titik1=0;
    private static double titik2=1000;
    private static double titik3=5000;

    //buat method untuk mengakses nilai pada variabel permintaan
    public static double getPermintaan() {
        return permintaan;
    }

    //buat method untuk memberikan nilai pada variabel permintaan
    public static void setPermintaan(double permintaan) {
        Permintaan.permintaan = permintaan;
    }
    
    //method fungsi turun
    public static double turun(){
        if (permintaan>=titik1 && permintaan<=titik2) return 1;
        else if (permintaan>titik2 && permintaan<titik3) return (titik3-permintaan)/(titik3-titik2);
        else return 0;
    }
    
    //method fungsi naik
    public static double naik(){
        if (permintaan>titik2 && permintaan<titik3) return (permintaan-titik2)/(titik3-titik2);
        else if (permintaan>=titik3) return 1;
        else return 0;
    }
}
