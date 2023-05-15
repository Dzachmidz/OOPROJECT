public class Pemain2 extends Badminton{
    String nama,tgl_lahir;
    
    public Pemain2(String nama, String alamat, String tgl_lahir){
        super(nama, alamat, tgl_lahir);
        this.nama = nama;
        this.alamat = alamat;
        this.tgl_lahir = tgl_lahir;
        
    }
    
    @Override
    public String toString(){
        return 
        "-------Atlit Badminton-------"+
        "\nNama             : " +nama+
        "\nAlamat           : " +alamat+
        "\nTanggal Lahir    : " +tgl_lahir;
    }
}
 