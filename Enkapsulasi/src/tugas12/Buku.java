/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas12;

/**
 *
 * @author user
 */
public class Buku {
    private String judulBuku="Konsep Dasar Pemrograman Java";
    private String pengarangBuku="Patrick Naughton";
    private int stokBuku=27;
    private int hargaBuku=75000;
    private String namaPembeli, alamatPembeli;
    private int banyakPembelian, bayarBuku, sisaBuku;
    
    public void setPembeli(String nama){
        namaPembeli=nama;
    }
    public void setAlamat(String alamat){
        alamatPembeli=alamat;
    }
    public void setPembelian(int pembelian){
        banyakPembelian=pembelian;
    }
    public void hitungBayar(){
        bayarBuku = hargaBuku * banyakPembelian;
    }
    public void hitungSisa(){
        sisaBuku = stokBuku - banyakPembelian;
    }
    public int bayar(){
        return bayarBuku;
    }
    public int sisa(){
        return sisaBuku;
    }
    public void cetakBuku(){
        System.out.println("===DATA BUKU YANG AKAN DIBELI===");
        System.out.println("Judul Buku       : "+judulBuku);
        System.out.println("Nama Pengarang   : "+pengarangBuku);
        System.out.println("Stok Awal Buku   : "+stokBuku+" buah");
        System.out.println("Harga Buku       : "+hargaBuku);
        System.out.println();
    }
    public void cetakPembeli(){
        System.out.println("===DATA PEMBELI===");
        System.out.println("Nama Pembeli     : "+namaPembeli);
        System.out.println("Alamat Pembeli   : "+alamatPembeli);
        System.out.println("Banyak Pembelian : "+banyakPembelian);
        System.out.println();
    }
    public void laporanBeli(){
        System.out.println("===LAPORAN PEMBELIAN===");
        System.out.println("Nama Pembeli     : "+namaPembeli);
        System.out.println("Alamat Pembeli   : "+alamatPembeli);
        System.out.println("Banyak Pembelian : "+banyakPembelian);
        System.out.println("Total Pembelian  : "+bayar());
        System.out.println();
    }
    public void laporanAkhir(){
        System.out.println("===LAPORAN STOK AKHIR===");
        System.out.println("Stok Akhir Buku  : "+sisa()+" buah");
    }
}
