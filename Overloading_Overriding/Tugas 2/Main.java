public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Badminton pemain1 = new Pemain1("Marcus Fernaldi Gideon", "Jakarta, Indonesia", "9 Maret 1991");
        Badminton pemain2 = new Pemain2("Kevin Sanjaya Sukamuljo", "Banyuwangi, Indonesia", " 2 Agustus 1995");
        Badminton pemain3 = new Pemain3("Kento Momota", "Kagawa, Jepang ", "1 September 1994");
        
        
        System.out.println(pemain1.toString());
        System.out.println(pemain2.toString());
        System.out.println(pemain3.toString());
        
        System.out.println();

    }
    
}
 