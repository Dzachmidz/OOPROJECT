package inheritance;

public class Skripsi extends Buku {
    String NPM;
    
    public Skripsi(String NPM, String penulis, String judul, String penerbit, int tahun){
        super(judul, penulis, penerbit, tahun);
        this.NPM = NPM;
    }
    
    public String toString(){
        return 
        "-------SKRIPSI--------\n" +
        "NPM      : " +NPM+ 
        "\nPenulis  : " +penulis+ 
        "\nJudul    : " +judul+ 
        "\nPenerbit : " +penerbit+ 
        "\nTahun    : " +tahun;
    }
}
