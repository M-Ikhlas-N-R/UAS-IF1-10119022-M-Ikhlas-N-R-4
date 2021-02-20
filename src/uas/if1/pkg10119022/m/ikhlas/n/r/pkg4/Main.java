package uas.if1.pkg10119022.m.ikhlas.n.r.pkg4;
import java.util.Scanner;
/*
  @author
  Nama              : M Ikhlas N R
  Kelas             : IF-1
  NIM               : 10119022
  Tanggal           : Sabtu, 20-02-2021
  Deskripsi Program : APLIKASI PENDATAAN WISATAWAN
 */

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("APLIKASI PENDATAAN WISATAWAN");
        System.out.println("============================");
        System.out.print("Nama : ");
        String nama = userInput.nextLine();
        
        System.out.print("Kewarganegaranan : ");
        String kewarganegaranan = userInput.nextLine();
        
        System.out.print("Tujuan Wisata : ");
        String tujuan = userInput.nextLine();
        System.out.println();
        System.out.println("HASIL DATA APLIKASI PENDATAAN WISATAWAN");
        System.out.println("============================");
        System.out.println("Nama\t\t\t: " + nama);
        System.out.println("Kewarganegaranan\t: " + kewarganegaranan);
        System.out.println("Tujuan Wisata\t\t: " + tujuan);
        
        
    }
    
}
