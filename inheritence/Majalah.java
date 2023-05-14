package inheritance;

public class Majalah extends Koleksi{
    String edisi;
    
    public Majalah(String judul, String edisi, String penerbit, int tahun){
        super(judul, penerbit, tahun);
        this.edisi = edisi;
    }
    
    public String toString(){
        return 
        "-------MAJALAH--------\n" +
        "Judul    : " +judul+ 
        "\nEdisi    : " +edisi+ 
        "\nPenerbit : " +penerbit+ 
        "\nTahun    : " +tahun;
    }
    
}
