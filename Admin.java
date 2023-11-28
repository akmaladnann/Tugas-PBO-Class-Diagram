package tugas_pbo_kel.pkg10_a;

public class Admin {
    private int id;
    private String nama;
    private String alamat;
    private String nomorTelpon;

    public Admin(int id, String nama, String alamat, String nomorTelpon) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelpon = nomorTelpon;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNomorTelpon() {
        return nomorTelpon;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNomorTelpon(String nomorTelpon) {
        this.nomorTelpon = nomorTelpon;
    }
}