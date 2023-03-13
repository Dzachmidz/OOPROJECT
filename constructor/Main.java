/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int pilihan = 0;
        
        while (pilihan != 6){
           System.out.println("==============================");
           System.out.println("Menghitung Volume Bangun Ruang");
           System.out.println("==============================");
           System.out.println("1. Kubus");
           System.out.println("2. Balok");
           System.out.println("3. Tabung");
           System.out.println("4. Limas Segi Empat");
           System.out.println("5. Bola");
           System.out.println("6. Keluar");
           System.out.println("==============================");
           
           System.out.println("Masukkan Nomer Pilihan Anda: ");
           pilihan = input.nextInt();
           System.out.println("=============================");
           
           switch(pilihan){
               case 1:
                   Kubus kubus = new Kubus();
                   System.out.println("Masukkan sisi kubus: ");
                   double sisi = input.nextDouble();
                   kubus.Getsisi(sisi);
                   kubus.ComputeAndSetVolume();
                   kubus.GetVolume();
                   break;
                   
               case 2:
                   System.out.println("Masukkan panjang balok: ");
                   double panjang = input.nextDouble();
                   System.out.println("Masukkan lebar balok: ");
                   double lebar = input.nextDouble();
                   System.out.println("Masukkan tinggi balok: ");
                   double tinggi = input.nextDouble();
                   Balok balok = new Balok (panjang, lebar, tinggi);
                   balok.GetVolume();
                   break;
                   
               case 3: 
                   System.out.println("Masukkan radius tabung: ");
                   double radius = input.nextDouble();
                   System.out.println("Masukkan tinggi tabung: ");
                   double tinggi_tabung = input.nextDouble();
                   Tabung tabung = new Tabung (radius, tinggi_tabung);
                   tabung.GetVolume();
                   break;
                   
               case 4:
                   LimasSegiEmpat limas = new LimasSegiEmpat();
                   System.out.println("Masukkan sisi Limas Segi Empat: ");
                   double sisi_alas = input.nextDouble();
                   limas.SetSisi_alas(sisi_alas);
                   System.out.println("Masukkan tinggi Limas Segi Empat: ");
                   double tinggi_limas = input.nextDouble();
                   limas.SetTinggi_limas(tinggi_limas);
                   limas.ComputeAndSetVolume();
                   limas.GetVolume();
                   break;
                   
               case 5:
                   Bola bola = new Bola();
                   System.out.println("Masukkan jari-jari Bola: ");
                   double radius_bola = input.nextDouble();
                   bola.SetRadius(radius_bola);
                   bola.ComputeAndSetVolume();
                   bola.GetVolume();
                   break;
                   
               case 6:
                   System.out.println("Terima Kasih dan Sampai Jumpa Kembali");
                   break;
               default:
                   System.out.println("Pilihan Tidak Valid");
           }
        }
            input.close();
    }
}
