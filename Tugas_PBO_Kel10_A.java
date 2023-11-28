package tugas_pbo_kel.pkg10_a;

import DB.DB_Helper;
import java.util.ArrayList;


public class Tugas_PBO_Kel10_A 
{

    public static void main(String[] args) 
    {
        Anggota anggota1 = new Anggota(1, "Anggota_1", 1001, "Jl. ABC No. 123", "Belum meminjam buku");
        Anggota anggota2 = new Anggota(2, "Anggota_2", 1002, "Jl. XYZ No. 456", "Sudah meminjam buku");

        Buku buku1 = new Buku(1, "Java Programming", "James Gosling", "978-0-13-468599-1", "Tersedia");
        Buku buku2 = new Buku(2, "Python Crash Course", "Eric Matthes", "978-1-59327-603-4", "Tersedia");

        TransaksiPeminjaman transaksi1 = new TransaksiPeminjaman(1, "2023-01-01", "2023-01-15", 10, 14, anggota1, buku1);

        TransaksiPengembalian pengembalian1 = new TransaksiPengembalian("R001", "2023-01-01", "2023-01-15", 15, 14);

 
        Notifikasi notifikasi1 = new Notifikasi(1, "2023-01-14", "Peminjaman Anda akan jatuh tempo besok.", anggota1);

        System.out.println("Informasi Anggota 1:");
        System.out.println("Nama: " + anggota1.getNama());
        System.out.println("Nomor Anggota: " + anggota1.getNomorAnggota());
        System.out.println("Alamat: " + anggota1.getAlamat());
        System.out.println("Sejarah Peminjaman: " + anggota1.getSejarahPeminjaman());
        System.out.println();

        System.out.println("Informasi Buku 1:");
        System.out.println("Judul Buku: " + buku1.getJudulBuku());
        System.out.println("Pengarang: " + buku1.getPengarang());
        System.out.println("Nomor ISBN: " + buku1.getNomorISBN());
        System.out.println("Status Ketersediaan: " + buku1.getStatusKetersediaan());
        System.out.println();

        System.out.println("Informasi Transaksi Peminjaman 1:");
        System.out.println("Tanggal Peminjaman: " + transaksi1.getTanggalPeminjaman());
        System.out.println("Tanggal Jatuh Tempo: " + transaksi1.getTanggalJatuhTempo());
        System.out.println("Durasi Peminjaman: " + transaksi1.getDurasiPeminjaman() + " hari");
        System.out.println("Anggota: " + transaksi1.getAnggota().getNama());
        System.out.println("Buku: " + transaksi1.getBuku().getJudulBuku());
        System.out.println();

        System.out.println("Informasi Transaksi Pengembalian 1:");
        System.out.println("ID Pengembalian: " + pengembalian1.getId());
        System.out.println("Tanggal Peminjaman: " + pengembalian1.getTanggalPeminjaman());
        System.out.println("Tanggal Pengembalian: " + pengembalian1.getTanggalPengembalian());
        System.out.println("Durasi Peminjaman: " + pengembalian1.getDurasiPeminjaman() + " hari");
        System.out.println();

        System.out.println("Informasi Notifikasi 1:");
        System.out.println("Tanggal Notifikasi: " + notifikasi1.getTanggal());
        System.out.println("Pesan: " + notifikasi1.getPesan());
        System.out.println("Anggota: " + notifikasi1.getAnggota().getNama());        
        
    }   
}