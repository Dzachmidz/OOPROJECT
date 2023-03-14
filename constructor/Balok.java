/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructor;

/**
 *
 * @author Ach Fahmi Al Hafidz
 */
public class Balok {
    public double panjang, lebar, tinggi, volume;

    public Balok(){
    this.panjang = 0;
    this.lebar   = 0;
    this.tinggi  = 0;
    this.volume  = 0;
    }
    
    public Balok(double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.ComputeAndSetVolume();
    }
    
    public void SetPanjang(double panjang){
        this.panjang = panjang;
    }
    
    public void SetLebar(double lebar){
        this.lebar = lebar;
    }
    
    public void SetTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    
    public void ComputeAndSetVolume(){
        this.volume = this.panjang * this.lebar * this.tinggi;
    }
    
    public void GetVolume(){
        System.out.println("Balok dengan panjang" + this.panjang + ", lebar" + this.lebar + ", tinggi" + this.tinggi + "memiliki volume: " + this.volume);
    }
}