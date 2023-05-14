package inheritance;

public class Koleksi {
    String judul, penerbit;
    int tahun;
    
    public Koleksi(String judul, String penerbit, int tahun){
        this.judul = judul;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }
    
    public String toString(){
        return "Judul : " +judul+ "\nPenerbit : " +penerbit+ "\nTahun : " +tahun;
    }
}
