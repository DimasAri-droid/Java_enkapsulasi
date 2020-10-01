/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan1;

/**
 *
 * @author user
 */
public class UjiBus {
    public static void main(String[]args){
        Bus busMini=new Bus();
        busMini.penumpang = 5;
        busMini.maxPenumpang = 15;
        busMini.cetak();
        
        //menambahkan penumpang pada bus mini
        busMini.penumpang = busMini.penumpang + 5;
        busMini.cetak();
        //pengurangan penumpaang pada bus mini
        busMini.penumpang = busMini.penumpang - 2;
        busMini.cetak();
        //penambahan penumpang pada bus mini
        busMini.penumpang = busMini.penumpang + 8;
        busMini.cetak();
        
    }
}
