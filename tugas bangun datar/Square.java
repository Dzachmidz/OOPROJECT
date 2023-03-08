/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bangundatar;

public class Square {

    //deklarasi atribut
    public int legthOfSide = 10;
    
    //deklarasi methot
    public int calculateArea(){
        int  area;
        area = this.legthOfSide * this.legthOfSide;
        return area;
    }
    
    public int calculatePerimeter(){
        int perimeter;
        perimeter = this.legthOfSide * 4;
        return perimeter;
    }
    
}
