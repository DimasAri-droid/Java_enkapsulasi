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
public class Bus4 {
    private double penumpang;
    private double maxPenumpang;
    private double penumpangBaru;
    private double counter;
    
    public Bus4(double maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    
    public void addPenumpang(double penumpang){
        double temp;
        temp = this.penumpang + penumpang;
        if (temp > maxPenumpang){
            System.out.println("Penumpang melebihi kapasitas bus");
        }
        else{
            this.penumpang = temp;
        }
    }
    
    public double getPenumpang(int password){
        if (password == 1234){
            penumpangBaru = penumpang;
            System.out.println("Penumpang baru : "+penumpangBaru);
            counter ++;
        }
        else{
            System.out.println("PASSWORD YANG ANDA MASUKKAN SALAH !!!");
        }
        return counter;
    }
    
    public double getAverange(){
        double jum = penumpangBaru / counter;
        return jum;
    }
    public void cetak(){
        System.out.println("Penumpang bus sekarang : "+penumpangBaru);
        System.out.println("Maksimal kapasitas penumpang bus : "+maxPenumpang);
        System.out.println("Rata - Rata penumpang baru : "+getAverange());
    }
}
