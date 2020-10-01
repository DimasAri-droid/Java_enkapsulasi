/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas11;

/**
 *
 * @author user
 */
public class TestGajiPegawai {
    public static void main(String[]args){
        GajiPegawai gaji = new GajiPegawai();
        gaji.setGaji(4600000);
        gaji.hitungPajak();
        gaji.hitungGaji();
        System.out.println("Nama Pegawai : "+gaji.namaPegawai());
        System.out.println("Gaji Kotor : Rp."+gaji.getGajiKotor());
        System.out.println("Potongan Gaji : Rp."+gaji.getPotongan());
        System.out.println("Pajak : Rp."+gaji.getPajak());
        System.out.println("Gaji Bersih : Rp."+gaji.getGajiBersih());
    }
}
