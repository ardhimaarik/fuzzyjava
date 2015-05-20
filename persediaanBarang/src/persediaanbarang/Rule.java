/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persediaanbarang;
import Variabel.*;
/**
 *
 * @author Ardhipc
 */
public class Rule {
    private static double [] u_Produksi = new double[6];
    private static double [] z_Produksi = new double[6];
    private static double bobot;
    
    //rule
    public static void hitung_u(){
        u_Produksi[0]=Math.min(Permintaan.turun(), Persediaan.banyak());
        u_Produksi[1]=Math.min(Permintaan.turun(), Persediaan.sedikit());
        u_Produksi[2]=Math.min(Permintaan.naik(), Persediaan.banyak());
        u_Produksi[3]=Math.min(Permintaan.naik(), Persediaan.sedikit());
    }
    
    public static void hitung_z(){
        z_Produksi[0]=Produksi.berkurang(u_Produksi[0]);
        z_Produksi[1]=Produksi.berkurang(u_Produksi[1]);
        z_Produksi[2]=Produksi.bertambah(u_Produksi[2]);
        z_Produksi[3]=Produksi.bertambah(u_Produksi[3]);
    }
    //end of rule
    
    //cari nilai bobot (tsukamoto)
    public static double bobot(){
        double atas=0,bawah=0;
        for(int i=0;i<6;i++){
            System.out.println("z_ke-"+i+ " : " +z_Produksi[i]);
            System.out.println("u_ke-"+i+ " : " +u_Produksi[i]);
            atas+=(u_Produksi[i]*z_Produksi[i]);
            bawah+=u_Produksi[i];
        }
        System.out.println(atas/bawah);
        return (atas/bawah);
    }
}
