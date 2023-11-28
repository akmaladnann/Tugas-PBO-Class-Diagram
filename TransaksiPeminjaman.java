package tugas_pbo_kel.pkg10_a;

public class TransaksiPeminjaman {
    private int id;
    private String tanggalPeminjaman;
    private String tanggalJatuhTempo;
    private int waktu;
    private int durasiPeminjaman;
    private Anggota anggota;
    private Buku buku;

    public TransaksiPeminjaman(int id, String tanggalPeminjaman, String tanggalJatuhTempo, 
            int waktu, int durasiPeminjaman, Anggota anggota, Buku buku) {
        this.id = id;
        this.tanggalPeminjaman = tanggalPeminjaman;
        this.tanggalJatuhTempo = tanggalJatuhTempo;
        this.waktu = waktu;
        this.durasiPeminjaman = durasiPeminjaman;
        this.anggota = anggota;
        this.buku = buku;
    }

    public int getId() {
        return id;
    }

    public String getTanggalPeminjaman() {
        return tanggalPeminjaman;
    }

    public String getTanggalJatuhTempo() {
        return tanggalJatuhTempo;
    }

    public int getWaktu() {
        return waktu;
    }

    public int getDurasiPeminjaman() {
        return durasiPeminjaman;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTanggalPeminjaman(String tanggalPeminjaman) {
        this.tanggalPeminjaman = tanggalPeminjaman;
    }

    public void setTanggalJatuhTempo(String tanggalJatuhTempo) {
        this.tanggalJatuhTempo = tanggalJatuhTempo;
    }

    public void setWaktu(int waktu) {
        this.waktu = waktu;
    }

    public void setDurasiPeminjaman(int durasiPeminjaman) {
        this.durasiPeminjaman = durasiPeminjaman;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }
}