package tugas_pbo_kel.pkg10_a;

public class Anggota {
    int id;
    private String nama;
    private int nomorAnggota;
    private String alamat;
    private String sejarahPeminjaman;

    public Anggota(int id, String nama, int nomorAnggota, String alamat, String sejarahPeminjaman) {
        this.id = id;
        this.nama = nama;
        this.nomorAnggota = nomorAnggota;
        this.alamat = alamat;
        this.sejarahPeminjaman = sejarahPeminjaman;
    }
    
    public int getId(){
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getNomorAnggota() {
        return nomorAnggota;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getSejarahPeminjaman() {
        return sejarahPeminjaman;
    }

    public void setId(int id){
        this.id = id;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNomorAnggota(int nomorAnggota) {
        this.nomorAnggota = nomorAnggota;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setSejarahPeminjaman(String sejarahPeminjaman) {
        this.sejarahPeminjaman = sejarahPeminjaman;
    }
}