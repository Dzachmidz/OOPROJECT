public class Badminton {
    String nama, alamat, tgl_lahir;
    
    public Badminton (String nama, String alamat, String tgl_lahir){
        this.nama = nama;
        this.alamat = alamat;
        this.tgl_lahir = tgl_lahir;
    }
    
    @Override
    public String toString(){
        return
        "-------Pemain Sea Games-------"+
        "\nnama      : " +nama+
        "\nalamat     : " +alamat+
        "\ntgl_lahir  : " +tgl_lahir;
    }
}

 