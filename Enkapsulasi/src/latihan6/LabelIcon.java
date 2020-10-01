/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan6;

/**
 *
 * @author user
 */
import javax.swing.*;
public class LabelIcon {
    private JLabel label;//membuat objek
    
    public LabelIcon(){
        JFrame frame = new JFrame();
        frame.setTitle("LABEL ICON");
        frame.setBounds(200,200,400,200);
        
        ImageIcon umpo = new ImageIcon("src/latihan6/umpoo.png");
        label = new JLabel();
        label.setBounds(25,25,375,100);
        label.setText("UNIVERSITAS MUHAMMADIYAH PONOROGO");
        label.setIcon(umpo);
        label.setHorizontalTextPosition(SwingConstants.LEFT);
        label.setVerticalTextPosition(SwingConstants.TOP);
        
        frame.add(label);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[]args){
        LabelIcon frame = new LabelIcon();
    }
}
