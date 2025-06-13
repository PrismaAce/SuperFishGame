/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superfishgame;

import java.awt.*;
import javax.swing.*;
import superfishgame.Fish.*;

/**
 *
 * @author codem
 */
public class SuperFishView extends JFrame {
    public JButton fishButton = new JButton("Fish");
    public FishLabel lastCaught = new FishLabel(FishManager.FishMap.Map.get(1));
    BGPanel panel = new BGPanel();
    
    public SuperFishView()
    {
        // Panels
        
        JPanel buttonsPanel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));


        // Frame Data
        setTitle("Super Fish Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(panel.getDimensions()[0], panel.getDimensions()[1]);
        // Add Components
        buttonsPanel.add(fishButton);
        // Add Panels
        add(panel, BorderLayout.CENTER);
        add(buttonsPanel, BorderLayout.SOUTH);
        
        setVisible(true);
    }
    
    public void updateLastCaught(Fish fish)
    {
        panel.removeAll();
        panel.add(Box.createVerticalGlue()); // this is how we put it in the middle apparently idk
        panel.add(lastCaught);
        panel.add(Box.createVerticalGlue());

        lastCaught.setAlignmentX(Component.CENTER_ALIGNMENT);
        revalidate();
        repaint();
    }
}
