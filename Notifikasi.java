package tugas_pbo_kel.pkg10_a;

public class Notifikasi{
    private int id_notif;
    private String tanggal;
    private String pesan;
    private Anggota anggota;

    public Notifikasi(int id_notif, String tanggal, String pesan, Anggota anggota) {
        this.id_notif = id_notif;
        this.tanggal = tanggal;
        this.pesan = pesan;
        this.anggota = anggota;
    }
    
    public int getIdNotif() {
        return id_notif;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getPesan() {
        return pesan;
    }
    
    public Anggota getAnggota(){
        return anggota;
    }

    public void setIdNotif(int id_notif) {
        this.id_notif = id_notif;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }
    
    public void setAnggota(Anggota anggota){
        this.anggota = anggota;
    }
}