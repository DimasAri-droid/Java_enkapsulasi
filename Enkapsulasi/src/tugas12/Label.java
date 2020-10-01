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
import java.awt.event.*;
import javax.swing.*;
public class Label extends JFrame implements MouseMotionListener{
    private JLabel label1, label2,label3,label4;
    
    public Label(){
        JFrame frame=new JFrame();
        frame.setTitle("KETERANGAN TABEL");
        frame.setBounds(300,300,450,300);
        
        label1 = new JLabel("Label 1 : Label ini hanya teks");
        label1.setBounds(20,20,300,30);
        frame.add(label1);
        frame.addMouseMotionListener(this);
        
        label2 = new JLabel("Label 2 : Label ini berupa icon di sebelah kiri teks");
        ImageIcon icon1=new ImageIcon("src/tugas12/wa.png");
        label2.setBounds(20,60,400,50);
        label2.setIcon(icon1);
        label2.setHorizontalTextPosition(SwingConstants.RIGHT);
        label2.setVerticalTextPosition(SwingConstants.CENTER);
        frame.add(label2);
        
        label3 = new JLabel("Label 3 : Label ini berupa icon di sebelah kanan teks");
        ImageIcon icon2=new ImageIcon("src/tugas12/ig.png");
        label3.setBounds(20,110,400,50);
        label3.setIcon(icon2);
        label3.setHorizontalTextPosition(SwingConstants.LEFT);
        label3.setVerticalTextPosition(SwingConstants.CENTER);
        frame.add(label3);
        
        label4 = new JLabel("Label 4 : Label ini berupa icon di sebelah bawah teks");
        ImageIcon icon3=new ImageIcon("src/tugas12/fb.png");
        label4.setBounds(20,160,400,100);
        label4.setIcon(icon3);
        label4.setHorizontalTextPosition(SwingConstants.CENTER);
        label4.setVerticalTextPosition(SwingConstants.TOP);
        frame.add(label4);
        
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void mouseMoved(MouseEvent e){
    }
     public void mouseDragged(MouseEvent e) {
    }
    public static void main(String[]args){
        new Label();
    }
}
