/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;
import java.util.Scanner;
/**
 *
 * @author FAHMI
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jumlahPenumpang, penumpangPorong, turunPorong, naikPorong, penumpangSurabaya, turunSurabaya, naikSurabaya;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah penumpang di awal: ");
        jumlahPenumpang = input.nextInt();
        Bus bus = new Bus(jumlahPenumpang);
        
        System.out.print("Masukkan jumlah penumpang di Halte Porong: ");
        penumpangPorong = input.nextInt();
        Halte porong = new Halte(penumpangPorong);
        
        System.out.print("Masukkan jumlah penumpang yang turun di porong: ");
        turunPorong = input.nextInt();
        
        System.out.print("Masukkan jumlah penumpang yang naik di porong: ");
        naikPorong = input.nextInt();
        input.nextLine();
        
        System.out.print("Masukkan jumlah penumpang di Halte Surabaya: ");
        penumpangSurabaya = input.nextInt();
        Halte surabaya = new Halte(penumpangSurabaya);
        
        System.out.print("Masukkan jumlah penumpang yang naik di surabaya: ");
        naikSurabaya = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan jumlah penumpang yang turun di surabaya: ");
        turunSurabaya = input.nextInt();
        input.nextLine();
        
        System.out.println("--------------------------------------------------");
        System.out.println("-> Bus Berangkat dari PULL/Kantor:");
        System.out.println("- jumlah penumpang: " + bus.getJumlahPenumpang() + " penumpang");
        System.out.println("--------------------------------------------------");

        
        System.out.println("-> Halte Porong: " + porong.getPenumpangMenunggu() + " Penumpang menunggu");
        
        System.out.println("-> Bus Sampai di Halte PORONG:");
        
        
        System.out.println("- " + turunPorong + " penumpang turun");
        
        System.out.println("- " + naikPorong + " penumpang naik");
        bus.turun(turunPorong);
        bus.naik(naikPorong);
        porong.setPenumpangMenunggu(penumpangPorong - naikPorong);
        
        System.out.println("- tujuan Surabaya");
        System.out.println("- tujuan Gresik");
        System.out.println("- jumlah penumpang: " + bus.getJumlahPenumpang() + " penumpang");
        System.out.println("-> Halte Porong: " + porong.getPenumpangMenunggu() + " Penumpang menunggu");
                System.out.println("--------------------------------------------------");

        System.out.println("-> Halte Surabaya: " + surabaya.getPenumpangMenunggu() + " Penumpang menunggu");
        
        System.out.println("-> Bus Sampai di Halte SURABAYA:");
        
        System.out.println("- " + turunSurabaya + " penumpang turun");
        
        System.out.println("- " + naikSurabaya + " penumpang naik");
        bus.turun(turunSurabaya);
        bus.naik(naikSurabaya);
        surabaya.setPenumpangMenunggu(penumpangSurabaya - naikSurabaya);
        
        System.out.println("- " + naikSurabaya + " penumpang tujuan Gresik");
        System.out.println("- jumlah penumpang: " + bus.getJumlahPenumpang() + " penumpang");
        System.out.println("-> Halte Surabaya: " + surabaya.getPenumpangMenunggu() + " Penumpang menunggu");
        System.out.println("--------------------------------------------------");

    }
}