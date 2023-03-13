/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructor;

/**
 *
 * @author Ach Fahmi Al Hafidz
 */
public class LimasSegiEmpat {
    public double sisi_alas, tinggi_limas, volume;
    
    public LimasSegiEmpat(){
        this.sisi_alas = 0;
        this.tinggi_limas = 0;
        this.volume = 0;
    }
    
    public LimasSegiEmpat(double sisi_alas, double tinggi_limas){
        this.sisi_alas = sisi_alas;
        this.tinggi_limas = tinggi_limas;
        this.ComputeAndSetVolume();
    }
    
    public void SetSisi_alas(double sisi_alas){
        this.sisi_alas = sisi_alas;
    }
    
    public void SetTinggi_limas(double tinggi_limas){
        this.tinggi_limas = tinggi_limas;
    }
    
    public void ComputeAndSetVolume(){
        this.volume = 1.0/3 * this.sisi_alas * this.sisi_alas * this.tinggi_limas;
    }
    
    public void GetVolume(){
        System.out.println("Tabung dengan sisi alas " + this.sisi_alas + ", tinggi limas " + this.tinggi_limas + " memiliki volume: " + this.volume);
    }
}
