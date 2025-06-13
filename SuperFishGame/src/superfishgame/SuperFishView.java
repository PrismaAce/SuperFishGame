/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superfishgame;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author codem
 */
public class SuperFishView extends JFrame {
    public SuperFishView()
    {
        BGPanel panel = new BGPanel();
        setTitle("Math Quiz");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(panel.getDimensions()[0], panel.getDimensions()[1]);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }
}
