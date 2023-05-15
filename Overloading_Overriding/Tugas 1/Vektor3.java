package overloading;

public class Vektor3 {
    private int[] array;

    public Vektor3(int x, int y, int z) {
        array = new int[] {x, y, z};
    }

    public Vektor3 perkalian(int skalar) {
        int x = array[0] * skalar;
        int y = array[1] * skalar;
        int z = array[2] * skalar;
        return new Vektor3(x, y, z);
    }

    public int dotProduct(Vektor3 vektor) {
        int x = array[0] * vektor.array[0];
        int y = array[1] * vektor.array[1];
        int z = array[2] * vektor.array[2];
        return x + y + z;
    }

    public int[] getArray() {
        return array;
    }

    public static void main(String[] args) {
        Vektor3 v1 = new Vektor3(1, 2, 3);
        Vektor3 v2 = new Vektor3(4, 5, 6);
        
        System.out.println("v1 = [" +v1.getArray()[0]+ ", " +v1.getArray()[1]+ ", " +v1.getArray()[2]+ "]");
        System.out.println("v2 = [" +v2.getArray()[0]+ ", " +v2.getArray()[1]+ ", " +v2.getArray()[2]+ "]");
        
        // Perkalian skalar
        Vektor3 skalar = v1.perkalian(5);
        System.out.println("\nPerkalian Skalar (v1 * 5)");
        System.out.println("[" +v1.getArray()[0]+ ", " +v1.getArray()[1]+ ", " +v1.getArray()[2]+ "] * 5 = [" + skalar.getArray()[0] + ", " + skalar.getArray()[1] + ", " + skalar.getArray()[2] + "]");

        // Perkalian vektor
        int dotProduct = v1.dotProduct(v2);
        System.out.println("\nPerkalian Vektor (v1 * v2)");
        System.out.println("[" + v1.getArray()[0] + ", " + v1.getArray()[1] + ", " + v1.getArray()[2] + "] * [" + v2.getArray()[0] + ", " + v2.getArray()[1] + ", " + v2.getArray()[2] + "] = " + dotProduct);
    }
}
