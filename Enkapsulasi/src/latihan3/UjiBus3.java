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
public class UjiBus3 {
    public static void main(String[]args){
        Bus3 busBesar = new Bus3(50);
        busBesar.addPenumpang(12);
        busBesar.getPenumpang(1234);
        busBesar.cetak();
        System.out.println();
        
        busBesar.addPenumpang(5);
        busBesar.getPenumpang(1111);
        busBesar.cetak();
        
    }
}

