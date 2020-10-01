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
import javax.swing.*;
public class Biodata {
    private JLabel labelicon, label1, label2, label3, label4, label5, label6;
    private String nim  = "19533095";
    private String nama = "Dimas Ari Wibowo";
    private String jrsn = "S1 Teknik Informatika";
    private String lahir= "Magetan";
    private String tgl  = "01 Oktober 2000";
    private String jenis= "Laki - Laki";
    
    public Biodata(){
        JFrame frame = new JFrame();
        frame.setTitle("PROFIL MAHASISWA");
        frame.setBounds(300,300,600,250);
        
        ImageIcon icon = new ImageIcon("src/tugas12/unmuh.png");
        labelicon = new JLabel();
        labelicon.setIcon(icon);
        labelicon.setBounds(25,0,200,200);
        label1 = new JLabel();
        label1.setText("NIM : "+nim);
        label1.setBounds(250,25,250,25);
        label2 = new JLabel("Nama : "+nama);
        label2.setBounds(250,50,250,25);
        label3 = new JLabel("Program Studi : "+jrsn);
        label3.setBounds(250,75,250,25);
        label4 = new JLabel("Tempat Lahir : "+lahir);
        label4.setBounds(250,100,250,25);
        label5 = new JLabel("Tanggal Lahir : "+tgl);
        label5.setBounds(250,125,250,25);
        label6 = new JLabel("Jenis Kelamin : "+jenis);
        label6.setBounds(250,150,250,25);
        
        frame.add(labelicon);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(label6);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
    public static void main(String[]args){
        Biodata frame = new Biodata();
    }
}
