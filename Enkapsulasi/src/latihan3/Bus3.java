/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan3;

/**
 *
 * @author user
 */
public class Bus3 {
    private int penumpang;
    private int maxPenumpang;
    private int penumpangBaru;
    public Bus3(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    public void addPenumpang(int penumpang){
        int temp;
        temp = this.penumpang + penumpang;
        if (temp > maxPenumpang){
            System.out.println("Penumpang melebihi kapasitas bus");
        }
        else{
            this.penumpang = temp;
        }
    }
    public void getPenumpang(int password){
        if (password == 1234){
            penumpangBaru = penumpang;
            System.out.println("Penumpang baru : "+penumpangBaru);
        }
        else{
            System.out.println("PASSWORD YANG ANDA MASUKKAN SALAH !!!");
        }
    }
    public void cetak(){
        System.out.println("Penumpang bus sekarang : "+penumpangBaru);
        System.out.println("Maksimal kapasitas penumpang bus : "+maxPenumpang);
    }
}
