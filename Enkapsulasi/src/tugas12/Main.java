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
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
    String nama, alamat;
    int beli;
    //membuat objek console
    Scanner input = new Scanner(System.in);
    //membuat objek dari class Buku.java
    Buku buku=new Buku();
    //mengisi variable
    System.out.println("\t MASUKKAN INPUT");
    System.out.print("Nama Pembeli : ");
    nama = input.nextLine();
    buku.setPembeli(nama);
    System.out.print("Alamat Pembeli : ");
    alamat = input.nextLine();
    buku.setAlamat(alamat);
    System.out.print("Banyak Buku yang Dibeli : ");
    beli = input.nextInt();
    buku.setPembelian(beli);
    System.out.println();
    buku.cetakBuku();
    buku.cetakPembeli();
    buku.hitungBayar();
    buku.laporanBeli();
    buku.hitungSisa();
    buku.laporanAkhir();
    }
}
