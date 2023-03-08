/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangundatar;

public class Ellipse {
    // attributes
    public double semiMajorAxis = 10.0;
    public double semiMinorAxis = 5.0;

    // methods
    public double calculateArea() {
        return Math.PI * this.semiMajorAxis * this.semiMinorAxis;
    }

    public double calculatePerimeter() {
        double a = this.semiMajorAxis;
        double b = this.semiMinorAxis;
        return 2 * Math.PI * Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)) / 2);
    }
}
