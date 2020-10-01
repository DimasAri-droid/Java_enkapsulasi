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
public class GajiPegawai {
    private double gajiKotor, pajak, gajiBersih;
    private double potongan = 75000;
    private String nama = "Surya";
    
    public void setGaji(double gaji){//mengatur nilai gaji kotor
        gajiKotor = gaji;
    }
    public void hitungPajak(){ //menghitung pajak
        pajak = 0.2 * gajiKotor;
    }
    public void hitungGaji(){ //menghitung gaji bersih
        gajiBersih = gajiKotor - pajak - potongan;
    }
    public String namaPegawai(){ 
        return nama;
    }
    public double getGajiKotor(){
        return gajiKotor;
    }
    public double getPotongan(){
        return potongan;
    }
    public double getPajak(){
        return pajak;
    }
    public double getGajiBersih(){
        return gajiBersih;
    }
}
