/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Variabel;

/**
 *
 * @author Ardhipc
 */
public class Produksi {
    //buat variabel produksi yang nantinya menjadi nilai masukan
    private static double produksi;
    //baut variabel titik-titik range pada model fuzzy nya, agar mudah untuk mengganti nilai ketika ada perubahan
    private static double titik1=0;
    private static double titik2=2000;
    private static double titik3=7000;
    //buat method untuk mengakses nilai pada variabel produksi
    public static double getProduksi() {
        return produksi;
    }
    //buat method untuk memberikan nilai pada variabel produksi
    public static void setProduksi(double produksi) {
        Produksi.produksi = produksi;
    }    
    //method fungsi berkurang
    public static double berkurang(){
        if (produksi>=titik1 && produksi<=titik2) return 1;
        else if (produksi>titik2 && produksi<titik3) return (titik3-produksi)/(titik3-titik2);
        else return 0;
    }   
    //method fungsi bertambah
    public static double bertambah(){
        if (produksi>titik2 && produksi<titik3) return (produksi-titik2)/(titik3-titik2);
        else if (produksi>=titik3) return 1;
        else return 0;
    }    
    public static double berkurang(double in){
        return (titik3-(in*(titik3-titik2)));
    }    
    public static double bertambah(double in){
        return (titik2+(in*(titik3-titik2)));
    }
}
