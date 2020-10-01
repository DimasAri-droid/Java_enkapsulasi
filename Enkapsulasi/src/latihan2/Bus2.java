/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan2;

/**
 *
 * @author user
 */
public class Bus2 {
    private int penumpang;
    private final int maxPenumpang;
    
    //konstruktor
    public Bus2(int maxPenumpang){
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
    
    public void cetak(){
        System.out.println("Penumpang bus sekarang: "+penumpang);
        System.out.println("Maksimal kapasitas penumpang: "+maxPenumpang);
    }
}
