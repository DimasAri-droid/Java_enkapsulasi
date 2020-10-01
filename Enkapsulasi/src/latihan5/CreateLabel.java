/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan5;

/**
 *
 * @author user
 */
import javax.swing.*;
public class CreateLabel {
    public static void main(String[]args){
    JFrame frame = new JFrame();
    frame.setTitle("CREATE LABEL");
    frame.setBounds(200,200,300,150);
    JLabel label = new JLabel("S1 PENDIDIKAN TEKNIK INFORMATIKA");
    label.setBounds(25, 25, 200, 25);
    frame.add(label);
    frame.setLayout(null);
    frame.setVisible(true);
    }
}
