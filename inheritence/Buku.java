package inheritance;

public class Buku extends Koleksi {
    String penulis;
    
    public Buku(String judul, String penulis, String penerbit, int tahun){
        super(judul, penerbit, tahun);
        this.penulis = penulis;
    }
    
    public String toString(){
        return 
        "---------BUKU---------\n" +
        "Judul    : " +judul+ 
        "\nPenulis  : " +penulis+ 
        "\nPenerbit : " +penerbit+ 
        "\nTahun    : " +tahun;
    }
}
