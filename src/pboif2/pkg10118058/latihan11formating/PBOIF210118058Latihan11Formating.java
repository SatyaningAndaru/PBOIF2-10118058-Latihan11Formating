/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118058.latihan11formating;

/**
 *
 * @author user
 *   * Nama         :   Satyaning Andaru Bawalaksana
 * Nim          :   10118058
 * Kelas        :   PBOIF2
 * Deskripsi    :   Program ini berisi program menampilkan
 * Jenis-jenis tipe data bilangan bulat
 */
public class PBOIF210118058Latihan11Formating {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=3546764;
        int IMinus= -i;
        System.out.println("i : "+i);
        System.out.printf("%%d : %d %n", i);
        System.out.printf("%%10d: %+10d%n", i);
        System.out.printf("%%+10d : %+10d%n",IMinus);
        System.out.printf("%%,10d : %,10d%n",i);
        System.out.printf("%%,10d : %,-10d%n",i);
        
        
        double f=5675482.982;
        System.out.println("f : "+f);
        System.out.printf("%%f : %f%n",f);
        System.out.printf("%%.2f : %.2f%n",f);
        System.out.printf("%%12.2f : %12.2f%n",f);
        
    }
    
}
