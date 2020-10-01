/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan8;

/**
 *
 * @author user
 */
import javax.swing.*;
import java.awt.event.*;

public class TryButton implements ActionListener{
    private JButton btnEvent;//membuat objek button
    public TryButton(){
        JFrame frame = new JFrame();
        frame.setBounds(200, 200, 300, 200);
        frame.setTitle("TRY BUTTON");
        
        btnEvent = new JButton("Button");
        frame.add(btnEvent);
        btnEvent.setBounds(50,50,175,50);
        
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btnEvent.addActionListener( this);//mendeteksi event pada button
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btnEvent){//jika tombol ditekan
            //aksi yang terjadi saat tombol ditekan
            JOptionPane.showMessageDialog(null,"Teks dalam tombol: "+ e.getActionCommand());
        }
    }
    
    public static void main (String[]args){
        TryButton frame = new TryButton();
    }
}
