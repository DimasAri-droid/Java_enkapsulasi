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
public class UjiBus4 {
    public static void main(String[]args){
        Bus4 bus = new Bus4(60);
        bus.addPenumpang(12);
        bus.getPenumpang(1234);
        bus.cetak();
        System.out.println();
        
        bus.addPenumpang(18);
        bus.getPenumpang(1234);
        bus.cetak();
        System.out.println();
        
        bus.addPenumpang(7);
        bus.getPenumpang(98761);
        bus.cetak();
    }
}
