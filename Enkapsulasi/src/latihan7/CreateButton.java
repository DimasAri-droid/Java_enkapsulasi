/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan7;

/**
 *
 * @author user
 */
import javax.swing.*;
public class CreateButton {
    public static void main(String[]args){
        JFrame frame = new JFrame();
        JButton btn = new JButton("TOMBOL");
        frame.setTitle("CREATE BUTTON");
        frame.setBounds(200, 300, 250, 125);
        frame.add(btn);
        btn.setBounds(25, 25, 100, 25);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
