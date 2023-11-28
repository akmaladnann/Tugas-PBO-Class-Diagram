package tugas_pbo_kel.pkg10_a;

public class Buku {
    private int id;
    private String judulBuku;
    private String pengarang;
    private String nomorISBN;
    private String statusKetersediaan;

    public Buku(int id, String judulBuku, String pengarang, String nomorISBN, String statusKetersediaan) {
        this.id = id;
        this.judulBuku = judulBuku;
        this.pengarang = pengarang;
        this.nomorISBN = nomorISBN;
        this.statusKetersediaan = statusKetersediaan;
    }
    
    public int getId(){
        return id;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public String getPengarang() {
        return pengarang;
    }

    public String getNomorISBN() {
        return nomorISBN;
    }

    public String getStatusKetersediaan() {
        return statusKetersediaan;
    }

    public void setId(int id){
        this.id = id;
    }
    
    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public void setNomorISBN(String nomorISBN) {
        this.nomorISBN = nomorISBN;
    }

    public void setStatusKetersediaan(String statusKetersediaan) {
        this.statusKetersediaan = statusKetersediaan;
    }
}