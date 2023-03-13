/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructor;

/**
 *
 * @author Ach Fahmi Al Hafidz
 */
public class Tabung {
    public double radius, tinggi_tabung, volume;
    
    public Tabung(){
        this.radius = 0;
        this.tinggi_tabung = 0;
        this.volume = 0;
    }
    
    public Tabung(double radius, double tinggi){
        this.radius = radius;
        this.tinggi_tabung = tinggi;
        this.ComputeAndSetVolume();
    }
    
    public void SetRadius(double radius){
      this.radius = radius;
    }
    
    public void SetTinggi(double tinggi){
        this.tinggi_tabung = tinggi;
    }
    
    public void ComputeAndSetVolume(){
        this.volume = Math.PI * this.radius * this.radius * this.tinggi_tabung;
    }
    
    public void GetVolume(){
        System.out.println("Tabung dengan radius" +this.radius+ ", tinggi" +this.tinggi_tabung+ "memiliki volume: " +this.volume);
    }
}
