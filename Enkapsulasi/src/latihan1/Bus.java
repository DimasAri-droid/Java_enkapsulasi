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
public class Bus {
    public int penumpang;
    public int maxPenumpang;
    
    public void cetak(){
        System.out.println("Penumpang bus sekarang adalah "+penumpang);
        System.out.println("Penumpang maksimal bus adalah "+maxPenumpang);
    }
}