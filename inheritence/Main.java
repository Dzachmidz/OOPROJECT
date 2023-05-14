package inheritance;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koleksi buku1 = new Buku("Laskar Pelangi", "Andrea Hirata","Bentang Pustaka", 2005);
        Koleksi majalah1 = new Majalah("Info Komputer", "April 2021", "PT Info Kita Media", 2021);
        Koleksi skripsi1 = new Skripsi("21081010223", "Achmad Fahmi Al Hafizd", "Pengembangan Sistem Informasi Geografis untuk Pemetaan Lokasi Usaha Kuliner Berbasis Mobile.", "UPN 'VETERAN' JAWA TIMUR", 2024);
        
        System.out.println(buku1.toString());
        System.out.println(majalah1.toString());
        System.out.println(skripsi1.toString());
    }
    
}


