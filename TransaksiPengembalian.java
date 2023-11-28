package tugas_pbo_kel.pkg10_a;

public class TransaksiPengembalian {
    private String id;
    private String tanggalPeminjaman;
    private String tanggalPengembalian;
    private int waktu;
    private int durasiPeminjaman;

    public TransaksiPengembalian(String id, String tanggalPeminjaman, String tanggalPengembalian, int waktu, int durasiPeminjaman) {
        this.id = id;
        this.tanggalPeminjaman = tanggalPeminjaman;
        this.tanggalPengembalian = tanggalPengembalian;
        this.waktu = waktu;
        this.durasiPeminjaman = durasiPeminjaman;
    }

    public String getId() {
        return id;
    }

    public String getTanggalPeminjaman() {
        return tanggalPeminjaman;
    }

    public String getTanggalPengembalian() {
        return tanggalPengembalian;
    }

    public int getWaktu() {
        return waktu;
    }

    public int getDurasiPeminjaman() {
        return durasiPeminjaman;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTanggalPeminjaman(String tanggalPeminjaman) {
        this.tanggalPeminjaman = tanggalPeminjaman;
    }

    public void setTanggalPengembalian(String tanggalPengembalian) {
        this.tanggalPengembalian = tanggalPengembalian;
    }

    public void setWaktu(int waktu) {
        this.waktu = waktu;
    }

    public void setDurasiPeminjaman(int durasiPeminjaman) {
        this.durasiPeminjaman = durasiPeminjaman;
    }
}